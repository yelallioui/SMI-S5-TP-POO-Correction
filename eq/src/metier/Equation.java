package metier;

public class Equation {
	
	double a, b, c;
	double x1, x2, delta;
	String solution;

	public Equation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String resoudre () {
		
		String s;
		
		if (a==0) {
			if (b==0) {
				if (c==0) {
					s = "S = R";
				}
				else {
					s = "S = Ensemble vide !";
				}
			}
			else {
				x1 = -c/b;
				s = "S = {" + x1 + "}";
			}
		}
		else {
			delta = b*b - 4*a*c;
			
			if (delta < 0) {
				s = "S = Ensemble vide !";
			}
			else if (delta==0) {
				x1 = -b/2*a;
				s = "S = {" + x1 + "}";
			}
			else {
				x1 = (-b - Math.sqrt(delta))/2*a;
				x2 = (-b + Math.sqrt(delta))/2*a;
				s = "S = {" + x1 + ", " + x2 + "}";
			}
		}
		
		return s;
	}

}
