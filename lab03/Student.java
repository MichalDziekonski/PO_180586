public class Student {
    private String name; // Pole z nazwa nie moze byc statyczne musi byc oddielne dla kazdego obieku
    private int albumNumber; // ta sama sytuacja co przy name

    public Student(String name, int albumNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Pola nie moga byc puste");
        } else if (albumNumber < 0 || albumNumber > 999999) {
            throw new IllegalStateException("Niepoprawny numer albumu");
        }
        this.name = name;
        this.albumNumber = albumNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void przedstaw() {
        System.out.println(name + " " + albumNumber);
    }

    public void przedstaw(String wiadomosc) {
        System.out.println(name + " " + albumNumber + " wiadomosc: " + wiadomosc);
    }
}
