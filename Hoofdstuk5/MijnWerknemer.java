package Hoofdstuk5;

// MijnWerkenemer with constructor
public class MijnWerknemer{
	
//	New Variables
	String naam = "";
	double salaris = 2400.55;
	String land = "Nederland";
	
//	The constructor
	MijnWerknemer(String naam, double salaris, String land)
	{
		
//		Getting variables
		this.naam = naam;
		this.salaris = salaris;
		this.land = land;
		
//		System output
		System.out.print("-------- Werknemers --------" + "\n");
		System.out.print("Naam: 		" + this.naam + "\n");
		System.out.print("Salaris:     	€ " + this.salaris + "\n");
		System.out.print("Land: 		" + this.land + "\n");
		System.out.print("---------");
	}
	public static void main(String[] args)
	{
//		Setting variables
		new MijnWerknemer("Sofia", 3100.45, "België");
		new MijnWerknemer("Daniel", 2400.55, "Nederland");
	}
}