package Hoofdstuk2;

public class Quiz6{
	public static void main(String[] args) {
//		Changed var isOud value to true
		boolean isOud = true;
		int x = 5;
		int y = 14;
//		Changed var z value to 17
		int z = 17;
		if(y > x && z > y && (x + 12) >= z)
		{
			System.out.print("P");
		}
		if(x >= 6 || z <= y || z <= 18)
		{
			System.out.print("Q");
		}
		if( ! isOud || y > z)
		{
			System.out.print("R");
		}
	}
}