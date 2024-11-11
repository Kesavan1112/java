/*9.8.13=>getconstructor,getdeclaredmethod,getdeclaredfield.

Java reflection is useful because it supports dynamic retrieval of information about classes and data structures by name, and allows for their manipulation within an executing Java program */

//my point:java reflection utilizes for if you don't know class name and it's details everything,you can get by using reflection.

import java.lang.reflect.*;//if you use java reflection before you have to import package.


class a1{
public void aa(){
    System.out.println("aa");
}



}






public class reflection {

    public static void main(String[] args) {
        
        a1 b=new a1();


        Class cl=b.getClass();
      //  System.out.println("cla"+cl);//this statement shows output like:class a1



        System.out.println(cl.getName());//this statement shows output like: a1.
        Method m[]=cl.getMethods();//it does return  method array.
        
        for(Method m1:m)//for(type variable:array){}//structure of for each.
       {
        System.out.println("method name"+m1.getName());//it shows our class's method name and super class's method name.
  
    }
    try{
    // System.out.println(m[0].invoke(b));null: This is the result of invoking m[0].invoke(b), which corresponds to the aa() method. Since aa() has no return statement, it implicitly returns null.
    m[0].invoke(b);    
}
    catch(Exception e){
        e.printStackTrace();
    }
    }
}
    //we can invoke or call by using reflect.
    

/*In Java, the `Class` object is a part of Java Reflection, a powerful feature that allows you to inspect and manipulate classes, methods, and fields at runtime. Using `Class` in Java reflection enables you to get information about a particular class or object during runtime, which can be particularly useful in dynamic applications or frameworks.

Here's why `Class` is used in a reflection context, like in the line `Class clr = b.getClass();`:

1. **Type Information at Runtime**: The `getClass()` method returns the `Class` object associated with the runtime class of an object. This means that `clr` (the `Class` object) will contain all metadata about the class of `b`, such as its name, fields, methods, and constructors.

2. **Dynamically Access Class Members**: Once you have the `Class` object, you can use it to retrieve and manipulate class members (methods, fields, etc.) without knowing the exact type of `b` at compile time. This is useful for creating generic code that can operate on objects of different types.

3. **Instantiate Objects Dynamically**: With a `Class` object, you can dynamically create instances of a class using methods like `newInstance()` (though typically you’d use `getDeclaredConstructor().newInstance()` now due to deprecation of `newInstance()`). This can be valuable in scenarios where you want to create an instance of a class based on runtime information.

4. **Frameworks and Libraries**: Many Java frameworks (like Spring or Hibernate) use reflection to inspect and manipulate objects, classes, and their members. For instance, Spring uses reflection to create beans, inject dependencies, and manage application configuration at runtime.

Here’s a simple example to illustrate the use of `Class` in reflection:

```java
public class Example {
    public static void main(String[] args) {
        MyClass b = new MyClass();
        
        // Obtain the Class object
        Class<?> clr = b.getClass();
        
        // Print the class name
        System.out.println("Class name: " + clr.getName());
        
        // Access methods or fields using reflection
        Method[] methods = clr.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }
    }
}

class MyClass {
    public void myMethod() {}
}
```

In this code, `clr` provides runtime access to the class information of `MyClass`, allowing you to inspect the methods it contains.





*/


/*In Java, there is an important distinction between `Class` (capitalized) and `class` (lowercase), as they represent two entirely different things:

1. **`class` (Lowercase)**:
   - This is a Java keyword used to define a new class.
   - It's part of the syntax that tells the Java compiler you are declaring a class. For example, when you write `public class MyClass { }`, you're creating a new class called `MyClass`.
   - The `class` keyword is used in the definition, and it cannot be used as a variable or method name because it’s reserved.

   **Example:**
   ```java
   public class MyClass {
       // Fields and methods for MyClass go here
   }
   ```

2. **`Class` (Capitalized)**:
   - `Class` (with a capital "C") is a Java class defined in `java.lang` package. It represents the runtime type of a Java object.
   - When you write `Class<?> someClass = obj.getClass();`, you are getting a `Class` object that provides metadata about the `obj` object’s type, such as its name, methods, constructors, fields, etc.
   - The `Class` class is a part of Java Reflection, allowing you to inspect and manipulate classes and their members at runtime.
   - The `Class` object itself can be obtained either by using the `.class` syntax (e.g., `MyClass.class`) or by calling `getClass()` on an instance of an object.

   **Example:**
   ```java
   MyClass obj = new MyClass();
   Class<?> classObject = obj.getClass();  // Get Class object for runtime inspection
   System.out.println(classObject.getName());  // Prints: "MyClass"
   ```

### Summary of Differences

| Feature                  | `class` (lowercase)           | `Class` (uppercase)                      |
|--------------------------|--------------------------------|------------------------------------------|
| Type                     | Keyword                       | Java Class                               |
| Purpose                  | Used to define a new class    | Provides runtime metadata about classes  |
| Usage                    | `public class MyClass { }`    | `Class<?> clazz = obj.getClass();`       |
| Relation to Reflection   | Not directly related          | Central to Java Reflection               |
| Location                 | Part of Java syntax           | Part of `java.lang` package              |

So, `class` defines the blueprint for creating objects, while `Class` provides information about that blueprint during runtime. */


/*In Java, `getName()` and `getMethod()` are methods provided by the `Class` class in the `java.lang.reflect` package. These methods are commonly used in Java Reflection to access information about classes and their members at runtime.

Here’s a breakdown of each:

### 1. `getName()`

- **Purpose**: `getName()` is used to retrieve the fully qualified name of a class (including its package).
- **Returns**: A `String` containing the class name.

#### Usage Example
```java
public class Example {
    public static void main(String[] args) {
        Example obj = new Example();
        Class<?> clazz = obj.getClass();
        
        // Get the name of the class
        String className = clazz.getName();
        System.out.println("Class name: " + className);  // Output: "Class name: Example"
    }
}
```

In this example:
- `getName()` returns `"Example"` if the class is in the default package.
- If the class is in a package, say `com.example`, `getName()` would return `"com.example.Example"`.

#### When to Use `getName()`
`getName()` is useful when you want to identify the class type of an object at runtime, especially in logging, debugging, or dynamic class loading scenarios.


### 2. `getMethod(String name, Class<?>... parameterTypes)`

- **Purpose**: `getMethod()` is used to retrieve a `Method` object representing a specific public method of the class. You need to provide the method's name and, optionally, the types of its parameters.
- **Parameters**:
  - `name`: A `String` representing the method’s name.
  - `parameterTypes`: A comma-separated list of `Class<?>` objects representing the method's parameter types. If the method has no parameters, you can omit this.
- **Returns**: A `Method` object representing the specified method.
- **Throws**: `NoSuchMethodException` if a method with the specified name and parameters does not exist.

#### Usage Example
```java
import java.lang.reflect.Method;

public class Example {
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    public static void main(String[] args) {
        Example obj = new Example();
        Class<?> clazz = obj.getClass();
        
        try {
            // Get the "sayHello" method
            Method method = clazz.getMethod("sayHello");
            
            // Invoke the method on obj instance
            method.invoke(obj);  // Output: "Hello!"
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

In this example:
- `getMethod("sayHello")` returns a `Method` object for the `sayHello` method.
- Using `method.invoke(obj)`, the `sayHello` method is called on the `obj` instance, which prints `"Hello!"`.

#### When to Use `getMethod()`
`getMethod()` is useful when you need to call methods dynamically on an object, especially in scenarios where the method names and parameters are known only at runtime (e.g., in frameworks, plugins, or API handlers).

---

### Summary of Differences

| Method            | Purpose                             | Usage Example                     |
|-------------------|-------------------------------------|-----------------------------------|
| `getName()`       | Gets the fully qualified class name | `clazz.getName()`                 |
| `getMethod()`     | Gets a `Method` object for a method by name | `clazz.getMethod("methodName")` |


3.In Java, `getMethods()` is a method provided by the `Class` class in the `java.lang.reflect` package. This method is used in reflection to retrieve all **public methods** of a class, including those inherited from its superclasses and interfaces.

### Overview of `getMethods()`

- **Signature**: `public Method[] getMethods()`
- **Returns**: An array of `Method` objects, where each `Method` object represents a public method in the class or any of its superclasses.
- **Access Level**: It only returns public methods, meaning methods declared as `public` in the class itself or in any superclass or interface. It does not return private or protected methods.
- **Inherited Methods**: `getMethods()` includes inherited methods from superclasses and interfaces, which makes it different from `getDeclaredMethods()` (which only returns methods explicitly declared in the current class).

### Usage Example

Here’s a basic example that demonstrates how `getMethods()` works:

```java
import java.lang.reflect.Method;

public class Example {
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Example obj = new Example();
        Class<?> clazz = obj.getClass();
        
        // Get all public methods, including inherited ones
        Method[] methods = clazz.getMethods();
        
        // Print method names
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }
    }
}
```

### Explanation of the Code

1. `clazz.getMethods()` returns an array of `Method` objects representing all public methods available in `Example` and any inherited methods.
2. The `for` loop iterates through each `Method` object, and `method.getName()` prints the name of each method.

### Expected Output

This code will print out:
```plaintext
Method name: sayHello
Method name: add
Method name: wait
Method name: equals
Method name: toString
Method name: hashCode
Method name: getClass
Method name: notify
Method name: notifyAll
```

In this example:
- You see `sayHello` and `add`, which are public methods in `Example`.
- Methods like `toString`, `equals`, `hashCode`, and `getClass` are inherited from `Object` (Java’s superclass for all classes).
- `wait`, `notify`, and `notifyAll` are methods also inherited from `Object`.

### When to Use `getMethods()`

- `getMethods()` is useful when you need to dynamically inspect all public methods, especially if you need to invoke methods on an object or log available functionality.
- This is common in frameworks or libraries where you want to access and interact with various methods at runtime without knowing their names or signatures in advance.

### Difference Between `getMethods()` and `getDeclaredMethods()`

| Method               | Description                                                                                  |
|----------------------|----------------------------------------------------------------------------------------------|
| `getMethods()`       | Returns all public methods, including inherited ones from superclasses and interfaces.       |
| `getDeclaredMethods()` | Returns all methods declared in the class, regardless of access level (public, protected, or private), but does not include inherited methods. |
*/