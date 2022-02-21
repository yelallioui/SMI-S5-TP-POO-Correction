package metier;

public class ScopeVolum extends Sphere {

	public ScopeVolum(double center_X, double center_Y, double center_Z, double R) {
		super(center_X, center_Y, center_Z, R);
		// TODO Auto-generated constructor stub
	}

	public ScopeVolum(double center_X, double center_Y, double center_Z) {
		super(center_X, center_Y, center_Z);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ScopeVolum [" + super.toString() + "]";
	}
}
