package Hoofdstuk1;

public class Quiz4 {
	static int i1 = 7;
	static int i2 = 12;
	
	public static void main(String[] args) {
//		Nieuwe waardes voor i1 & i2
		i1 = 9;
		i2 = 8;
		
		i1 = i1 - 3;
		i2 = i2 + i1;
		
		System.out.print(i1 + ", ");
		System.out.print(i2 + ", ");
		
	}
}
