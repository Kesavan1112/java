//abstract class in java 
/*
*we do use abstract method or don't use abstract method when we use abstract class.
*if we use abstract method before we utilize abstract in class like (abstract class classname)
 * we can't create object for abstract class
 * we can create reference for abstract class
 * abstract method without implementation which means you can't define method.
 * Rectangle r1=new Rectangle();when we  use new keyword and assign to r1 that is object.
 * Rectangle r1;when we don't utilize new keyword ,that's why r1 is reference.
 *if i don't create object or instantiate (object or instantiate both are same),i use abstract class.
 *if i declare any abstract method ,which should be defined that method what class inherit abstract class ,if i don't define abstract method ,error will come.
  
  
  
  
  
 
 */

abstract class member{
   private String name;
     abstract void welcomemessage();
void ones(){System.out.println("this is abstract class");}
}

class student extends member{
    void welcomemessage()//we are override abstract class.
    {
        System.out.println("student class");
    }
void ones(){System.out.println("this is student");}
}

class teacher extends member{
    void welcomemessage()//we are override abstract class.
    {
        System.out.println("teacher class");
    }
}



public class abstractclassinjava 
{
    public static void main(String args[])  
  {
student s1=new student();
teacher t1=new teacher();
member mem=new student();//we can create like this member mem=new student();
//mem.welcomemessage();
mem.ones();
member mem1=new teacher();//we can create like this member mem1=new teacher();
//mem1.welcomemessage();


//  member m1=new member();//we can't  create the object for abstract class it shows message that error: member is abstract; cannot be instantiated

//to create array object.
member arrobj[]=new member[3];//we create array object here.
arrobj[0]=new student();//we assign object to array.
arrobj[1]=new teacher();
arrobj[2]=new teacher();

System.out.println("this is array object="+arrobj[1]);

for(member f : arrobj){
    try{
    f.welcomemessage();
    }
    catch(Exception s){}
    // System.out.println("after for each method this is array object=");

}



  }
}
