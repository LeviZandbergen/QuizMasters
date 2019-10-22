package Hoofdstuk4;

public class Quiz11{
	public static void main(String[] args)
	{
		outer:for(int rij = 1; rij < 4; rij ++)
		{
//			Added label 'inner'
			inner:for(int kol = 1; kol < 5; kol ++)
			{
				if(rij == 2 && kol == 3)
				{
//					Changed 'break outer' to 'break inner'
					break inner;
				}
				System.out.print(rij + "," + kol + " ");
			}
		}
	}
}
// System output is: 1,1 1,2 1,3 1,4 2,1 2,2 3,1 3,2 3,3 3,4 