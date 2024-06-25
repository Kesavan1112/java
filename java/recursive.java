import java.util.*;
public  class recursive {
//normal method for factorial 
  /* *  static int a=1;
    static void factorial(){
        Scanner s1=new Scanner(System.in);
int d=s1.nextInt();
        for(int a1=1;a1<=d;a1++){

a=a1*a;

}
System.out.println(a);
    
}*/
// recursive method
// factorial 5!=5*4*3*2*1=120 formula n!={1.n*(n-1)!only for n>0.
    //2.1 only for n=0.}
  static int fact(int n)
{//if i use return type and same time if condition statement use and need else statement .it doesn't need else because we can use return keyword instead of else statement.
if(n==1)
return 1;//this return statement is like end condition.we can achieve the return statement when we use end condition.
return n*fact(n-1);//we call the method inside the same method that is recursion
/*steps below:
1.n*fact(n-1)=>5*fact(4)
2.5*4*fact(3)
3.5*4*3fact(2)
4.5*4*3*2fact(1)
5. 5*4*3*2*1fact(0)
6.5*4*3*2*1*1*/ 

}
    public static void main(String[] args) {
// recursive.factorial();
System.out.println(fact(5));

    }
    
}
