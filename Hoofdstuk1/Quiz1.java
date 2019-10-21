package Hoofdstuk1;

public class Quiz1 {

//	var isGetrouwd is boolean
	static boolean isGetrouwd;
//	var isBuitenlander is boolean
	static boolean isBuitenlander = true;
	
	public static void main(String[] args) {
//		nieuw aangemaakte variablen met waarden
		int leeftijd = 45;
		long bankrekening = 298888888;
		double loon = 124.89;
		char geslacht = 'm';
		
//		systeem output
		System.out.print(leeftijd + ", "); 
		System.out.print(bankrekening + ", ");
		System.out.print(loon + ", ");
		System.out.print(isGetrouwd + ", ");
		System.out.print(isBuitenlander + ", ");
		System.out.print(geslacht);
	}
}
