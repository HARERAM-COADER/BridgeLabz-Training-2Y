import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public interface DateFormatterUtil {
    static String formatDate(LocalDate date, String pattern) {
        if (date == null || pattern == null || pattern.isEmpty()) {
            return "Invalid date or pattern";
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            return date.format(formatter);
        } catch (IllegalArgumentException e) {
            return "Invalid pattern provided.";
        }
    }
}
