
/*Wrapper classes are used to convert any data type into an object. The primitive data types are not objects; they do not belong to any class; they are defined in the language itself. Sometimes, it is required to convert data types into objects in Java language. */
public class wrapperclass 
{
    public static void main(String[] args) 
{
  int a=1,b=2;
//   Integer f=new Integer(a);//new version java not allow 

/*you can't inherit Integer class cause of Integer c/*lass is final. you put cursor on 'Integer' click F12.you can check that is final.*/
Integer f1=Integer.valueOf(a);//new version uses valueOf() method . valueOf() method uses with variable like valueOf(a) or directly give number like valueOf(2).Integer is wrapper class.for example:you take a gift .things is 'int',gift papper is 'Integer'.when we wrap things by gift paper,that's wrapper.same concept that primitive data type converts into objects.
System.out.println(f1);      
    
Integer d=Integer.valueOf(b);//we can say  "Boxing or Wrapping"
int s=d.intValue();//we can say  "unboxing or unwrapping"
System.out.println(s);      
Integer ss=22;//AutoBoxing or AutoWrapping.this statement means compiler automatically does Integer ss=Integer.valueOf(22) or variable also like Integer ss=Integer.valueOf(a);
System.out.println(ss);
int q=ss;//AutounBoxing or AutounWrapping.this statement means compiler automatically does int q=ss.intValue().
System.out.println(q);
 
//parseInt in Java is a method that is part of the Integer class. It allows you to convert strings into integers easily
String ident="123";
System.out.println("without string convert into int:"+ident+2);


int gets=Integer.parseInt(ident);//pareInt method is static that's why we call it's class name that =>Integer.parseInt();parseInt() method is inside Integer class's method.
System.out.println("with string convert into int"+gets+2);

}
    
  }
/*primitive data type: wrapper class
 * int:Integer
 * char:Character
 * short:SHORT
 * long:Long
 * boolean:Boolean
 * double:Double
 * float:Float
 * byte:Byte

1.AutoBoxing:
 integer :int

 int a=11;
 Integer w=a;

Yes, your code:

```java
int a = 11;
Integer w = a;
```

is a correct example of autoboxing in Java.

In Java, autoboxing is the automatic conversion of a primitive data type (like `int`) to its corresponding wrapper class (like `Integer`). Here, the `int` value `a` is automatically converted to an `Integer` object `w`. 

Java handles this internally, so you don’t need to explicitly use `Integer.valueOf(a)` for this conversion.


 
 2.AutoUnBoxing
int:integer

Integer ss=11;
int q=ss;


Yes, the assignment `int q = ss;` in your code is an example of **autounboxing** in Java.

Here's the full code for context:

```java
Integer ss = 11; // Autoboxing: converting int 11 to Integer object
int q = ss;      // Autounboxing: converting Integer object to int
```

In this example:

1. **Autoboxing** occurs when `Integer ss = 11;` converts the primitive `int` value `11` into an `Integer` object.
2. **Autounboxing** happens in `int q = ss;`, where Java automatically converts the `Integer` object `ss` back to a primitive `int` type, which is assigned to `q`.

This process simplifies working with wrapper classes in Java by removing the need for explicit conversions.
*/