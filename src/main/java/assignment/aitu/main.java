package assignment.aitu;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Your age: ");
        int age = scanner.nextInt();
        System.out.println("Active: ");
        boolean active=scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Your position ");
        String position = scanner.nextLine();
        System.out.println("Your salary: ");
        float salary = scanner.nextFloat();
        employee employee = new employee(name,age,active,position,salary);
        student student = new student("Meyirim Olzhabay",17,true,"Media technology",3.0f);
        System.out.println("Employee details: ");
        employee.show();
        employee.getrole();
        System.out.println("Salary: "+ employee.getsalary());
        float salary2=employee.getsalary();
        employee.setSalary(salary2+500);
        System.out.println("New salary: "+ employee.getsalary());
        employee.work();
        System.out.println("Student details:");
        student.show();
        student.getrole();
        student.study();
        scanner.close();
    }
}
