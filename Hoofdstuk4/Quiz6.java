package Hoofdstuk4;

public class Quiz6{
	public static void main(String[] args)
	{
		int x = 1;
//		Changed statement
		for(int i = 3 ; i < 13; i += 5)
		{
			x += i;
		}
		
		x -= 2;
		System.out.print(x);
	}
}
//Q1 System output is 10