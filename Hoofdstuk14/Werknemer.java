package Hoofdstuk14;

public class Werknemer implements Betaling{
//	New variable
	double loon;
	
	public Werknemer(double loon)
	{
//		Sets value of loon
		this.loon = loon;
	}
	
	public void loonBerekenen()
	{
//		Calculates loon
		loon = loon * 0.7;
		
//		System output
		System.out.println(loon);
	}
}