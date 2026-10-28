package package2;

public class Manager extends Employee {
    private String department;

    public Manager(String firstName, String lastName, String department) {
        super(firstName, lastName);
        this.department = department;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kieruje: " + department);
    }
}
