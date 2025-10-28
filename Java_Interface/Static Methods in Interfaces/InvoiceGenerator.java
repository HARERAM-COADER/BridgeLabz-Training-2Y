import java.time.LocalDate;
public class InvoiceGenerator {
    public static void main(String[] args) {
        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateFormatterUtil.formatDate(invoiceDate, "dd/MM/yyyy");
        String format2 = DateFormatterUtil.formatDate(invoiceDate, "MMMM d, yyyy");
        String format3 = DateFormatterUtil.formatDate(invoiceDate, "yyyy-MM-dd");

        System.out.println("--- Invoice Date Formats ---");
        System.out.println("Standard EU Format: " + format1);
        System.out.println("Full Text US Format: " + format2);
        System.out.println("ISO Format: " + format3);
    }
}
