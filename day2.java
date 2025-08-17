public class MissingNumberFinder {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Since one number is missing
        int total = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return total - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int missing = findMissingNumber(arr);
        System.out.println("Missing number: " + missing);
    }
}
