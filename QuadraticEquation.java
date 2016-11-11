import java.util.Scanner;

public class QuadraticEquation extends Equation {
	
	public double[] solve(double...coefficients){
		double a, b, c, x1, x2, d;
		a = coefficients[0];
		b = coefficients[1];
		c = coefficients[2];
		d = b*b - 4*a*c;
		double[] x = new double[2];
		if(d > 0){
			x1 = (-b + Math.sqrt(d)) / (2*a);
			x2 = (-b - Math.sqrt(d)) / (2*a);
			x[0] = x1;
			x[1] = x2;

		}
		else if(d == 0){
			x1 = x2 = -b / (2*a);
			x[0] = x[1] = x1;
		}
		else throw new IllegalCoefficientExeption();
		return x;
	}
		//double x = -b / a;

	public void printSolution(double[] x){
		System.out.println("x1 = " + x[0]);
		System.out.println("x2 = " + x[1]);
	}
	
	public double[] getUserCoefficient(){
		double[] coefficient = new double[3];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		coefficient[0] = scan.nextDouble();
		System.out.print("Enter value of b: ");
		coefficient[1] = scan.nextDouble();
		System.out.print("Enter value of c: ");
		coefficient[2] = scan.nextDouble();
		return coefficient;
	}
	
}
