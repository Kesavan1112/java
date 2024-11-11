class A1{
    public int d1;
    public int d2;

    A1(int a1,int a2){
    d1=a1;
    d2=a2;
}
A1(){
    d1=2;
    d2=3;
}
}
class B1 extends A1{
public int c3;
    B1(int a1,int a2,int c)
{
//super(a1,a2);//if i don't give super(a1,a2),it considers default super() but i used in super class empty constructor A1(){d1=2;d2=3;}

    c3=c;
}
void displayforB1()
{
    System.out.println("amount1="+d1);
    System.out.println("amount2="+d2);
    System.out.println("account3="+c3);

}
}
public class inheritwithconstrutor
{
    public static void main(String[] args)
    {
        B1 b=new B1(33,44,56);
        b.displayforB1();
    }
}
