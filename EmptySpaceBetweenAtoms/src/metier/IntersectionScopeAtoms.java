package metier;

import javax.swing.DefaultListModel;

import java.lang.Math;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class IntersectionScopeAtoms {
	
	ScopeVolum scopeVolum;
	String atomsFilePath;
	String splitter;
	
	File file;
	FileReader fileReader;
	BufferedReader bufferedReader;
	
	DefaultListModel<Atom> atomsList = new DefaultListModel<Atom>();
	DefaultListModel<Atom> atomsInsideScopeList = new DefaultListModel<Atom>();
	DefaultListModel<Atom> atomsOutsideScopeList = new DefaultListModel<Atom>();
	DefaultListModel<Atom> atomsWithIntersectionList = new DefaultListModel<Atom>();
	
	DefaultListModel<Intersection> intersectionsList = new DefaultListModel<Intersection>();	
	
	// Constructor :
	public IntersectionScopeAtoms(ScopeVolum scopeVolum, String atomsFilePath, String splitter) {
		this.scopeVolum = scopeVolum;
		this.atomsFilePath = atomsFilePath;
		this.splitter = splitter;
	}

	void atomsLoading () {
		System.out.println("Debut atomsLoading ..");
		String inputLine;
		
		file = new File(atomsFilePath);		
		
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			while((inputLine=bufferedReader.readLine())!=null) {
				String t[] = inputLine.split(splitter);
				Atom atom = new Atom(Double.valueOf(t[0]), Double.valueOf(t[1]), Double.valueOf(t[2]));
				atomsList.addElement(atom);
				atomClassifying (atom);
				
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Problem : File doesn't exist !");
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("Problem : bufferedReader Creation !");
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			System.out.println("Problem : Casting String to double !");
		}
		finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Problem : Closed file !");
				e.printStackTrace();
			}	
		}
		System.out.println("Fin atomsLoading ..");		
		//-----------
		//System.out.println("Fin atomsClassifying ..");
		System.out.println("------------ STATISTIC ------------");
		System.out.println("atomsWithIntersectionList \t: " + atomsWithIntersectionList.size());
		System.out.println("intersectionsList \t: " + intersectionsList.size());
		System.out.println("atomsInsideScopeList \t: " + atomsInsideScopeList.size());
		System.out.println("atomsOutsideScopeList \t: " + atomsOutsideScopeList.size());
		System.out.println("Atoms number \t\t: " + atomsList.size());
		System.out.println("-----------------------------------");
		//-----------
	}

	void atomClassifying (Atom atom) {
		//System.out.println("Debut atomsClassifying ..");
		
			double distance = Math.sqrt(Math.pow(scopeVolum.getCenter_X() + atom.getCenter_X(), 2) + Math.pow(scopeVolum.getCenter_Y() + atom.getCenter_Y(), 2) + Math.pow(scopeVolum.getCenter_Z() + atom.getCenter_Z(), 2));
						
			System.out.println(atom.toString());
			
			// Condition for intersection :
			if((distance < scopeVolum.getR() + atom.getR()) && (distance > Math.abs(scopeVolum.getR() - atom.getR()))) {
				Intersection intersection = new Intersection();
				intersection.setDistanceAtomScopeVolum(distance);				
				intersection.setAlphaScopeVolumAngle (Math.acos( (Math.pow(scopeVolum.getR(), 2) + Math.pow(distance, 2) - Math.pow(atom.getR(), 2)) / (2 * scopeVolum.getR() * distance)));
				intersection.setThetaAtomAngle (Math.acos((Math.pow(atom.getR(), 2) + Math.pow(distance, 2) - Math.pow(scopeVolum.getR(), 2)) / (2 * atom.getR() * distance)));
				
				intersection.setH(scopeVolum.getR() * Math.sin(intersection.getAlphaScopeVolumAngle()));
				
				intersection.setH1(scopeVolum.getR() * (1 - Math.cos(intersection.getAlphaScopeVolumAngle())));
				
				intersection.setH2(atom.getR() * (1 - Math.cos(intersection.getThetaAtomAngle())));
				
				// The volum of the lapping area which containes the two spherical caps :
				intersection.setV(
							(Math.PI /3) * 
							(	// Volum of the atom cap
								3 * scopeVolum.getR() 	* Math.pow(intersection.getH1(), 2) - 
								Math.pow(intersection.getH1(), 3) +		
								// Volum of the scopeVolum cap
								3 * atom.getR() 		* Math.pow(intersection.getH2(), 2) - 
								Math.pow(intersection.getH2(), 3)
							)
						);
				
				System.out.println(intersection.toString());
				
				atomsWithIntersectionList.addElement(atom);
				intersectionsList.addElement(intersection);
			}
			// Condition for atom inside the ScopeVolum :
			else if (distance <= Math.abs(scopeVolum.getR() - atom.getR())) {
				atomsInsideScopeList.addElement(atom);
			}
			else {
				atomsOutsideScopeList.addElement(atom);
			}		
		
	}
	
	double insideVolume() {
		// System.out.println("Debut insideVolume ..");
		double volum = 0;
		if(atomsInsideScopeList.size() < 0) 
			return 0;
		else {
			for(int i=0; i < atomsInsideScopeList.size(); i++) {
				volum = volum + atomsInsideScopeList.get(i).getVolum();
			}
			return volum;
		}
	}
	
	double intersectionVolume() {
		// System.out.println("Debut intersectionVolume ..");
		double volum = 0;
		if(atomsWithIntersectionList.size()<0) {
			return 0;
		}
		else {
			for(int i=0; i < intersectionsList.size(); i++) {
				volum = volum + intersectionsList.get(i).getV();				
			}
			return volum;
		}
	}
	
	double emptyVolum() {
		// System.out.println("Debut emptyVolum ..");
		double volum;
		volum = scopeVolum.getVolum() - insideVolume() - intersectionVolume();
		return volum;
	}

}
