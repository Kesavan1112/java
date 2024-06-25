//varargs pronounces as where arcs.
//variable arguments that's varargs
public class varargs 
{
   static int maxvalue(int...vals)//this method purpose to find the maximum value .if i don't know how many value i give.then we should use only one  varags into  method .varags means ...vals or ...anyname.we can multiple parameter use but only one varargs use at end of method.this three dots it invites from SE 5.0 and we can't use multiple varargs.only one varargs .we can use method overloading in varargs.
    {
       int max=Integer.MIN_VALUE;//vals[0] this statement is getting the array format.
    for(int k:vals)
    {
        if(k>max)
max=k;
    }
   return max; 
    }
    static int minvalue(int...v){
      int min=Integer.MAX_VALUE;
      for(int y:v){
         if(y<min){
min=y;
         }
      
      }
      return min;

    }
    static double minvalue(double...v1){
      double min=Integer.MAX_VALUE;
      for(double y:v1){
         if(y<min){
min=y;
         }
      
      }
      return min;

    }
    public static void main(String[] args)
     {
       System.out.println(maxvalue(6,7,8));//if i don't any number.it gives default number of integer.
       System.out.println(minvalue());
       System.out.println(minvalue());//if i don't any number.it gives default number of integer.
      }
    
}
