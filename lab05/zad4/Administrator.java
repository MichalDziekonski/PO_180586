package zad4;

public class Administrator extends Employee{

    @Override
    public double calculateSalary(double n) {
        return 2500 + n;
    }
}
