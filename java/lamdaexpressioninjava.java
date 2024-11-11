//*if it is sam(single abstract method) interface or functional interface ,we can utilize lambda expression from java 1.8
//sam(single abstract method)or functional method both are same.sinle abstract method or functional interface which means if it is one abstract method declare in interface,that's single abstract method or functional method.

/*The syntax of a **lambda expression** in Java is simple and concise. It consists of three parts:

1. **Parameters** (optional)
2. **Arrow (`->`)**
3. **Body** (the implementation)

### Basic Syntax:
```java
(parameters) -> { body }
```

### Detailed Breakdown:
- **Parameters**: 
  - The parameters are enclosed in parentheses, just like method parameters.
  - If there is only **one parameter** and no type is specified, you can omit the parentheses.
  - If there are **multiple parameters**, you must use parentheses.
  
- **Arrow (`->`)**: 
  - Separates the parameters from the body of the lambda.
  
- **Body**: 
  - The body contains the logic or code that the lambda expression implements.
  - If the body consists of a single expression, you **can omit the braces (`{}`)** and the `return` keyword.
  - If the body contains multiple statements, **you must use braces (`{}`)** and the `return` keyword when necessary.

### Example Syntax Variations

1. **No Parameters**:
   ```java
   () -> System.out.println("Hello, World!");
   ```

2. **Single Parameter (No Parentheses)**:
   ```java
   name -> System.out.println("Hello, " + name);
   ```
   
3. **Single Parameter (With Explicit Type)**:
   ```java
   (String name) -> System.out.println("Hello, " + name);
   ```

4. **Multiple Parameters**:
   ```java
   (a, b) -> a + b;
   ```

5. **Multiple Parameters (With Explicit Types)**:
   ```java
   (int a, int b) -> a + b;
   ```

6. **Single Expression (No Braces)**:
   ```java
   (a, b) -> a * b;
   ```

7. **Multiple Statements (Braces Required)**:
   ```java
   (a, b) -> {
       int result = a + b;
       System.out.println("The result is " + result);
       return result;
   };
   ```

### Examples:

1. **Lambda for a Runnable (No Parameters, Single Statement)**:
   ```java
   Runnable r = () -> System.out.println("Running...");
   new Thread(r).start();
   ```

2. **Lambda with a Single Parameter (Simplified)**:
   ```java
   Consumer<String> greet = name -> System.out.println("Hello, " + name);
   greet.accept("Alice");  // Output: Hello, Alice
   ```

3. **Lambda with Multiple Parameters (Arithmetic Operation)**:
   ```java
   BinaryOperator<Integer> add = (a, b) -> a + b;
   System.out.println(add.apply(5, 3));  // Output: 8
   ```

4. **Lambda with Multiple Statements (Using Braces)**:
   ```java
   Comparator<Integer> comparator = (a, b) -> {
       if (a > b) return 1;
       else if (a < b) return -1;
       else return 0;
   };
   System.out.println(comparator.compare(10, 20));  // Output: -1
   ```

### Summary:
- `(parameters) -> expression` for simple expressions.
- `(parameters) -> { code block }` for multiple statements.
 */
interface Ridable{
    void ride();
}
public class lamdaexpressioninjava {
   
    public static void main(String args[])
    {

        Ridable f=()->System.out.println("by using lambda expression");
        f.ride();
    }
}
/***Lambda expressions** in Java were introduced in Java 8 and provide a way to create instances of **functional interfaces** (interfaces with a single abstract method) in a concise and readable manner. They are commonly used for **implementing behavior** where an anonymous class would traditionally be used, but with much simpler syntax.

Here are the key areas where lambda expressions are used in Java:

### 1. **Functional Interfaces**
Lambda expressions are primarily used to instantiate **functional interfaces**. A functional interface is an interface with only one abstract method. Many built-in functional interfaces exist in the `java.util.function` package (e.g., `Function`, `Predicate`, `Consumer`, `Supplier`, etc.).

#### Example:
```java
// Using Runnable, a functional interface
Runnable r = () -> System.out.println("Lambda expression running");
new Thread(r).start();
```
In this example, `Runnable` is a functional interface with a single method `run()`, and the lambda expression provides the implementation of that method.

### 2. **Collection Framework (Streams API)**
One of the most common uses of lambda expressions is in conjunction with the **Streams API** for processing collections. They enable a more functional approach to processing collections, like filtering, mapping, and reducing data.

#### Example: Filtering a List
```java
List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
names.stream()
    .filter(name -> name.startsWith("A"))
    .forEach(System.out::println);  // Output: Alice
```
Here, the lambda expression `name -> name.startsWith("A")` is used to filter names that start with "A".

### 3. **Event Handling (in GUI Frameworks)**
Lambda expressions can simplify event handling code, such as in Swing or JavaFX, where listeners are often required. Instead of writing anonymous inner classes for event listeners, you can use lambdas.

#### Example: Action Listener
```java
Button button = new Button("Click Me");
button.setOnAction(e -> System.out.println("Button clicked"));
```
In JavaFX, the lambda `e -> System.out.println("Button clicked")` is used to handle button click events.

### 4. **Simplifying Anonymous Classes**
Lambda expressions can replace anonymous classes that implement functional interfaces. This significantly reduces the amount of boilerplate code.

#### Example: Comparator
```java
List<Integer> numbers = Arrays.asList(5, 1, 4, 3);
Collections.sort(numbers, (a, b) -> a - b);  // Sort in ascending order
```
Here, the lambda `(a, b) -> a - b` is used to define a custom sorting order for the `Comparator` interface, replacing a more verbose anonymous class.

### 5. **Concurrency with Executor Framework**
Lambda expressions can be used with the **ExecutorService** for submitting tasks. Instead of using anonymous `Runnable` or `Callable` classes, lambdas can simplify concurrent task submission.

#### Example: Submitting a task
```java
ExecutorService executor = Executors.newFixedThreadPool(1);
executor.submit(() -> System.out.println("Task executed"));
executor.shutdown();
```
The lambda `() -> System.out.println("Task executed")` provides the implementation of the `Runnable` interface.

### 6. **Custom Functional Interfaces**
You can create your own functional interfaces and use lambda expressions to instantiate them.

#### Example:
```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

Greeting greet = (name) -> System.out.println("Hello, " + name);
greet.sayHello("Alice");  // Output: Hello, Alice
```
Here, `Greeting` is a custom functional interface, and a lambda expression is used to implement its `sayHello` method.

### 7. **Optional and Lambda Expressions**
Java's `Optional` class (introduced in Java 8) is often used with lambda expressions for handling nullable values in a functional style.

#### Example:
```java
Optional<String> optional = Optional.of("Hello");
optional.ifPresent(value -> System.out.println("Value is: " + value));  // Output: Value is: Hello
```
The lambda expression `value -> System.out.println("Value is: " + value)` is used to handle the case when the value is present.

### 8. **Method References**
Lambda expressions can often be replaced by **method references**, which provide a cleaner and more readable alternative.

#### Example:
```java
List<String> names = Arrays.asList("John", "Alice", "Bob");
names.forEach(System.out::println);  // Output: John Alice Bob
```
Here, `System.out::println` is a method reference that acts like a lambda `name -> System.out.println(name)`.

### 9. **Working with Functional Interface Types in APIs**
Java 8 introduced several functional interfaces such as `Predicate<T>`, `Function<T, R>`, `Consumer<T>`, and `Supplier<T>`, which are often used in APIs. These interfaces are perfect for lambda expressions.

#### Example:
```java
Predicate<Integer> isEven = n -> n % 2 == 0;
System.out.println(isEven.test(4));  // Output: true
```
In this example, the lambda `n -> n % 2 == 0` provides the implementation for the `test` method in the `Predicate` interface.

### Summary of Where Lambda Expressions Are Used:
1. **Functional interfaces** (e.g., `Runnable`, `Comparator`, `ActionListener`, etc.)
2. **Stream API** for operations like filtering, mapping, reducing collections.
3. **Event handling** (e.g., GUI frameworks like Swing and JavaFX).
4. **Simplifying anonymous class implementations** (particularly for functional interfaces).
5. **Concurrency** with `ExecutorService` and tasks (`Runnable`, `Callable`).
6. **Custom functional interfaces** you create.
7. **Method references** as a cleaner alternative to lambdas.
8. **Optional** for handling nullable values in a functional style.
9. **Predefined functional interfaces** like `Predicate`, `Consumer`, `Function`, etc.

Lambda expressions in Java promote cleaner, more concise code and are particularly useful in functional programming paradigms, event-driven code, and collection processing tasks. */