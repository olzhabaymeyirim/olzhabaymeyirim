package assignment.aitu;

public class human {
    private String name;
    private int age;
    private boolean active;
    public human(String name,int age,boolean active){
        this.age=age;
        this.name=name;
        this.active =active;
    }
public int getAge(){
        return age;
}
public void setAge(int age){
        this.age=age;
}
public String getName(){
        return name;
}
public void setName(String name){
        this.name=name;
}
public boolean isActive(){
        return active;
}
public void setActive(boolean active){
        this.active=active;
}
public void show(){
        System.out.println("Hello,I am " + name + " and my age is " + age );}
public void getrole(){
        System.out.println("I am a human");}
}
