//package is collection of class.
//public-you can access anywhere within class or outside of class. 
//private -only within class.
// default-only within package works.default means if i don't give anything .it would be default package. 
//if i need same name class .we can use different package it,conflict not come .easily organize.
//sometimes,package and class same then we can name package like com.packagename

import java.util.Scanner;//java is  main package,util is subpackage,Scanner is class.that's we can say nested package or hierarical package.

//packagee is default due to i don't give any package name that's why it takes automatically default package.
import java.util.ArrayList;
import java.util.Date;
//import java.lang.Math;//step 1 for math.
import static java.lang.Math.sqrt;//introduce Static import in jdk se(standard edition)5.0
public class packagee {
public static void main(String[] args) {
// java.util.Date today=new java.util.Date();//we don't import at top. we use before.
Date today=new Date();
System.out.println(today);

//System.out.println(Math.sqrt(20));//square root is static method that's why we use class name Math.sqrt().//step 1 for math.
System.out.println(sqrt(6));



}    
}
