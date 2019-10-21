package Hoofdstuk2;

public class Quiz3 {
	public static void main(String[] args) {
		int x = 4;
		int y = 6;
		
		x --;
		y ++;
//		New x++
		x ++;
		System.out.print(x + ", " + y);
//		New x++
		x ++;
	}
}
//The placement of x++ does matter, the script is read from top to bottom, so the first x ++ will add 1 before the calculation 