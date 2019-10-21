package Hoofdstuk2;

public class Quiz4{
	public static void main(String[] args) {
//		Changed value of var x
		int x = 15;
		int y = 8;
		int z = 3;
		if(x == z) {
			System.out.print("N");
		}
		if(x >= y) {
			System.out.print("O");
//			Added new system output
			System.out.print("Z");
		}
		if(x <= z) {
			System.out.print("P");
		}
		if(z > y) {
			System.out.print("Q");
		}
		if(y != z) {
			System.out.print("R");
		}
	
	}
}