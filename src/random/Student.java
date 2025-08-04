package random;
public class Student 
{

    // Static variable (shared by all students)
    static String schoolName = "Greenwood High";

    // Instance variable (unique to each student)
    String studentName;

    // Constructor
    Student(String name)
    {
        studentName = name;
    }

    void showInfo() {
        System.out.println("Name: " + studentName + ", School: " + schoolName);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Padma");
        Student s2 = new Student("Rahul");

        s1.showInfo();  // Greenwood High
        s2.showInfo();  // Greenwood High

        // Now change the static variable using one object
        s1.schoolName = "Sunrise Academy";

        // Check again
        s1.showInfo();  // Sunrise Academy
        s2.showInfo();  // Sunrise Academy
    }
}
