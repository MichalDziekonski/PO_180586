public class Developer extends Employee{

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalaty() {
        return this.getBaseSalary() + 1000;
    }
}
