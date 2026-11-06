package zad4;

public class Developer extends Employee{

    @Override
    public double calculateSalary(double n) {
        return 1500 + n;
    }
}
