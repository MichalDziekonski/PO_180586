public class Student {
    String name;
    String lastname;
    int index;

    public Student(String name, String lastname, int index) {
        this.name = name;
        this.lastname = lastname;
        this.index = index;
    }

    public void introduce() {
        System.out.println("index: " + index + ", imie: " + name + ", nazwisko: " + lastname);
    }
}
