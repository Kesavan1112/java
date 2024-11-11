import java.lang.reflect.*; // Import reflection package

class a1 {
    void aa() {
        System.out.println("aa");
    }
}

public class ReflectionExample {

    public static void main(String[] args) {

        a1 b = new a1();

        // Get the class of the object
        Class<?> cl = b.getClass();
        
        // Display the name of the class
        System.out.println("Class Name: " + cl.getName());

        // Get all methods of the class (including inherited methods)
        Method[] methods = cl.getMethods();

        // Display all methods' information
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }

        try {
            // Invoke the first method in the array
           // System.out.println("Invocation Result: " + methods[0].invoke(b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
