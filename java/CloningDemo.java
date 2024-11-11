import java.util.Date;

class Department implements Cloneable
 {
    int deptId;
    String name;

    Department(int id, String n) 
    {
        deptId = id;
        name = n;
    }

    void display()
     {
        System.out.println("Dept id: " + deptId);
        System.out.println("Dept Name: " + name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }
}

class Student implements Cloneable 
{
    int id;
    String name;
    Department dept;
    Date admissionDate;  // New Date field

    Student(int i, String n, Department d, Date date) 
    {
        id = i;
        name = n;
        dept = d;
        admissionDate = new Date(date.getTime());  // Deep copy of Date
    }

    void display() 
    {
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
        System.out.println("Admission Date is: " + admissionDate);
        dept.display();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        Student s = (Student) super.clone();
        s.dept = (Department) s.dept.clone();  // Deep copy of Department
        s.admissionDate = new Date(admissionDate.getTime());  // Deep copy of Date
        return s;
    }
}

public class CloningDemo 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        Department dept = new Department(1, "Physics");
        Date admissionDate = new Date();  // Current date

        Student s1 = new Student(1, "Hari", dept, admissionDate);
        Student s2 = (Student) s1.clone();  // Clone the student

        // Change values in original objects
        dept.name = "Maths";  // Change department name
        admissionDate.setTime(1000000000L);  // Change admission date

        // Display original and cloned students
        System.out.println("Original Student:");
        s1.display();  // Displays updated details

        System.out.println("\nCloned Student:");
        s2.display();  // Displays deep-copied details before changes
    }
}

    

