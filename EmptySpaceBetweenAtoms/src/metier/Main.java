package metier;

public class Main {	
	
	String path = "C:\\Users\\yelal\\eclipse-workspace-java\\EmptySpaceBetweenAtoms\\src\\files\\test.txt";
	String splitter = "\t";
	
	
	public Main() {
				
		ScopeVolum scopeVolum = new ScopeVolum(0, 0, 0, 5);
		
		System.out.println("ScopeVolum \t: " + scopeVolum.getVolum());
		
		IntersectionScopeAtoms isa = new IntersectionScopeAtoms(scopeVolum, path, splitter);
		
		isa.atomsLoading();
		
		System.out.println("Intersection volum \t: " + isa.intersectionVolume());
		
		System.out.println("Espace \t: " + isa.emptyVolum());
	}

	public static void main(String[] args) {
		new Main();
		
	}

}
