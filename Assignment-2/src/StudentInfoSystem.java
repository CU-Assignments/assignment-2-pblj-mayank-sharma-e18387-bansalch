import java.util.*;

abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void displayDetails();
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Person[] persons = new Person[n]; // Array of Person objects

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("Enter Type (Student/Teacher): ");
            String type = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (type.equalsIgnoreCase("Student")) {
                System.out.print("Enter Roll Number: ");
                int rollNumber = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                persons[i] = new Student(name, age, rollNumber);
            } else {
                System.out.print("Enter Subject: ");
                String subject = scanner.nextLine();
                persons[i] = new Teacher(name, age, subject);
            }
        }

  
        System.out.println("\nDisplaying All Entries:");
        for (Person person : persons) {
            person.displayDetails();
        }

        scanner.close();
    }
}
