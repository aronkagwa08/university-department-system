public class Lecturer extends Staff implements Payable {

    private String department;

    public Lecturer(String name, String id, String email,
                    double salary, String department) {
        super(name, id, email, salary);
        this.department = department;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public double calculatePayment() {
        return salary + calculateBonus();
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Lecturer in " + department);
    }
}
