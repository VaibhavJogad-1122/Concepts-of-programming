import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		System.out.println("Enter Day(dd) Month(mm) and Year(yyyy)");
		d1.acceptDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
		d1.display();
		sc.close();
	}

}
