package Hoofdstuk7;

public class TekstManipulatie{
	public static void main(String[] arg)
	{
//		The string
		String stringDemo = "Brazilië$ is een$ groot$ lan$d in Zuid$-Amerika.";
//		Sets whole string to uppercase
		System.out.print("Hoofdletters: 		" + stringDemo.toUpperCase() 	+ "\n");
//		Sets whole string to lowercase
		System.out.print("Kleine Letters:    	" + stringDemo.toLowerCase() 	+ "\n");
//		Counts characters in string
		System.out.print("Aantal Tekens:     	" + stringDemo.length() 		+ "\n");
//		Replaces $ with empty string
		System.out.print("Verwijder $:       	" + stringDemo.replace("$", "") + "\n");
//		Returns new string
		System.out.print("Verwijder eerste 10:	" + stringDemo.substring(10) 	+ "\n");
//		Gets Characters between 18-23
		System.out.print("Levert groot op:		" + stringDemo.substring(18,23) + "\n");
//		Gets place of last $
		System.out.print("Eerste $ symbool:     " + stringDemo.indexOf("$")	    + "\n");
//		Gets place of first $
		System.out.print("Laatste $ symbool:    " + stringDemo.lastIndexOf("$") + "\n");
//		Replaces whole string
		System.out.print(stringDemo.replace("Brazilië", "Argentinië"));
	}
}