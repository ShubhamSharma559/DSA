import java.util.ArrayList;

class Main {
  void heapify(int a[], int n, int i) {
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < n && a[l] > a[largest])
      largest = l;
    if (r < n && a[r] > a[largest])
      largest = r;

    if (largest != i) {
      int temp = a[largest];
      a[largest] = a[i];
      a[i] = temp;

      heapify(a, n, largest);
    }
  }
  
  void buildheap(int a[], int n){
      for(int i = n/2; i>=0;i--){
          heapify(a, n, i);
      }
  }

  public static void main(String args[]) {
    int [] array = {20,10,30,5,50,40};
    int size = array.length;
    Main h = new Main();

    System.out.println("Max-Heap array: ");
    System.out.println("Elements before heapify: ");
    for(int i = 0;i<size;i++){
	    System.out.print(array[i]+" ");
    }
    h.buildheap(array, size);

    System.out.println("\n\n\nElements after heapify:\n");
	for(int i = 0;i<size;i++){
		System.out.print(array[i]+" ");
    }
  }
}
