import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Insertion Sort");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of elements:");
	
		int n = sc.nextInt();
		
		System.out.println("\n\nStart Entering the numbers:\n");
		 
		int [] a = new int[n];
		
		for(int i = 0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		
        for(int i = 1;i<n;i++){
            int temp = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        
        
	    System.out.println("\n\n\nElements after Selection sort:\n");
		for(int i = 0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
