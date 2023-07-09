import java.util.Scanner;

public class DateConTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateCon d1 = new DateCon();
		DateCon d2;
		System.out.println("Enter Day(dd) Month(mm) and Year(yyyy)");
		d2 = new DateCon(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Default Constructor");
		d1.display();
		System.out.println("Parameterised Constructor");
		d2.display();
		sc.close();
	}

}
