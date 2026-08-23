public class XorArrayProblems {

    public static int singleNumber(int[] nums) {
        int check = 0;
        for (int n : nums) {
            check ^= n; 
        }
        return check;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int check = 0;

        for (int i = 0; i <= n; i++) {
            check ^= i;
        }
        for (int num : nums) {
            check ^= num;
        }
        return check;
    }
}
