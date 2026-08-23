public class ArrayTransformations {
    public static void reverseInPlace(int[] values) {
        int left = 0;                  
        int right = values.length - 1; 
        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] reversedCopy(int[] values) {
        int[] copy = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            copy[i] = values[values.length - 1 - i]; 
        }
        return copy;
    }

    public static int removeValue(int[] values, int target) {
        int write = 0; 
        for (int read = 0; read < values.length; read++) {
            if (values[read] != target) {
                values[write] = values[read];
                write++;
            }
        }
        return write;
    }
    public static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            result[i] = sum;
        }
        return result;
    }
}
