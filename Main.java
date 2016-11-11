import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanNumber = new Scanner(System.in);
		System.out.println("1. Линейно уравнение");
		System.out.println("2. Квадратно уравнение");
		System.out.print("Изберете вида на уравнението: ");
		
		int number = scanNumber.nextInt();
		if(number == 1){
			Equation linearEq = new LinearEquation();
			double[] coef = linearEq.getUserCoefficient();
			double[] solution = linearEq.solve(coef); 
			linearEq.printSolution(solution);
		}
		else if(number == 2){
			Equation quadraticEq = new QuadraticEquation();
			double[] coef = quadraticEq.getUserCoefficient();//взима коеф
			double[] solution = quadraticEq.solve(coef);  //запазва корените в масив
			quadraticEq.printSolution(solution);
		}
		
		
	}

}
