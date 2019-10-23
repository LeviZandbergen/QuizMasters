package Hoofdstuk8.kalender;

public class Datum{
//	New private variables
	private int dag;
	private int maand;
	private int jaar;
	
//	Constructor for date format
	public String datumFormaat (int dag, int maand, int jaar)
	{		
//		Date format
		String formaat = Integer.toString(dag) + "-" + Integer.toString(maand) + "-" + Integer.toString(jaar);
//		Return
		return(formaat);
	}
}