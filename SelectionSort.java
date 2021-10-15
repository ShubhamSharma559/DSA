import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Selection Sort");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of elements:");
	
		int n = sc.nextInt();
		
		System.out.println("\n\nStart Entering the numbers:\n");
		 
		int [] a = new int[n];
		
		for(int i = 0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		
		for(int i = 0;i<n-1;i++){
		    int min = i;
		    for(int j = i+1;j<n;j++){
		        if(a[j] < a[min]){
		            min = j;
		        }
		    }
		    if(min != i){
		        int temp = a[min];
		        a[min] = a[i];
		        a[i] = temp;
		    }
		}
	    System.out.println("\n\n\nElements after Selection sort:\n");
		for(int i = 0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
