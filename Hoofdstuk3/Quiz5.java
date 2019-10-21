package Hoofdstuk3;

public class Quiz5{
	public static void main(String[] args)
	{
		int i = 1;
		int i2 = 4;
		int x = 2;
		
		if(i == (i2 -3) && i2 > 5)
		{
			x ++;
//		Added new statement to check if i + i2 is equal to 5
		}else if(i + i2 == 5)
		{
//			Added new system output
			System.out.print("D");
		}else if(i2 == 4)
		{
			x += 2;
		}else if(i2 > 3)
		{
			x += 3;
		}else
		{
			x += 4;
		}

		System.out.print(x);
	}
}