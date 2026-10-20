public class Wykladowca {
    String name;
    String lastname;
    String lecture;

    public Wykladowca(String name, String lastname, String lecture) {
        this.name = name;
        this.lastname = lastname;
        this.lecture = lecture;
    }

    public void announcement(){
        System.out.println("Wykład z " + lecture + " prowadzony przez: " + name + " " + lastname);
    }
}
