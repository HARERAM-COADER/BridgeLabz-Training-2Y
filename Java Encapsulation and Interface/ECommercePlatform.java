abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.1; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "18% GST applied"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.2; }

    @Override
    public double calculateTax() { return getPrice() * 0.05; }

    @Override
    public String getTaxDetails() { return "5% GST applied"; }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(101, "Laptop", 50000),
            new Clothing(102, "Shirt", 2000),
            new Groceries(103, "Rice Bag", 1000)
        };

        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: " + p.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            if (p instanceof Taxable) {
                System.out.println(((Taxable)p).getTaxDetails());
            }
            System.out.println();
        }
    }
}
