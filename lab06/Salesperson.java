public class Salesperson extends Employee{

    public Salesperson(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalaty() {
        return this.getBaseSalary() + 500;
    }
}
