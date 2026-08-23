public class BitFundamentals {

    public static boolean isOdd(int number) {
        return (number & 1) != 0;
    }

    public static int countSetBitsShift(int number) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((number & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }

    public static int countSetBitsFast(int number) {
        int count = 0;
        while (number != 0) {
            number = number & (number - 1); 
            count++;
        }
        return count;
    }

    public static boolean isPowerOfTwo(int number) {
        return number > 0 && (number & (number - 1)) == 0;
    }

    public static String toBinary32(int number) {
        String s = "";
        for (int i = 31; i >= 0; i--) {
            s += ((number >> i) & 1);
        }
        return s;
    }
}
