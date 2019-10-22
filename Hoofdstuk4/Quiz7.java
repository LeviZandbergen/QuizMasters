package Hoofdstuk4;

public class Quiz7{
	public static void main(String[] args)
	{
		char c = 'a';
		char c2 = 'b';
		for(int i = 4; i >= 0; i --)
		{
//			Changed statement
			if(i >= 2 || i == 4)
			{
				System.out.print(c2);
			}else
			{
				System.out.print(c);
			}
		}	
	}
}
//Q1 System output is bbbaa