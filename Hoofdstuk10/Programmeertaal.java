package Hoofdstuk10;

public class Programmeertaal {
	
//	New variables
	public static int aantalTalen;
	public static String taal = "";
	
	public Programmeertaal(String talen)
	{
//	Adds every new 'taal' to string
	taal += talen + "\n";
	
//	Add one to taal amount
	aantalTalen++;
	}
	
	public static void main(String[] arg)
	{
//		New 'Programmeertaal' objects
		new Programmeertaal("Java");
		new Programmeertaal("C++");
		new Programmeertaal("Python");
		new Programmeertaal("PHP");
		new Programmeertaal("Ruby");
		
//		System output
		System.out.print(taal + "\n" + "Aantal talen " + aantalTalen);
	}
}