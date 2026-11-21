public class Ticket implements Printable{
    private int number;

    public Ticket(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void print() {
        System.out.println("nr biletu: " + this.getNumber());
    }
}
