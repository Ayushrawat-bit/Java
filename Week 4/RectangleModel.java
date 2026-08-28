public class RectangleModel {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();        
        Rectangle r2 = new Rectangle(5);      
        Rectangle r3 = new Rectangle(4, 6);    

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        r3.scale(2);
        System.out.println("After scaling r3: " + r3);
    }
}
