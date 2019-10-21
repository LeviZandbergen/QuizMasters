package Hoofdstuk2;

public class Quiz5{
	public static void main(String[] args) {
//		Changed boolean to false;
		boolean isDefect = false;
//		Changed value of var x to 1
		int x = 1;
		int y = 7;
		int z = 9;
		if(x < y && x > 1)
		{
			System.out.print("N");
		}
		if(z > y || x > y)
		{
			System.out.print("O");
		}
		if( ! isDefect)
		{
			System.out.print("P");
		}
	}
}
