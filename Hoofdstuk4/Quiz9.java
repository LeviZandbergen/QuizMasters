package Hoofdstuk4;

public class Quiz9{
	public static void main(String[] args)
	{
//		Changed value of var jaar to 2016
//		Changed value 2001 to 2040
		for(int jaar = 2016; jaar <= 2040; jaar ++)
		{
			if((jaar % 4 != 0))
			{
//				Removed continue
//				continue;
			}
			System.out.print(jaar + " ");
		}
	}
}