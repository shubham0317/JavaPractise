package day25.kodewala.strings.practise;

public class MinSizeSumofArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 4, 3 };

		System.out.println(doOperation(arr , 7));
	}

	public static int doOperation(int[] arr, int target) {
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum >= target) {
					int length = j - i + 1;
					ans = Math.min(ans, length);
					break;
				}
			}
		}
		
		if(ans == Integer.MAX_VALUE) {
			return 0;
		} else {
			return ans;
		}
	}

}
