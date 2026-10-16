class SumArray {
    public static void main(String[] args) {
        short arr[] = {11, 12, 450, 55};
        short sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of Array: " + sum);
    }
}