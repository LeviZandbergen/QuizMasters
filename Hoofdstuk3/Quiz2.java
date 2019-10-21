package Hoofdstuk3;

public class Quiz2{
	public static void main(String[] args)
	{
		int a = 3;
		int b = 1;
		int x = 0;
		
		if(a > b)
		{
			x ++;
			if(a > x)
			{
				x += 5;
			}
			x -= 4;
		}
		if (b == a)
		{
			x += 2;
			if(x < b)
			{
				x += 3;
			}
		}
		System.out.print(x);
//		Added statement that checks if a is smaller or has the same value as 4
		if(a <= 4)
		{
//			New System output
			System.out.print("2G");
		}
	}
}