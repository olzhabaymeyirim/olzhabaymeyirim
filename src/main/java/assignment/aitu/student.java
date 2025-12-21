package assignment.aitu;

public class student extends human{
    private String major;
    private float gpa;
    public student(String name,int age,boolean active,String major,float gpa){
        super(name,age,active);
        this.major=major;
        this.gpa=gpa;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
@Override
public void getrole(){
        System.out.println("I am a student with a major " + major);
}
public void study(){
        System.out.println("Students gpa: " + gpa);
}
}
