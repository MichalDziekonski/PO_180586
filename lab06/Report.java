public class Report implements Printable, Exportable, Savable{
    private String type;

    public Report(String number) {
        this.type = number;
    }

    public String getType() {
        return type;
    }

    @Override
    public void print() {
        System.out.println("nr raportu: " + this.getType());
    }

    @Override
    public void export() {
        System.out.println("Export");
    }

    @Override
    public void save() {
        System.out.println("Save");
    }
}
