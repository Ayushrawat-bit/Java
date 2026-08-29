public class TextProfile {

    static class Profile {
        private String name;
        private int age;
        private double heightMetres;

        public Profile(String name, int age, double heightMetres) {
            if (name == null || name.isBlank()) {
                this.name = "Unnamed";
            } else {
                this.name = name;
            }
            this.age = (age >= 0) ? age : 0;
            this.heightMetres = (heightMetres > 0) ? heightMetres : 1.0;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getHeightMetres() {
            return heightMetres;
        }

        public String toString() {
            return "Profile{name='" + name + "', age=" + age +
                   ", height=" + heightMetres + "m}";
        }
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java TextProfile <name> <ageText> <heightText>");
            return;
        }
        String nameText = args[0];
        int age = Integer.parseInt(args[1]);
        double height = Double.parseDouble(args[2]);

        Profile p = new Profile(nameText, age, height);

        System.out.println(p);

        String ageText = Integer.toString(p.getAge());
        String heightText = String.valueOf(p.getHeightMetres());
        System.out.println("Age as text: " + ageText);
        System.out.println("Height as text: " + heightText);
    }
}
