import java.util.Scanner;

public class PrimeNums {
	 public static void main(String[] args) {
	        int i, j, n;
	        boolean isPrime=true;
	        System.out.println("Enter value of n: ");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        System.out.println("Prime number from 1 to "+n);
	        
	        for (i = 2; i <= n; i++) {
	            isPrime = true;
	            for (j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	 
	            if (isPrime)
	                System.out.print(i + " ");
	        }
	 sc.close();
	    }
	}

