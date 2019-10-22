package Hoofdstuk4;

public class Quiz8{
	public static void main(String[] args)
	{
//		Changed value of var x to 14
		int x = 14;
//		Changed value of var y to 5
		int y = 5;
		for(int i = 0; i < 10; i ++)
		{
			x += 2;
			y += 5;
			
			if(x >= 21)
			{
//				Removed break
//				break;
			}
		}
		System.out.print(y);
	}
}
//Q1 System output is 25
//Q2 System output is 55