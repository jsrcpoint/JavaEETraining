
public class Tax 
{
	double grossIncome; // class member variables
	String state;
	int dependents;
	static int customerCounter;
	
	//Constructor
	Tax(double gi, String st, int depen)
	{
		grossIncome = gi;
		state = st;
		dependents = depen;
		customerCounter++;
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	
	double calcTax()
	{
		return (grossIncome*0.33 - dependents*100);
	}
	
	static double convertToEUR(double usd)
	{
		return usd/1.36;
	}


}
