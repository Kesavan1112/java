
//pending in object clone video from
//whether i copy any object,i do use object clone 
/*i have to override steps:
 *step-1:to implements Cloneable interface which class we need copy of object. 
 *step-2: clone the override method  which class we need copy of object.
*step-3:to handle by try and catch the Exception
*step-4:conversion the object
*/
/*In Java, primitive data types store their values directly, and when you assign a primitive variable to another, a **deep copy** (or more precisely, a copy of the value) is made by default. This is because primitive data types (like `int`, `char`, `float`, etc.) store actual values, not references to objects.

For example:

```java
int a = 10;
int b = a;  // Here, a copy of 'a' (the value 10) is stored in 'b'
b = 20;

System.out.println(a);  // Output: 10
System.out.println(b);  // Output: 20
```

In this example, `b` gets a copy of `a`'s value, so changing `b` doesn't affect `a`.

So, for primitive data types in Java, **deep copying** (value copying) is the default behavior when you assign one variable to another.

but we have to make deep copy manually for class's object

*/


/*all classes extends Object implicitly class like Department extends Object */


//another example in cloningDemo.java for date class.
import java.util.*;

class Department  implements Cloneable  //(implicitly)class Department extends Object

{
int deptid;
String deptname;
Department(int id,String departname){
    deptid=id;
    deptname=departname;
}

void display(){
    System.out.println("deparmentid:"+deptid);
    System.out.println("departmentname:"+deptname);

}


protected Object clone()throws CloneNotSupportedException
    {
        return super.clone();//we do call or invoke the clone method from super class,super class is Object class.
    }


}
class Date implements Cloneable
{
    protected Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}

/*clone method=>This method belongs to the Object class, which is a base class of every class created in Java. This method helps to create a copy of the object, but if the class doesn't support a cloneable interface then it leads to the exception, " CloneNotSupportedException". */
class Student implements Cloneable//Cloneable inside the object class.
{
    int age;
    String name;
    Department dept;
    Date dob;

    Student(String n,int a,Department depts){
name=n;
age=a;
dept=depts;
    }
    protected Object clone()throws CloneNotSupportedException
    {
  //      return super.clone();//we do call or invoke the clone method from super class,super class is Object class.
    
Student s=(Student)super.clone();
s.dept=(Department)s.dept.clone();//casting here
s.dob=(Date)s.dob.clone();
return s;
}

    void display(){
        System.out.println("age="+age+"\nname="+name+"\ndepartment name="+dept);
    dept.display();
    }

}


class objectclone{
    public static void main(String args[])throws CloneNotSupportedException
    {
Department d1=new Department(014, "MCA");
Student s1=new Student("k7",14,d1);

Student s2=s1;//it stores only reference of s1 into s2. s1 address stores in s2 which does not clone of object(copy of object).clone=copy.
Student s3=(Student)s1.clone();//explicitly conversion.
d1.deptname="mca2";
// d1.deptname="mca3";
s1.display();
s3.display();
}
}

/*steps 1:we have to override the clone method in which class object i need copy.because clone method is Object class.
 * steps 2:invoke that inside override method  by super keyword like return super.clone();
 *steps 3:we set exception beside the main method and over that is CloneNotSupportException

 */
/*chatgpt
 * The `clone()` method you’ve encountered is part of Java's object cloning mechanism. It allows creating a duplicate (shallow copy) of an object. Let’s break it down step by step:

### 1. **`clone()` method in Java:**
   - Every class in Java is implicitly a subclass of the `Object` class, which has a method called `clone()`. This method is used to create a shallow copy of the object.
   - The default implementation of `clone()` in the `Object` class performs a shallow copy, which means it copies the field values from one object to another.

### 2. **`protected Object clone() throws CloneNotSupportedException`:**
   - **`protected`**: The `clone()` method is `protected` in the `Object` class, which means it can only be called by subclasses or classes in the same package unless it is overridden and made public.
   - **`Object`**: This is the return type, indicating that this method returns an `Object` type (which would be a cloned instance of the current object).
   - **`throws CloneNotSupportedException`**: This exception is thrown if the class doesn't implement the `Cloneable` interface. To allow cloning, the class must implement this interface; otherwise, invoking `clone()` will result in this exception.

### 3. **`return super.clone();`:**
   - The call `super.clone()` is invoking the `clone()` method from the superclass, which is `Object`. In this context, `super.clone()` creates a shallow copy of the object by copying the current instance's fields (primitive and object references) to a new instance.
   - The `Object` class' `clone()` method handles the low-level task of copying the object.

### 4. **Why `CloneNotSupportedException`?**
   - Not all objects in Java are clonable by default. For an object to be cloned, its class must implement the `Cloneable` interface. If a class does not implement `Cloneable` and you call `clone()`, the JVM will throw a `CloneNotSupportedException`.
   
### 5. **Shallow vs Deep Copy:**
   - **Shallow copy**: Copies the object and references to any objects it contains. However, it doesn’t copy the objects that are referenced (i.e., it copies references to them, not the objects themselves).
   - **Deep copy**: Copies the object as well as all objects it references, creating an entirely independent clone.

### Example:
```java
class MyClass implements Cloneable {
    int data;

    MyClass(int data) {
        this.data = data;
    }

    // Overriding the clone method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            MyClass obj1 = new MyClass(10);
            MyClass obj2 = (MyClass) obj1.clone();  // Cloning obj1 into obj2
            System.out.println("Original object data: " + obj1.data);
            System.out.println("Cloned object data: " + obj2.data);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

### Key Points:
1. The `clone()` method creates a shallow copy of the object.
2. You must implement the `Cloneable` interface in your class to enable cloning.
3. The `super.clone()` calls the `Object` class’s clone method.
4. Cloning may require handling the `CloneNotSupportedException`. 

Does this clarify the `clone()` method for you?
 */









 
 /*The two parts you're comparing—**`protected Object clone()`** and **`return super.clone();`**—serve different purposes within the method. Let me explain their roles and the difference between them:

### 1. **`protected Object clone()`**:
   - This line is part of the **method declaration**.
   - It defines the method in the class where you're overriding `clone()`.
   - **Explanation**:
     - `protected`: Specifies that the method is accessible to subclasses or within the same package.
     - `Object`: This is the return type, meaning the method will return an `Object` (which will be the cloned object).
     - `clone()`: The name of the method that you're defining (or overriding in this case).
     - `throws CloneNotSupportedException`: Declares that this method may throw a `CloneNotSupportedException` if the class does not implement `Cloneable`.

   ### Purpose:
   - This is the method header that establishes that your class is providing its own `clone()` method. The actual body of the method is written within the curly braces `{}`.

### 2. **`return super.clone();`**:
   - This line is part of the **method body** (i.e., what happens when the method is invoked).
   - **Explanation**:
     - `return`: Specifies that the method will return a value. In this case, it returns the result of calling `super.clone()`.
     - `super.clone()`: This invokes the `clone()` method of the superclass (`Object`), which performs the actual cloning of the object.
   
   ### Purpose:
   - When you call `super.clone()`, it creates a shallow copy of the object, invoking the `clone()` method from the `Object` class.
   - This is where the actual cloning process happens, i.e., the copying of the current object's fields to a new object.
   - The `return` statement makes sure that the cloned object is returned to the caller.

### Key Differences:
1. **`protected Object clone()`** is part of the method **definition**, where you define the signature of the method in your class.
   - It's saying: "This is a method that returns an `Object` and may throw a `CloneNotSupportedException`."

2. **`return super.clone();`** is part of the method **implementation** (method body) and does the actual work of cloning by calling the `clone()` method from the superclass (`Object`).
   - It's saying: "Perform the clone operation using the superclass implementation and return the result."

### Example to Clarify:
```java
class MyClass implements Cloneable {
    int data;

    MyClass(int data) {
        this.data = data;
    }

    // Overriding clone() method
    protected Object clone() throws CloneNotSupportedException {
        // The actual cloning happens here
        return super.clone(); // Calls Object class's clone method
    }

    public static void main(String[] args) {
        try {
            MyClass obj1 = new MyClass(10);
            MyClass obj2 = (MyClass) obj1.clone();  // Cloning obj1
            System.out.println("Original object data: " + obj1.data);
            System.out.println("Cloned object data: " + obj2.data);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```

### In Summary:
- **`protected Object clone()`** is the method declaration, indicating the method's visibility, return type, and exception handling.
- **`return super.clone();`** is the part where the superclass's `clone()` method is invoked to actually perform the cloning operation.

Let me know if you'd like more clarification! */