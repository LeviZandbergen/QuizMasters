package Hoofdstuk8.gegevens;

import Hoofdstuk8.kalender.Datum;

public class Student{
	
//	Making date object
	Datum Datum;
	
//	New method creating a student
	String student(int dag, int maand, int jaar, String naam)
	{
//		New date
		Datum = new Datum();
		
//		Returns the students data correctly
		return("Naam:" + naam + "\n" + "Geboortedatum:" + Datum.datumFormaat(dag, maand, jaar));
	}
	
	public static void main(String[] args){
		
//		Creating new students
		Student Student = new Student();
		Student Student2 = new Student();
		
//		System output
		System.out.print("---Eerste Student---\n");
		System.out.print(Student.student(28,8,1998,"Emma"));
		System.out.print("\n---Tweede Student---\n");
		System.out.print(Student.student(13,9,1996,"David"));
	}
}