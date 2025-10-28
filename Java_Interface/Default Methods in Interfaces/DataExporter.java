public class DataExporter {
    public static void main(String[] args) {
        Exportable salesReport = new Report("Quarterly Sales");

        System.out.println("--- Exporting Report ---");
        salesReport.exportToCSV();
        salesReport.exportToPDF();
        salesReport.exportToJSON(); // Calling the default method
    }
}
