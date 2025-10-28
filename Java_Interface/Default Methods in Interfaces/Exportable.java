public interface Exportable {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON format...");
    }
}
