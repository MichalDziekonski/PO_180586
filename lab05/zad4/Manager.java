package zad4;

public class Manager extends Employee{

    @Override
    public double calculateSalary(double n) {
        return 2000 + n;
    }
}
