//when you make type conversion,remember variable's data type should be left side  higher than right side.
/*int =4bytes
short=2bytes
long =8bytes
float =4bytes =>upto 7 decimal digits
double =8bytes=>upto 15 decimal digits
boolean =1byte=>true or false we must give boolean we don't give boolean.
char =2bytes=>single character we should use single quote only whatever  we can use inside single quote like'^''%'or''5'
byte =1bytes*/

/*typeconversion key point:
 1.only number uses within this int ,long,byte,short we can use whatever and same time to see 
 bytes value for left side and right side.
2.above concept other type conversion .except char and boolean.
 
*/

public class typecoversion
 {
    public static void main(String args[])
    {
        byte p=3,j;
        int u;
        char opp='r';
        System.out.println(opp);
        //p=u;//it should be error.
        u=p;//implicit type conversion.
        
  //      System.out.println(p);
        System.out.println(u);
 double u1=4.1101f;
float g;
//explicit syntax smalldatatypebytevariable=(smalldatatypebyte)bigdatatypebytevariablevalue.


g=(float)u1;//explicit type conversion
System.out.println(g);
    }
    
}
//sometime output irrelevant may come because datatype range different.byte range=128to-128.but int range different.
