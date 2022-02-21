package metier;

public class Atom extends Sphere {
	
	private double R = 2;	

	public Atom(double center_X, double center_Y, double center_Z, double R) {
		super(center_X, center_Y, center_Z, R);
		// TODO Auto-generated constructor stub
	}
	
	public Atom(double center_X, double center_Y, double center_Z) {
		super(center_X, center_Y, center_Z);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Atom [" + super.toString() + "]";
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}


}
