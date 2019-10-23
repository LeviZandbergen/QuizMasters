package Hoofdstuk11;

//Imports Voertuig
import Hoofdstuk11.Voertuig;

//Class with extends from Voertuig
public class Vrachtwagen extends Voertuig{

//	New variable
	double Lading;
	
//	Constructor
	public Vrachtwagen(String Merk, int Bouwjaar, String Kleur, double Lading)
	{
//		Sets variables from parent constructor
		super(Merk,Bouwjaar,Kleur);
		
//		Sets variable
		this.Lading = Lading;
	}
	
//	System output
	public void print()
	{
		System.out.print("\n---Vrachtwagen---\n");
//		System output from parent
		super.print();
		System.out.print("\n" + "Lading: 	" + Lading + "\n");
	}
}