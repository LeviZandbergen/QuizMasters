package Hoofdstuk2;

public class Quiz8{
	public static void main(String[] args) 
	{
		int i1 = 22;
		int i2 = 17;
		int i3 = 30;
		
		i1 %= 6;
		i2 %= 5;
		i3 %= 6;
		
//		Changed values of variables
		i1 %= 3;
		i2 %= 7;
		
		System.out.print(i1 + ", ");
		System.out.print(i2 + ", ");
		System.out.print(i3);
	}
}