public class ArrayPointerProblems {

    public static int richestCustomerWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
    public static int removeElement(int[] nums, int target) {
        int write = 0;
        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != target) {
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
    public static void printArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
