
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if they are the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check type compatibility

        Person person = (Person) obj; // Cast obj to Person
        return age == person.age && name.equals(person.name); // Compare fields
    }

    // It's good practice to override hashCode as well we will learn hashcode() later.
   /*  @Override
    public int hashCode() {
        return 31 * age + name.hashCode();
    }*/
}

public class objectclassinjava2{
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        // Use equals() to compare objects
        System.out.println(p1.equals(p2)); // true, because the contents are the same
        System.out.println(p1.equals(p3)); // false, because the contents differ
    }
}


/* 
In Java, the `equals()` method is used to compare two objects for equality, based on the contents of the objects, rather than their references. Although the `equals()` method is commonly used with `String` objects, it can be applied to any object, including user-defined types like custom classes.

To use the `equals()` method with non-`String` objects, you should override the `equals()` method in your custom class. Along with `equals()`, it's also a good practice to override the `hashCode()` method to ensure that equal objects have the same hash code.

### Example: Using `equals()` in a Custom Class

```java
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if they are the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check type compatibility

        Person person = (Person) obj; // Cast obj to Person
        return age == person.age && name.equals(person.name); // Compare fields
    }

    // It's good practice to override hashCode as well
    @Override
    public int hashCode() {
        return 31 * age + name.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        // Use equals() to compare objects
        System.out.println(p1.equals(p2)); // true, because the contents are the same
        System.out.println(p1.equals(p3)); // false, because the contents differ
    }
}
```

### Explanation:
1. **Override equals()**: The `equals()` method checks if two `Person` objects are equal by comparing their `name` and `age` fields.
2. **Override hashCode()**: It's important to override `hashCode()` whenever `equals()` is overridden to maintain consistency when used in hash-based collections like `HashSet` or `HashMap`.

In this example:
- `p1.equals(p2)` returns `true` because both `Person` objects have the same `name` and `age`.
- `p1.equals(p3)` returns `false` because `p3` has a different `name` and `age`.

You can apply the same principles to other objects like custom classes, collections, etc.

*/