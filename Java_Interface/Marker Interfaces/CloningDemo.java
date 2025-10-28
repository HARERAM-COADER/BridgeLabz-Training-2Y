public class CloningDemo {
    public static void main(String[] args) {
        Prototype original = new Prototype("Original Object");
        Prototype cloned = null;

        try {
            cloned = (Prototype) original.clone();
            
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            cloned.setName("Cloned Object");

            System.out.println("\nAfter modification:");
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            
            System.out.println("\nAre they the same object? " + (original == cloned));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}