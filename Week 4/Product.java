public class Product {

    private String code;
    private String name;
    private double unitPrice;
    private int quantity;
    private static int productCount = 0;

    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }
    public Product(String code, String name, double unitPrice, int quantity) {
        this.code = (code == null || code.isBlank()) ? "N/A" : code;
        this.name = (name == null || name.isBlank()) ? "Unnamed" : name;
        this.unitPrice = (unitPrice > 0) ? unitPrice : 1.0;
        this.quantity = (quantity >= 0) ? quantity : 0;
        productCount++;
    }
    public void restock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }
    public boolean sell(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            return true;
        }
        return false;
    }
    public double getInventoryValue() {
        return unitPrice * quantity;
    }
    public static int getProductCount() {
        return productCount;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public String toString() {
        return "Product{code='" + code + "', name='" + name +
               "', price=" + unitPrice + ", quantity=" + quantity +
               ", value=" + getInventoryValue() + "}";
    }
}
