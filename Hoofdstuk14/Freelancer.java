package Hoofdstuk14;

public class Freelancer implements Betaling{
	
//	New variables
	double uurloon;
	int urenGewerkt;
	
	public Freelancer(double Uurloon, int UrenGewerkt)
	{
//		Sets values Urengewerkt and uurloon
		this.urenGewerkt = UrenGewerkt;
		this.uurloon = Uurloon;
	}
	
	public void loonBerekenen()
	{
//		System output
		System.out.println(urenGewerkt*uurloon);
	}
}