//stack memory-store methods,local variables .
//heap memory-store when we use new keyword then it stores heap memory.our object reference stored in heap memory.eg classname cl=new classname(); and known as dynamic memory location.
/**
 * callbyvalue
 */
//first we should understand if i global variable declare  int a=9;,inside method i do increment and it would be incremented but if i give value from psvm inside like inc(2);it won't be increment because main method that's work only inside the main method and it does pass the value usually  inside method multiply plus or anything by giving value like this inc(1,2);it does work as call by value     
public class callbyvalue {
 
   static int len1;
     callbyvalue(int l1){
        len1=l1;
     }

     int len,hei,bre;
    callbyvalue(int l,int h,int b)
    {
len=l;
hei=h;
bre=b;


System.out.println("length="+ ++len);
   }

 /*   boolean isequal(callbyvalue cv){
    len++;
    if(len==cv.len&&hei==cv.hei&&bre==cv.bre)
    return true;
    return false;
   }*/

  

   void dumy()
   {
    len++;
    System.out.println(len*hei*bre);
   }
   
   
static int a=10;
    static void inc()//call by value be
{
a++; 
System.out.println(a);

} 
static void incr(int b)//call by value 
{

b++; 
System.out.println(b);

} 

/*static int isequa(callbyvalue cv){//call by reference we can change original value the value from inside main method because v2 object passes to cv object both are same they indicates same referece.which is stored heap memory.but call by value doesn't change the original value.because which is stack memory.
    len1++;
    //if(len==cv.len&&hei==cv.hei&&bre==cv.bre)
    return len1;
    
   }*/
    public static void main(String[] args) 
    {
 callbyvalue vv=new callbyvalue(1);
 /*System.out.println(isequa(vv));
 System.out.println(isequa(vv));
 System.out.println(isequa(vv));*/

 int b=1;
//  System.out.println(inc());
//  System.out.println(inc());
inc();//we can change the value because which is inside the class and global scope but if it is inside the method which would be local scope.that's we can't change the value
inc();
inc();
incr(3);// it is inside main method which would be local scope.that's we can't change the value
inc();
incr(3);
incr(3);
incr(3);

callbyvalue v=new callbyvalue(1, 2, 2);
callbyvalue v2=new callbyvalue(1, 2, 2);
/*System.out.println(v.isequal(v2));//we can change the value from inside main method by using object sake of which is reference.
System.out.println(v.len);
System.out.println(v.isequal(v2));

System.out.println(v.len);
System.out.println(v.isequal(v2));
System.out.println(v.len);*/


v.dumy();//these method also increment because recieving the element from refernce .
v.dumy();
v.dumy();

       
    }
}
/*simply understand call by value and call by reference.
1.call by value which never change value from main method which is store stack memory.
2.call by reference we can change value from main method by using object.which is store heap memory.

*/