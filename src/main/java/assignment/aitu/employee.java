package assignment.aitu;

public class employee extends human implements Iwork, Istudy {

    private String position;
    private float salary;
    public static final String ORGANIZATION = "AITU";

    public employee(String name, int age, boolean active, String position, float salary) {
        super(name, age, active);
        this.position = position;
        this.salary = salary;
    }
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public void getRole() {
        System.out.println("I am an employee. My position is " + position);
    }
    @Override
    public void work() {
        System.out.println("Employee is working at " + ORGANIZATION);
    }
    @Override
    public void takeBreak() {
        System.out.println("Employee is taking a break");
    }
    @Override
    public void study() {
        System.out.println("Employee is studying");
    }
    @Override
    public void takeExam() {
        System.out.println("Employee is taking an exam");
    }
}
