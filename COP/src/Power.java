import java.util.Scanner;

public class Power {
	public static void main(String[] args)
	{
		int m,n,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number and Power: ");
		m = sc.nextInt();
		n = sc.nextInt();
		c=m;
		for(int i=0;i<n-1;i++) {
		m=m*c;
		}
		System.out.println("Result:"+m);
		sc.close();
	}
}
