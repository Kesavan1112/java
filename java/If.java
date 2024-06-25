import java.util.*;
public class If {
    public static void main(String k[])
    {
    Scanner g=new Scanner(System.in);

        System.out.println("enter the number");
   try{     
    int t=g.nextInt();
if(t>=1)
{
    
    System.out.println(t+"is positive number");
    
}
else{
    if(t==0){
        System.out.println(t+"is neutral number");


}
else{    
    System.out.println(t+"is negative number");
}
   }
}
   catch(Exception ec)
   {
    System.out.println(ec);

   }
int d;

    
}
}