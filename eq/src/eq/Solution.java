//============================================================================
// Name        : cpp.cpp
// Author      : Youssouf EL ALLIOUI
// Version     : 01
// Copyright   : (c) Your copyright notice
// Description : R�solution d'une �quation du second degr�
//============================================================================
package eq;
import metier.Equation;
public class Solution {	
	Equation e;
	int p;
	public Solution() {
		e = new Equation(0, 3, 0);
		System.out.print(e.resoudre());
	}
	public static void main(String[] args) {
		new Solution();
	}
}
