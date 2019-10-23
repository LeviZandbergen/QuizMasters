package Hoofdstuk14;

public class Test {
    public static void main(String[] args)
    {
//    	create new object 'werknemer' with loon value of 3000
    	new Werknemer(3000).loonBerekenen();
//    	Create new object 'Freelancer' with uurloon value of 60 and UrenGewerkt value of 140
    	new Freelancer(60, 140).loonBerekenen();
    }
}