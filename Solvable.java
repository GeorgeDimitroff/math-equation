
public interface Solvable{
		
	public abstract double[] solve(double...coefficients) throws IllegalCoefficientExeption;
	public abstract void printSolution(double[] x);
}
	