import java.util.Scanner;

public class PersonTester {

	public static void main(String[] args) {
		Person p1 = new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name, Age and City");
		p1.setName(sc.next());
		p1.setAge(sc.nextInt());
		p1.setCity(sc.next());
		System.out.println("Your Details: ");
		System.out.println("Name: "+p1.getName());
		System.out.println("Age: "+p1.getAge());
		System.out.println("City: "+p1.getCity());
	}

}
