import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int size_3; 
		int arr1[],arr2[],arr3[];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array");
		int size_1 = sc.nextInt();
		
		System.out.println("Enter size of second array");
		int size_2 = sc.nextInt();
		size_3 = size_1+size_2;
		
		arr1 = new int[size_1];
		arr2 = new int[size_2];
		arr3 = new int[size_3];
		
		System.out.println("Enter elements of array 1");
		for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements of array 2");
		for(int i=0;i<arr2.length;i++) {
		arr2[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		
		int j=arr1.length;
		
		for(int no:arr2) {
			arr3[j]=no;
			j++;
		}
		System.out.println("Combined Array");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		sc.close();
		
	}

}
