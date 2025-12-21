package assignment.aitu;

public class employee extends human{
    private String position;
    private float salary;
    public static String organization="AITU";
    public employee(String name,int age,boolean active,String position,float salary){
        super (name,age,active);
        this.position = position;
        this.salary = salary;
    }
public String getposition(){
        return position;
}
public void setPosition(String position){
        this.position=position;
}
public float getsalary(){
        return salary;
}
public void setSalary(float salary){
        this.salary=salary;
}
@Override
    public void getrole(){
        System.out.println("I am an employee.My position is a " + position );
}
public void work(){
        System.out.println("Employee is working at " + organization);
}
}
