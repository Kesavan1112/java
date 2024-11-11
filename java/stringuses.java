/*
 * String =sequence of character.t's used to store and manipulate text data.
 * String is immutable(unchangeable)
 * StringBuilder and StringBuffer are mutable(changeable).
 */

public class stringuses {
    public static void main(String[] args) {
        String name=new String("kesavan");//String is a class which does n't inherit because final keyword in class 
    
    System.out.println(name);
    System.out.println(name.charAt(2));
    System.out.println("i am here "+name);

    System.out.println(name.concat("  is spirit ")+name);
String s1="trump";//compiler takes String s1= new Strimg("trump");
// String s2=new String("trump");
String s2="trump";
System.out.println(s1==s2);//it shows false,when we use both string use without new keyword.
//System.out.println(s1.equals(s2));//it shows true,when we use both string use with new keyword or  string use without new keyword.equals() is string class.

    
    }
    
}
