package Hoofdstuk3;

public class Quiz3{
	public static void main(String[] args) 
	{
		char c1 = 'g';
		char c2 = 'h';
		
		if (c1 == 'k')
		{
			System.out.print('w');
		}
		if (c2 == 'h')
		{
			System.out.print('x');
			System.out.print('p');
		}
		if(c1 != c2)
		{
			System.out.print('y');
		}else
		{
			System.out.print('z');
		}
//		Added new condition when c1 is equal to d print 'w' otherwise print 'z'
		if(c1 == 'd')
		{
//			New system output
			System.out.print('w');
		}else
		{
//			New system output
			System.out.print('z');
		}
	}
}