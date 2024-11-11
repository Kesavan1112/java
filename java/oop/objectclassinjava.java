//object class is super class of all java class.object class is another name is cosmic super class.
public class objectclassinjava extends Object//Object class is extends implicitly.because this is super class of all java

{

    public static void main(String args[])
    {
System.out.println("this is Object class");
String s1=new String("abc");//s1 and s2 both are object that's why store in heap memory but it represents it's address differently that's why output is false. 
String s2=new String("abc");

String s3="one";
String s4="one";//s3 and s4 are string pool in heap memory it represent same address.
System.out.println(s1==s2);
System.out.println(s3==s4);

System.out.println(s1.equals(s2));//if you check both object's content which means ("abc") is same,output will be come boolean format refers true or false.
    }



    
}
