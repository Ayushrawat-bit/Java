public class NumberOfOneBits {

    public static int WeightShift(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1; 
        }
        return count;
    }
    public static int WeightFast(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); 
            count++;
        }
        return count;
    }
    public static String Binary(int n) {
        String s = "";
        for (int i = 31; i >= 0; i--) {
            s += ((n >> i) & 1);
        }
        return s;
    }
}
