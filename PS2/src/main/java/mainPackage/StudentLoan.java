package mainPackage;
import java.util.Scanner;

public class StudentLoan {
	
	private double tuitionCost;
	private double tuitionIncrease;
	private double APR;
	private int numYears;

	public double getTuitionCost() {
		return tuitionCost;
	}
	
	public void setTuitionCost() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the initial cost of tuition at your college: ");
		this.tuitionCost = input.nextDouble();
		input.close();
	}
	
	public double getTuitionIncrease() {
		return tuitionIncrease;
	}
	
	public void setTuitionIncrease() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the percentage tuition increases each year: ");
		this.tuitionIncrease = input.nextDouble();
		input.close();
	}
	
	public double getAPR() {
		return APR;
	}
	
	public void setAPR() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your loan repayment APR: ");
		APR = input.nextDouble();
		input.close();
	}
	
	public int getNumYears() {
		return numYears;
	}
	
	public void setNumYears() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of years you plan to repay your loans: ");
		this.numYears = input.nextInt();
		input.close();
	}
	
	//public double totalOwed(double tuitionCost, double tuitionIncrease)
	
	public double monthlyRepayment(double APR, double numYears){
		return(5);
	}
	
	
}
