public class Manager extends Employee{

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalaty() {
        return this.getBaseSalary() + 1500;
    }
}
