//anonymous in java
/*In Java, an anonymous class is a local class without a name. It is often used when you need to create a one-time-use class with a short lifespan, usually to override methods or implement interfaces without formally declaring a separate class. 
 * we use anonymous class
 * we use interface with anonymous class
*/
/*class A1{
    void display(){
        System.out.println("this is a1");
    }
    void non(){
        System.out.println("this is a1");
    }
}
class b1 extends A1{
    void display(){
        System.out.println("this is b1");
    }
}*/
//sam(single abstract method)or functional method both are same.single abstract method or functional interface which means if it is one abstract method declare in interface,that's single abstract method or functional method.
interface ones{//if it is sam(single abstract method) interface or functional interface ,we can utilize lambda expression from java 1.8
void twos();

}
class anonymous{
    public static void main(String args[])
    {
/*A1 a=new b1();
a.display();*/
////defining anonymous class new TypeName() { // body of the anonymous class };
/*A1 a=new A1(){

    void display(){
        System.out.println("this is b1");
    }
    void non(){
        System.out.println("non");
    }
};
a.display();
a.non();
A1 a1=new A1();
a1.display();*/
 ones h=new ones()//this anonymous class utilizes for interface
 {
    void gen(){System.out.println("this for interface in anonymous class");
}
public void twos()
{
    gen();
}


 };
 h.twos();//we can't access when we don't have override method.
}
}