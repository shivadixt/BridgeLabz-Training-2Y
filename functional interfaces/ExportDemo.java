interface Exportable {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exported data in JSON format.");
    }
}

class Report implements Exportable {
    public void exportToCSV() { System.out.println("Data exported to CSV."); }
    public void exportToPDF() { System.out.println("Data exported to PDF."); }
}

public class ExportDemo {
    public static void main(String[] args) {
        Report r = new Report();
        r.exportToJSON();
    }
}

