public class Sort012 {
    public static void sortArray(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                    
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    // Swap arr[mid] and arr[high]
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0,2};
        
        sortArray(arr);
        
        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
