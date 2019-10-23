package Hoofdstuk13;

//Import calendar from java API
import java.util.Calendar;

public class Calendars{
	public static void main(String[] args)
	{
//		getInstance() is used to get a calendar using the current time zone and locale of the system
//		getTime gets the current: Day, Month, Date, Time, Time-zone and Year
		System.out.print(Calendar.getInstance().getTime());
	}
}