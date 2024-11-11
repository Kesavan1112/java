
/*simply we can understand interface which says what to do but  don't say how to do.*/
//interface in java like abstract class but slight difference sometimes it is better than abstract class.

//*inside interface everymethod should be only define that means implicitly public abstract void methodname();which means we don't need to give any explicitly public abstract because interface default it.

//*we can achieve the multiple inheritence
//*we should use implements keyword for inherits the interface.and if i need more than one i use comma.
//*when we implement interface from class .we should be declared interface's method.


/*base class,super class,parent class.
 * derived class,sub class,child class
  */
/*with dynamic binding
class vehicle{
    void ride()
    {}

}

class car extends vehicle{
    void ride(){
        System.out.println("your riding the car");
    }
}
class bike extends vehicle{
    void ride(){
        System.out.println("your riding the bike");
    }
}

class mechanic{
    void check(vehicle c){
        System.out.println("checking");
        c.ride();

    }
}

public class interfaceinjava {
    public static void main(String args[])
{
mechanic mech=new mechanic();
car t=new car();
bike b=new bike();
mech.check(t);    
mech.check(b);
}
*/

//without dynamic binding

/*class car{
    void ride(){
        System.out.println("your riding the car");
    }
}
class bike{
    void ride(){
        System.out.println("your riding the bike");
    }
}

class mechanic{
    void check(car c){
        System.out.println("checking");
        c.ride();

    }
}

public class interfaceinjava
 {
     public static void main(String args[])
{
mechanic mech=new mechanic();
car t=new car();
bike b=new bike();
mech.check(t);    
//mech.check(b);
}
}*/
/*the main difference between interface and abstract.we can inside multiple method but one should be abstract method whereas interface should be every method declare only like all method are abstract method.
abstract class firsinterface{
   abstract void sum();

}*/
interface firsinterface//usually we can add suffix for in last that is able like firsable.
{
    //interface does n't able to create instance variable.instance variable means without static variable.
    int mac=100;//final and static
     void sum();
    //default=>it means=> public abstract void sum();

//we able to declare the method inside interface from java 1.8 but one thing is paramount that is we use keyword name is default.and we can override .
default void ad(){
    System.out.println("default method declare the inside interface");
}

}
class numberone implements firsinterface
{
    int d=9;
    public static final int d1=10;// this constant which means we can't change that's final that's why we are using final.public static final int d1=10; or public final static int d1=10; both are same.


public void sum()//because already public that's why we have to give public.if i don't give public.it takes default.if it is default ,it doesn't show other package that's why show the error.
{
    System.out.println("testinterface");
}
}
public class interfaceinjava{
    public static void main(String[] args) {
     //firsinterface g=new firsinterface();//we can't create object for interfacelike this but firsinterface g=new nummberone();
        numberone h=new numberone();
        firsinterface d=new numberone();
        d.sum();
        h.sum();
        d.ad();
        h.ad(); 
        h.d=0;
        // h.d1=30;//error will come.we defined as final.
        System.out.println();

        System.out.println(h.mac);
        // System.out.println(g);
    }
}

/*actually when we should use interface.if i need multiple inheritence. i use interface.if i don't need to declare all method then i able to utilize the interface.when we should use abstract particular method only declare i use abstract class. */