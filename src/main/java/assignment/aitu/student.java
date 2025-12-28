package assignment.aitu;

public final class student extends human implements Istudy {

    private String major;
    private float gpa;
    private final String university = "AITU";

    public student(String name, int age, boolean active, String major, float gpa) {
        super(name, age, active);
        this.major = major;
        this.gpa = gpa;
    }
    @Override
    public void getRole() {
        System.out.println("I am a student with a major " + major);
    }
    @Override
    public void study() {
        System.out.println("Student is studying. GPA: " + gpa);
    }
    @Override
    public void takeExam() {
        System.out.println("Student is taking an exam");
    }
    public final void showUniversity() {
        System.out.println("University: " + university);
    }
}


