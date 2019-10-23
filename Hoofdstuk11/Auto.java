package Hoofdstuk11;

//Imports Voertuig
import Hoofdstuk11.Voertuig;

//Class with extends from Voertuig
public class Auto extends Voertuig {

//	New variable
	int maxPassagiers;
	
//	Constructor
	public Auto(String Merk, int Bouwjaar, String Kleur, int MaxPassagiers)
	{
//		Sets variables from parent constructor
		super(Merk,Bouwjaar,Kleur);
		
//		Sets variable
		this.maxPassagiers = MaxPassagiers;
	}
	
//	System output
	public void print()
	{
		System.out.print("\n---Auto---\n");
//		System output from parent
		super.print();
		System.out.print("\n Passagiers: 	" + maxPassagiers + "\n");
	}
}