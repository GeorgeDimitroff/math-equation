import java.util.Scanner;

public class LinearEquation extends Equation{
	
	private double[] x = new double[1];
	
	public double[] solve(double...coefficients){
		double a, b;
		a = coefficients[0];
		b = coefficients[1];
		//double[] x = new double[1];
		if(a != 0){
			x[0] = -b / a;
		}
		else throw new IllegalCoefficientExeption();
		return x;
	}
	public void printSolution(double[] x){
		System.out.println("x = " + x[0]);
	}
	
	public double[] getUserCoefficient(){
		double[] coefficient = new double[2];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		coefficient[0] = scan.nextDouble();
		System.out.print("Enter value of b: ");
		coefficient[1] = scan.nextDouble();
		return coefficient;
	}
	
}
