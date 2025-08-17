public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        // Phase 1: Finding the intersection point in the cycle
        int slow = nums[0];
        int fast = nums;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle (duplicate number)
        fast = nums;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate number: " + duplicate);
    }
}
