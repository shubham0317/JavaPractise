import java.util.Arrays;
class Sort {

    public static void main(String[] args) {
	   int [] arr = {22,8,90,200,4};
	   
	   for (int i = 0; i < arr.length - 1; i++) {
		   for (int j = 0; j < arr.length - 1 - i; j++) {
	       if (arr[j] > arr[j + 1]) {
		    swap(j, j + 1, arr);
		   }
		   }
	   }
	   System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int a, int b, int []arr) {
	     int temp = arr[a];
		 arr[a] = arr[b];
		 arr[b] = temp;
	}

}