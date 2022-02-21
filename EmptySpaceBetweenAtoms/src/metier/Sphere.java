package metier;

import java.lang.Math;

/**
 * @author Youssouf EL ALLIOUI
 *
 */
public class Sphere {

	private double R = 2;			// Radium of the sphere
	
	private double center_X;
	private double center_Y;
	private double center_Z;
	
	private double volum;
	
	// Constructors :
	public Sphere(double center_X, double center_Y, double center_Z, double R) {
		super();
		this.R = R;
		this.center_X = center_X;
		this.center_Y = center_Y;
		this.center_Z = center_Z;
		volum = 4/3 * Math.PI * Math.pow(R, 3);
	}
	
	public Sphere(double center_X, double center_Y, double center_Z) {
		super();
		this.center_X = center_X;
		this.center_Y = center_Y;
		this.center_Z = center_Z;
		volum = 4/3 * Math.PI * Math.pow(R, 3);
	}


	@Override
	public String toString() {
		return "Sphere [R : " + R + ",\tX : " + center_X + ",\tY : " + center_Y + 
				",\tZ : " + center_Z + ",\tV : " + volum + "]";
	}

	// Getters and Setters :
	public double getR() {
		return R;
	}

	public void setR(double R) {
		this.R = R;
	}

	public double getCenter_X() {
		return center_X;
	}

	public void setCenter_X(double center_X) {
		this.center_X = center_X;
	}

	public double getCenter_Y() {
		return center_Y;
	}

	public void setCenter_Y(double center_Y) {
		this.center_Y = center_Y;
	}

	public double getCenter_Z() {
		return center_Z;
	}

	public void setCenter_Z(double center_Z) {
		this.center_Z = center_Z;
	}

	public double getVolum() {		
		return volum;
	}	

}
