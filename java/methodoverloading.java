/*method overloading same method name but different datatype or  different parameter which means method overloading if we don't use method overloading in java .we do change the method name different.in c no method overloading 
 * important we can use constructor overloading also and same concept like method overloading.
 * 
*/
public class methodoverloading {
    int length,height,breadth;
    methodoverloading(int l,int h,int b){
        length=l;
        
        height=h;
        breadth=b;
        
    }
    void volume(){
        System.out.println(length*breadth*height);//-1*-1*-1=-1 //-1-1-1=-3
    }

    methodoverloading(){
        length=-1;
        height=-1;
        breadth=-1;

    }
    methodoverloading(int i){
        length=breadth=height=i;//everything same.

    }
//we have to return except void method.
    static int max(int a,int b){
        //System.out.println(a>bnull);
return a>b?a:b;
    }
   static int max(int a){
        
        return a;


    }
    static double max(double i,double j){
        
        return i>j?i:j;


    }
   static char max(char c,char p){
     return c>p?c:p;//it works according to ascii value.
// System.out.println(c>p);
    }

    public static void main(String[] args) {
   
        System.out.println(max(4,2));
        System.out.println(max(3));//if i give like this max(3,4) which does call  second max method.
        System.out.println(max('z','p'));
        System.out.println(max(8.0,6.6));
        System.out.println(Math.abs(-8.0));//Math.abs is method which is also overloading method.it always gives absolute value which means that if i give minus value.it gives positive as a positive value that's is absolute.
        System.out.println(Math.abs('a'));

        System.out.println(Math.abs(8));
        //below we will be initialized three types which is for how to overload the constructor.
methodoverloading mo=new methodoverloading(3,4,5);
mo.volume();
methodoverloading mo2=new methodoverloading();
mo2.volume();
methodoverloading mo3=new methodoverloading(4);
mo3.volume();

}
    
}
