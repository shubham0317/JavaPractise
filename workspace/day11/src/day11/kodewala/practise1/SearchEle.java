package day11.kodewala.practise1;

import java.util.Scanner;

public class SearchEle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the " + (i + 1) + " element");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the target element");
		int target = sc.nextInt();

		System.out.println(binarySearch(arr, target));

	}

	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
