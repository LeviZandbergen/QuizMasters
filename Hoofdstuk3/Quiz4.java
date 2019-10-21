package Hoofdstuk3;

public class Quiz4{
	public static void main(String[] args)
	{
		int a = 2;
		int b = 2;
		int x = 5;
		
//		Changed the statement
		if(a != b)
		{
			x ++;
//			New else-if statement that checks if b is bigger or equal to 1
		}else if(b >= 1) 
		{
			System.out.print('x');
		}else if(b == 2)
		{
			x += 2;
		}else
		{
			x += 3;
		}
		System.out.print(x);
	}
}