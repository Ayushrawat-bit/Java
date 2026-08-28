public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Pen", 10.0);
        Product p2 = new Product("P002", "Notebook", 50.0, 20);
        Product p3 = new Product("P003", "Bag", 500.0, 5);

        p1.restock(15);
        p2.sell(5);
        p3.sell(10); 

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Total products created: " + Product.getProductCount());
    }
}
