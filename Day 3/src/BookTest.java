
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book(); 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter book ID: ");
		b1.setId(sc.nextInt());
		System.out.print("Enter Book Name:");
		b1.setBookName(sc.next());
		System.out.print("Enter Author Name: ");
		b1.setAuthor(sc.next());
		System.out.print("Enter Price: ");
		b1.setPrice(sc.nextInt());
		System.out.println("Book Details: ");
		System.out.println("ID: "+b1.getId());
		System.out.println("Book Name: "+b1.getBookName());
		System.out.println("Book Author: "+b1.getAuthor());
		System.out.println("Book Price: "+b1.getPrice());
		b1.display();
		
		sc.close();
	}

}
