package package1;

public class Person {
    public int data1; // jest normalnie bezproblemowo dostepne w klasie dziedziczacej
    int data2; // nie moze z wzgledu na umieszczenie w innych pakietach
    protected int data3; // jest normalnie bezproblemowo dostepne w klasie dziedziczacej
    private int data4; // jest to pole prywarne dlatego bezposredni dostemp do niego nie jest mozliwy z inne klasy
}

/*
public class Person {
    private String firstName; // jest to pole prywarne dlatego bezposredni dostemp do niego nie jest mozliwy z inne klasy
    protected String lastName; // Umozliwia dostep do zmienej poprzez dziedziczenie

    // zalerzy od tego jak bardzo zalerzy nam na hermetyzacji danych wiec jest to mocno sytuacyje


}
 */
