import java.util.function.Function;
public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();

        String message = "This is a sample message for testing purposes.";
        int charLimit = 50;
        int messageLength = getLength.apply(message);

        System.out.println("Message: \"" + message + "\"");
        System.out.println("Length: " + messageLength);

        if (messageLength > charLimit) {
            System.out.println("Warning: Message exceeds character limit of " + charLimit);
        } else {
            System.out.println("Message is within the character limit.");
        }
    }
}
