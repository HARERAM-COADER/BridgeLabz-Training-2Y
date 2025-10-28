public class Report implements Exportable {
    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void exportToCSV() {
        System.out.println("Exporting report '" + title + "' to CSV.");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting report '" + title + "' to PDF.");
    }
}