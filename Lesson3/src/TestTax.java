
public class TestTax 
{
	public static void main(String[] args)
	{
		NJTax njt = new NJTax();
		njt.grossIncome = 50000;
		njt.dependents = 2;
		njt.state = "NJ";
		
		double yourTax = njt.calcTax(); //calculation tax
		double totalTax = njt.adjustForStudents(yourTax);
		
		//Printing the result
		System.out.println("Your tax is " + totalTax);
	}
}
