package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is" + today.getName());//o/p will be "today is saturday"
		
		switch(today) {
		case MONDAY:
			     System.out.println("Work hard");
			     break;
		case TUESDAY:
			      System.out.println("Work little");
			      break;
		case WEDNESDAY:
			       System.out.println("Work work little more");
			       break;
		case THURSDAY:
			       System.out.println("Work work more,WEEKEND IS AROUND SOON");
			       break;
		case FRIDAY:
			       System.out.println("yeah weekend has arrived ,party hard");
			       break;
		case SATURDAY:
			        System.out.println("Enjoy morning cofee, go shopping");
			        break;
		case SUNDAY:
			      System.out.println("DO ALL CLEANING WORKS");
			      break;
			
		     
		           
			
		}

	}

}
