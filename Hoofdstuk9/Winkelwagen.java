package Hoofdstuk9;

import java.util.ArrayList;

public class Winkelwagen{
//	Created ArrayList
	ArrayList<Artikel> Artikelen = new ArrayList<Artikel>();
	
//	Sets artikelen
	public static Artikel Artikel1 = new Artikel("Overhemd",10.39);
	public static Artikel Artikel2 = new Artikel("Broek", 32.85);
	public static Artikel Artikel3 = new Artikel("Sokken", 11.25);
	public static Artikel Artikel4 = new Artikel("Jas", 120.65);
	
//	Method to print all chosen artikelen
	public void printArtikelen()
	{
//		Chosen artikelen
		Artikelen.add(Artikel1);
		Artikelen.add(Artikel2);
		Artikelen.add(Artikel3);
		Artikelen.add(Artikel4);

//		Loops trough all the artikelen from ArrayList
		for(int i = 0; i < Artikelen.size(); i++) {
//			System output Artikelen the right way
			System.out.print(Artikelen.get(i).naam + "  " + " 		prijs 	  " + Artikelen.get(i).prijs + "\n");
		}
	}
	public static void main(String[] args)
	{
//		Calls the classes and methods
		Winkelwagen Winkelwagen = new Winkelwagen();
		Winkelwagen.printArtikelen();
	}
}