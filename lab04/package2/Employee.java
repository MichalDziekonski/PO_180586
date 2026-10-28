package package2;

import package1.Person;

public class Employee extends Person {
    protected String firstName;
    protected String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showInformation() {
        System.out.println("Imie: " + firstName + " Nazwisko: " + lastName);
    }

    public void displayData() {
        System.out.println(this.data1 + " " + this.data3);
    }
}

/*
public class Employee extends Person{
    private System position;

        public void displayData() {
            System.out.println(this.lastName + " " + this.position);
        }
}
 */
