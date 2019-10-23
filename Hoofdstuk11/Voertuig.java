package Hoofdstuk11;

public class Voertuig {
	
//	New variables
	String Merk;
	int Bouwjaar;
	String Kleur;
	
//	New constructor
	public Voertuig(String Merk, int Bouwjaar, String Kleur)
	{
//		Sets variables
		this.Merk = Merk;
		this.Bouwjaar = Bouwjaar;
		this.Kleur = Kleur;
	}
	
	public void print()
	{
//		System output
		System.out.print("Merk: 	" + Merk + "\n" + "Bouwjaar: 	" + Bouwjaar + "\n" + "Kleur: 	" + Kleur);
	}
}