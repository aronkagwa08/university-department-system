public abstract class Staff extends Person {
    protected double salary;

    public Staff(String name, String id, String email, double salary) {
        super(name, id, email);  // use of super
        this.salary = salary;
    }

    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateBonus();
}