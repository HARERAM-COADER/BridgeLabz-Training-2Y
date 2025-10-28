abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem() { available = false; }

    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 3; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java Basics", "Author A"),
            new Magazine(2, "Tech Today", "Author B"),
            new DVD(3, "Inception", "Director Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem();
                System.out.println("After reserving, Available: " + r.checkAvailability());
            }
            System.out.println();
        }
    }
}
