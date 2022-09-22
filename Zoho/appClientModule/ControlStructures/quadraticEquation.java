package ControlStructures;

import java.util.*;

/* solve quadratic equations*/

public class quadraticEquation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the Coefficient of X^2");
		double a = scan.nextDouble();
		System.out.println("please enter the Coefficient of X");
		double b = scan.nextDouble();
		System.out.println("please enter the Constant of the equation");
		double c = scan.nextDouble();

		System.out.println("our Quadratic equation is " + a+"x^2 "
				+ ""+b+"x +"+c);

		solve(a,b,c);

	}

	private static void solve(double a, double b, double c) {

		double insideSol = (b*b)-(4*a*c);
		double imagine = 0;



		if (insideSol<0) {

			insideSol = -1*(insideSol);

			imagine = squareRoot(insideSol)/(2*a);
			double balance = (-b/(2*a));

			System.out.println(balance + "+i"+imagine);
			System.out.println(balance + "-i"+imagine);
		}
		else if (insideSol == 0) {
			System.out.println("Roots are real & same");
			System.out.println("x =" + (-b/(2*a)));
			System.out.println("x =" + (-b/(2*a)));
		}
		else {

			imagine = squareRoot(insideSol);
			double numerator1 = -b+imagine;
			System.out.println("x =" + numerator1/(2*a));
			double	numerator2 = -b-imagine;
			System.out.println("x =" + numerator2/(2*a));
		}

	}

	public static double squareRoot(double num)   {  
		
		//temporary variable  
		
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
			t=sqrtroot;  
			sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		
		return sqrtroot;  
	}  
}
