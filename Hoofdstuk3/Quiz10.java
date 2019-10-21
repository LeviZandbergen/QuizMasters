package Hoofdstuk3;

public class Quiz10{
	public static void main(String[] args)
	{
		char resultaat = 'D';
		switch(resultaat)
		{
		case 'A':
			System.out.print("Uitstekend! ");
				break;
		case 'B':
			System.out.print("Zeer goed ");
				break;
//		Added case to C
		case 'C':
			System.out.print("Goed ");
				break;
//		Added new case output
		case 'D':
//			New system output
			System.out.print("Redelijk");
				break;
		case 'E':
			System.out.print("Probeer het opnieuw ");
				break;
		default:
			System.out.print("Ongeldig ");
		}
	}
}
//Q3 The output will be "Ongeldig "