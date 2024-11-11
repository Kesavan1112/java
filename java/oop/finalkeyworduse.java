
//final keyword uses in variables,methods,classes which means you can't anything but access specifier private you can't access outside of class,final means =>1.you can't change the value when we use variable,2.you can't define the method or override from base class.3.you can't inherit class when we use final keyword in class.


/*final */ class a1 {//whether i give final before the class.it doesn't inherit to b1's class.
int s=10;
final void gets()
{
    System.out.println(s);
        }

}
class b2 extends a1{
    void am(){
        a1 h=new a1();
        h.gets();
    }
    /*void gets(){// i can't define or override this method because which is final method.
System.out.println(s);
    }*/
}





public class finalkeyworduse 
{
final int a=1;
    public static void main(String args[])
    {
finalkeyworduse fk=new finalkeyworduse();
b2 d=new b2();
d.am();
//fk.a=3;//we can't change here
 }
 }
