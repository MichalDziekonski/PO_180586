public class Invoice implements Printable{
    private int number;

    public Invoice(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void print() {
        System.out.println("nr faktury: " + this.getNumber());
    }

    @Override
    public void printHeader() {
        System.out.println("=== Invoice ===");
    }
}
