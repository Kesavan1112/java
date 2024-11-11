import java.lang.reflect.Method;

class MyClass {
    // Method to invoke
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    private void secretMethod() {
        System.out.println("This is a private method.");
    }
}

public class methodinvokebyreflect{
    public static void main(String[] args) {
        try {
            // Step 1: Create an instance of MyClass
            MyClass myObject = new MyClass();

            // Step 2: Obtain the Class object
            Class<?> clazz = myObject.getClass();

            // Step 3: Get the Method object for greet(String)
            Method greetMethod = clazz.getMethod("greet", String.class);
            // Step 4: Invoke the greet method
            greetMethod.invoke(myObject, "World"); // Output: Hello, World!

            // Step 3: Get the Method object for add(int, int)
            Method addMethod = clazz.getMethod("add", int.class, int.class);
            // Step 4: Invoke the add method
            int result = (int) addMethod.invoke(myObject, 5, 10);
            System.out.println("Result of addition: " + result); // Output: Result of addition: 15

            // Step 3: Get the Method object for secretMethod()
            Method secretMethod = clazz.getDeclaredMethod("secretMethod");
            secretMethod.setAccessible(true); // Step 4: Set accessible for private method
            // Step 5: Invoke the secret method
            secretMethod.invoke(myObject); // Output: This is a private method.

        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions
        }
    }
}
