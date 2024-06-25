
//getting input 

import java.util.Scanner;//it is package of scanner f
public class input {
    public static void main(String[] args)    
     {
        Scanner v=new Scanner(System.in);//System.in is predefined object of inputstream .Scanner is inbuilt class.scanner() is object.

System.out.println("enter the your name:");
// we should use nextLine() for string.  
       String f=v.nextLine();//nextLine scanning the value.String is a class.
       System.out.println("enter the your age:");
       int g=v.nextInt();//small number we can use int
v.nextLine();
       System.out.println("enter the phone number:");
       long h=v.nextLong();//big number we can use long

      v.nextLine();//We can use  v.nextLine(); after numeric input .because sometime output come mistake.
//note:if i use numeric value input before string.i use nextLine() for string.then i click enter .enter consider nextLine() that's why output come irregulary.for which we give v.nextLine(); after numeric input.
      System.out.println("enter the your  rating:");
     int h1= v.nextInt();
     v.nextLine();

     System.out.println("enter the address:");
     String lop=v.nextLine();

     System.out.println("enter the email id");
     String em=v.nextLine();

    
       
        System.out.println("your name :"+f);
        if(g>=18){
        System.out.println("your age :"+g);
         } else{
        System.out.println("your not eligible because your age is"+g); 
        }System.out.println("your phone no: "+h);

System.out.println("your rating is"+h1);
System.out.println("your Address is"+lop);
System.out.println("your email id: "+em);

/*
pyramid:
System.out.println("enter the i would make the paramid");

int test=v.nextInt();
System.out.println(test);

System.out.println("\t"+test+""+test);
System.out.println(test+""+test+""+test);
*/
}


}
