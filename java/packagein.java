/*  package is collection of class.
*package can organize
*package name actually starts small name.
*if i need same class .then we able to use that class in different package that's why we can control the conflict.

how to create the package
1.to click the project
2.to right click src
3.com.domainname

if i don't create any that's is default package.

*/
import java.util.Scanner;//java is main package  util is a package Scanner is a class. .java package first inside util package that's why we can say nested package or hierarchical package
import java.util.ArrayList;//java is main package  util is a package Arraylist is a class.we can say nested package or hierarchical package
import java.util.Date;
public class packagein{
    public static void main(String[] args) {
       // java.util.Date today=new java.util.Date();
       Date today=new Date();
       System.out.println(today);
    }
}
