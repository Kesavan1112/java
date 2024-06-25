import java.util.Scanner;

public class switchsttricky {
    public static void main(String ar[])
    {
Scanner ne=new Scanner(System.in);
System.out.println("enter the your as a number");
char t=ne.next().charAt(0);
switch(t)
{
    case '1'://WHEN We use char datatype.i only use single quote.when i use int. i don't use single quote just give mere number. 
    System.out.println("monday");
    break;
    case'2':
    System.out.println("tuesday");
    break;

}
System.out.println("enter your alphatic");
char yu=ne.next().charAt(0);
switch(yu)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println("these are vowels");
break;
default:
System.out.println("these are consonat");
break;
}
    }
    
}
