
//if i give method inside public static void main().it would come error that's why you give out of curly braces.
//method needs input that's inside parameter.like (int a,int b)
//i can call the methods multiple times.
//if i use void ,i don't need to return anything.
public class methodsinjava {
    int height;
    int weight;
    int heightmeasure(int h,int w)//header of method , parameter of method
    {
    return h*w;  //body of method
    }//overall method definition.
     int metusedi(int hei,int wei)
    {
height=hei;//if i assign for height i had to instance variable should have declared
weight=wei;
return wei*hei;

    }
   static void withoparmet()//static keyword use here without static keywoard i call method inside main function it will come error.
    {
     System.out.println("-----------");
    }
    public static void main(String[] args) {
        System.out.println();//println() is method of java.io.Printstream.Printstream is class and println() method contained inside Printstream class.
    //1. method syntax:datatype methodname(int a,int b,int c)//we can give anything inside the parameter like float or double and so on{}
//2.method syntax:datatype methodname()//without parameter{}
    
withoparmet();    
    methodsinjava j=new methodsinjava();
    int y=j.heightmeasure(2,3);//call or invoke the method and passing the value or arguments.
System.out.println(j.metusedi(4,5));
    System.out.println();
withoparmet();
    }
    
}
