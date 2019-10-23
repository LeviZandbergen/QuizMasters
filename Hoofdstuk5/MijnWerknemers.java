package Hoofdstuk5;

// MijnWerkenemer without constructor
public class MijnWerknemers{
	
//	New Variables
	String naam = "";
	double salaris = 2400.55;
	String land = "Nederland";
	
	public static void main(String[] args)
	{
//		Making new werknemers
		MijnWerknemers MijnWerknemers = new MijnWerknemers();
		MijnWerknemers MijnWerknemers2 = new MijnWerknemers();

//		Setting variables
		MijnWerknemers.naam = "Sofia";
		MijnWerknemers.salaris = 3100.45;
		MijnWerknemers.land = "België";
		MijnWerknemers2.naam = "Daniel";
		
//		System output
		System.out.print("-------- Werknemers --------" + "\n");
		System.out.print("Naam: 		" + MijnWerknemers.naam + "\n");
		System.out.print("Salaris:     	€ " + MijnWerknemers.salaris + "\n");
		System.out.print("Land: 		" + MijnWerknemers.land + "\n");
		System.out.print("---------------" + "\n");
		System.out.print("Naam: 		" + MijnWerknemers2.naam + "\n");
		System.out.print("Salaris:     	€ " + MijnWerknemers2.salaris + "\n");
		System.out.print("Land: 		" + MijnWerknemers2.land + "\n");
	}
}