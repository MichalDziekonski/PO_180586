public class ReportService {
    private Storage storage;

    public ReportService(Storage storage) {
        this.storage = storage;
    }

    public void generateReport() {
        String report = "Raport";
        storage.save(report);
    }

    /*
    private Database database;

    public ReportService(Database database) {
        this.database = database;
    }

    public void generateReport() {
        String report = "Raport";
        database.save(report);
    }
     */
}
