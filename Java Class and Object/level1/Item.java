class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItem(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        Item i1 = new Item(201, "Laptop", 45000);
        i1.displayItem(2);
    }
}