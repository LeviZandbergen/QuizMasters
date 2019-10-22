package Hoofdstuk4;

public class Quiz10{
	public static void main(String[] args)
	{
//		Changed statement
		for(int rij = 1; rij <= 5; rij ++)
		{
//			Added statement that checks if var rij is equal to 2 or 4 or 5
			if(rij == 2 || rij == 4 || rij == 5)
			{
				for(int kol = 1; kol < 4; kol ++)
				{
					System.out.print(rij + "," + kol + " ");
				}
			}
		}
	}
}