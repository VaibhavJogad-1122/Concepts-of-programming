public class Date {

	private int day, month,year; 
	public void acceptDate(int dd, int mm, int yy) {
		day = dd; 
		month = mm; 
		year = yy;
	}
	public void display() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
