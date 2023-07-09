public class DateCon{

	private int day, month,year; 
	public DateCon() {
		day = 21;
		month = 3;
		year = 2023;
	}
	public DateCon(int day, int month, int year) {
		this.day = day; 
		this.month = month; 
		this.year = year;
	}
	public void display() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
