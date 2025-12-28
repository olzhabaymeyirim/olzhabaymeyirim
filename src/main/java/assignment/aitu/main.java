package assignment.aitu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = scanner.nextLine();

        System.out.print("Your age: ");
        int age = scanner.nextInt();

        System.out.print("is active: ");
        boolean active = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Your position: ");
        String position = scanner.nextLine();

        System.out.print("Your salary: ");
        float salary = scanner.nextFloat();

        // polymorphism
        human e1 = new employee(name, age, active, position, salary);
        Istudy s1 = new student("Meyirim Olzhabay", 17, true, "Media technology", 3.0f);

        System.out.println("Employee details:");
        e1.show();
        e1.getRole();

        employee emp = (employee) e1;
        System.out.println("Salary: " + emp.getSalary());
        emp.setSalary(emp.getSalary() + 500);
        System.out.println("New salary: " + emp.getSalary());
        emp.work();

        System.out.println("Student details:");
        s1.study();
        ((student) s1).showUniversity();

        scanner.close();
    }
}
