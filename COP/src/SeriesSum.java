import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		int n,sum;
		
		System.out.println("Enter Value of n");
		Scanner sc = new Scanner(System.in); 
		n = sc.nextInt();
		sum = n*(n+1)/2;
		System.out.println("Sum of series 1+2+3+...."+n+"="+sum);
		sc.close();
	}
}

