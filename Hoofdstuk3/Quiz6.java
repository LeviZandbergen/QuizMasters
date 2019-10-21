package Hoofdstuk3;

public class Quiz6{
	public static void main(String[] args) 
	{
		int i1 = 3;
		int i2 = 9;
		int i3 = 12;
		int x = 0;
		
		if(x > - 1)
		{
			x ++;
			if(i3 == ( i1 + i2))
			{
				x += 4;
//				Added new statement that checks if i1 is smaller than 5
				if(i1 < 5)
				{
//					Changes value of var x
					x += 2;
//					New system output
					System.out.print(x);
				}else if(i2 == 9)
				{
					x ++;
				}else {
					x -= 2;
				}
				x -= 6;
			}
			if(i3 < 10)
			{
				x += 7;
			}else
			{
				x += 5;
			}
		}
		System.out.print(x);
	}
}