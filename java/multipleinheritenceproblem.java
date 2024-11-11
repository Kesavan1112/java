

class A{
    void display(){
        System.out.println("form A class");
    }
}
class B extends A{
    void display(){
        System.out.println("from B class");
    }
}
class C extends B{
    void display(){
        System.out.println("from C class");
    }
 }


class multipleinheritenceproblem{

    public static void main(String arg[])
    {

A en=new B();//multiple inheritence problem is if you call display method,then c class don't have display method,it calls display method of B.that's why java implemented interface concept.
en.display();


    }
}










































































