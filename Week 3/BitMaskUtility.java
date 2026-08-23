public class BitMaskUtility {

    public static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }

    public static int setBit(int number, int position) {
        return number | (1 << position);
    }

    public static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }

    public static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }

    public static String toBinary32(int number) {
        String s = "";
        for (int i = 31; i >= 0; i--) {
            s += ((number >> i) & 1);
        }
        return s;
    }
}
