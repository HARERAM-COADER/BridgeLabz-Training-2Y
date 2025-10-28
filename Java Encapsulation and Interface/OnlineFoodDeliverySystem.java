abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }

    @Override
    public String getDiscountDetails() { return "5% discount on Veg items"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() { return (getPrice() * getQuantity()) + 20; }

    @Override
    public double applyDiscount() { return calculateTotalPrice() * 0.02; }

    @Override
    public String getDiscountDetails() { return "2% discount on Non-Veg items"; }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer", 200, 2),
            new NonVegItem("Chicken", 300, 1)
        };

        for (FoodItem f : items) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            double discount = (f instanceof Discountable) ? ((Discountable) f).applyDiscount() : 0;
            double finalPrice = total - discount;
            System.out.println("Total Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            if (f instanceof Discountable) {
                System.out.println(((Discountable) f).getDiscountDetails());
            }
            System.out.println();
        }
    }
}
