package Hoofdstuk6;

public class Goud{
//	getOunce method
	double getOunce(double prijs)
	{
//		value of an ounce
		double waarde = 1300.00;
		
//		Calculation, input price divided by the value of an ounce
		return prijs / waarde;
	}
	public static void main(String[] args)
	{
//		Making new input price
		Goud Goud = new Goud();
		
//		System output
		System.out.print(Goud.getOunce(7150.00) + "\n");
		System.out.print(Goud.getOunce(2600.00) + "\n");
		System.out.print(Goud.getOunce(5525.00) + "\n");
	}
}
//System output is: 5.5 - 2.0 - 4.25