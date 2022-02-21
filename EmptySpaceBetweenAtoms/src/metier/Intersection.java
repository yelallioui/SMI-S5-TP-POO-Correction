package metier;

public class Intersection {
	
	// Distance between centers (between ScopeVolum and each Atom) :
	private double distanceAtomScopeVolum;
	
	//Angles alpha and theta :
	private double alphaScopeVolumAngle, thetaAtomAngle; 
	
	// Intersection circle radius (between ScopeVolum and each Atom) :
	private double h;
	
	// Height of the spherical cap of ScopeVolum :
	private double h1;
	
	// Height of the spherical cap of each Atom :
	private double h2;
	
	// The volum of the lapping area which containes the tow spherical caps :
	private double v;


	public double getDistanceAtomScopeVolum() {
		return distanceAtomScopeVolum;
	}
	
	


	@Override
	public String toString() {
		return "Intersection [distance : " + distanceAtomScopeVolum + ", \tAlpha : "
				+ alphaScopeVolumAngle*180/Math.PI + ", \tTheta : " + thetaAtomAngle*180/Math.PI 
				+ ", \tH : " + h + ", \tH1 : " + h1 + ", \tH2 : " + h2
				+ ", \tV : " + v + "]";
	}




	public void setDistanceAtomScopeVolum(double distanceAtomScopeVolum) {
		this.distanceAtomScopeVolum = distanceAtomScopeVolum;
	}


	public double getAlphaScopeVolumAngle() {
		return alphaScopeVolumAngle;
	}


	public void setAlphaScopeVolumAngle(double alphaScopeVolumAngle) {
		this.alphaScopeVolumAngle = alphaScopeVolumAngle;
	}


	public double getThetaAtomAngle() {
		return thetaAtomAngle;
	}


	public void setThetaAtomAngle(double thetaAtomAngle) {
		this.thetaAtomAngle = thetaAtomAngle;
	}


	public double getH() {
		return h;
	}


	public void setH(double h) {
		this.h = h;
	}


	public double getH1() {
		return h1;
	}


	public void setH1(double h1) {
		this.h1 = h1;
	}


	public double getH2() {
		return h2;
	}


	public void setH2(double h2) {
		this.h2 = h2;
	}


	public double getV() {
		return v;
	}


	public void setV(double v) {
		this.v = v;
	}

	// Constructors :
	public Intersection() {
		
	}


	public Intersection(double distanceAtomScopeVolum, double alphaScopeVolumAngle, double thetaAtomAngle, double h,
			double h1, double h2, double v) {
		super();
		this.distanceAtomScopeVolum = distanceAtomScopeVolum;
		this.alphaScopeVolumAngle = alphaScopeVolumAngle;
		this.thetaAtomAngle = thetaAtomAngle;
		this.h = h;
		this.h1 = h1;
		this.h2 = h2;
		this.v = v;
	}

}
