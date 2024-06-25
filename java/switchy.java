//if else and switch are selection statement in java.
import java.util.Scanner;
public class switchy {
public static void main(String arg[])
{
int a=2,b=9;
Scanner ge=new Scanner(System.in);
System.out.println("enter the operator=");
char f=ge.next().charAt(0);//i can scan the character value.syntax:scanner's object.next.charAt(0);inside parenthises should be index zero.but we can use like ++.
if(f=='+')
{
System.out.println(a+b);
}
else if(f=='-')
{
    System.out.println(a-b);
}
else if(f=='*')
{
    System.out.println(a*b);
}
//we can switch
switch(f)
{
    case '+':
    System.out.println(a+b);
    break;
    
    case '-':
    System.out.println(a-b);
    break;

    default:
    System.out.println("nothing");
    

}
}    
}
