import java.util.Scanner;
class BinarySearch {
  
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of the array");
  int size = sc.nextInt();
  int [] arr = new int[size];
  for (int i = 0; i < arr.length; i++) {
  System.out.println("Enter the " + (i + 1) + " Element");
    arr[i] = sc.nextInt();
  }
  
  System.out.println("For Doing Binary Search The array should be sorted in one order so first we will check if not sorted we will sort");
  
  for (int k = 0; k < arr.length - 1; k++) {
    if(arr[k] > arr[k + 1]){
	for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - 1 - i;j++) {
	  if (arr[j] > arr[j + 1]){
	    int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;
	  }
	}
  }
	}
  }
  
  System.out.println("Enter the Target Element ");
  int target = sc.nextInt();
  
  int start = 0;
  int end = arr.length - 1;
  
  while(start <= end) {
   int mid =  start + (end - start) / 2;
   
   if (arr[mid] == target) {
     System.out.println("The Index of Target Element is " + mid);
	 return;
   }else if(arr[mid] > target) {
      end = mid - 1;
   } else {
    start = mid + 1;
   }
  }
  
  System.out.println("Target is not in the Array");
  
  
  }
  
}