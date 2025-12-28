package assignment.aitu;

public abstract class human {
    protected String name;
    protected int age;
    protected boolean active;

    public human(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public void show() {
        System.out.println("Hello, I am " + name + " and my age is " + age);
    }

    public abstract void getRole();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }
}
