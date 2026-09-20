package college.util;

public class TextUtils {

    private static int count = 0;

    private TextUtils() {
    }

    public static String normalizeName(String name) {

        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        name = name.trim();

        if (name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        StringBuilder sb = new StringBuilder();

        boolean space = false;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (ch == ' ') {

                if (!space) {
                    sb.append(' ');
                    space = true;
                }

            } else {

                sb.append(ch);
                space = false;
            }
        }

        boolean newWord = true;

        for (int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);

            if (ch == ' ') {
                newWord = true;
            } else if (newWord) {
                sb.setCharAt(i, Character.toUpperCase(ch));
                newWord = false;
            } else {
                sb.setCharAt(i, Character.toLowerCase(ch));
            }
        }

        count++;

        return sb.toString();
    }

    public static int getNormalizationCount() {
        return count;
    }
}