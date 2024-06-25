//class is template and blue print,object is instance
// class{Attributes:username,pwd.Method:register(),changepassword()}
//object creation another way first h;h=new first();
//we can create only one class which means we can't create another class inside the class
//when we  create class which doesn't create any memory.only create the memory when we create the object.we can create multiple object to single class.and multiple object has separate memory.
class first{
    int a=9;//instance variable
    int b,c;
//int b,c;
    int add(int b,int c)
{
return a+b;
}

}
public class classandobject {
    public static void main(String args[]){
first h;//not create object because no new keywoard
h=new first();//objectcreation=>syntax classname object=new classname()//when we create object which creats the memory and use new keyword =>Box blackBox=new Box();
b=8;//error.
h.b=4;//

System.out.println(h.b);
System.out.println(h.c);//without assign anything which will be zero because we used the object'h' .object is created by 'new' keywoard.

System.out.println(h.a+""+h.add(4,7));
    }
    
}
