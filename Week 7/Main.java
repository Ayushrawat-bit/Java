import college.util.TextUtils;

public class Main {

    public static void main(String[] args) {

        String name = TextUtils.normalizeName("   AyUsH     RaWat   ");

        System.out.println(name);
        System.out.println(TextUtils.getNormalizationCount());
    }
}
