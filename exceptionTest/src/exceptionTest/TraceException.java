package exceptionTest;

public class TraceException {
	private double x;

	public TraceException(double x) {
		this.x = x;
	}
	
	public void methode1(double y) throws FirstException, SecondException {
		System.out.println("Debu de methode1 () ..");
		if (y == 0)
			throw new FirstException("parametre de m1 null");
		if (x * y < 0)
			throw new SecondException(x + " et " + y + " ont des signes opposes");
		x = x / y;
		System.out.println("Fin de methode1 () ..");
	}	
	
	public void methode2(double y) throws SecondException{
		System.out.println("Debu de methode2 () ..");
		try {
			System.out.println("Dans methode2 () avant appel de methode1 () ..");
			methode2(y);
			System.out.println("Dans methode2 () apres appel de methode1 () .."); 
		} 
		catch (SecondException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fin de methode2 () ..");
	}

	public static void main(String[] args) throws FirstException {
		System.out.println("Debut du main ..");
		TraceException te = new TraceException(Double.parseDouble(args[0]));
		te.methode2(Double.parseDouble(args[1]));
		System.out.println("x = " + te.getX());
		System.out.println("Fin du main ..");
	}

	public double getX() {
		return x;
	}	
}
