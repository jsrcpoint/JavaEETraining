
public class TestTax 
{
	public static void main(String[] args)
	{
		double grossIncome; //local variable
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NJ";
		
		Tax t = new Tax(grossIncome, state, dependents); //customer #1
		Tax t2 = new Tax(65000, "TX", 4); //customer #2
		
		double yourTax = t.calcTax(); //calculation tax in USD
		double yourTaxInEUR = Tax.convertToEUR(yourTax); //calculation tax in EUR
		double hisTax = t2.calcTax(); //calculation tax in USD
		double hisTaxInEUR = Tax.convertToEUR(hisTax); //calculation tax in EUR
			
		//Printing the result
		System.out.printf("customer #1, Your tax in USD are %2.2f\n", yourTax);
		System.out.printf("customer #1, Your tax in EUR are %2.2f\n", yourTaxInEUR);
		System.out.printf("customer #2, Your tax in USD are %2.2f\n", hisTax);
		System.out.printf("customer #2, Your tax in EUR are %2.2f\n", hisTaxInEUR);
	}
}