
/*we can say in array index or subscribt
 * some tips array
 * 1.int []a=new int[];
 * 2.int [] c1,c2,c3;
 * c1=new int[0];
 * c2=new int[1];
 * c3=new int[2];
 * two dimensional array
 * 3.int [][]a=new a[3][4];
*/
public class arrayinja {
    public static void main(String args[])
    {
        /*Integer a=100;
        Integer b=100;
        Integer  c=1000;MORE128or-128 it would show the false.
        Integer  d=1000;MORE128or-128 it would show the false.
        System.out.println(a==b);

        System.out.println(c==d);*/
        //1.array declare first method
        int marks[];//array decalaration which is allocate the memory.
         marks=new int[50];//we don't need square brackets like marks[]=new int[50];assign the array which creats the memory allocation from index 0 to 49.we can assign like this char,long.
         System.out.println("first method"+marks[0]);//if i didn't initialize ,it automatically zero.and one more thing is if i initialize with double.it will initialize 0.0.it reacts up to datatype.

         //2.array declare second method

        
int engli[]=new int[2];

        marks[0]=41;
        System.out.println("second method"+engli[0]);

        //3.array declare third method
int fd[]={2,3,4,5};//we can't give allocate the memory like fd[8].

System.out.println("third method"+fd[0]);

//two dimensional array
//1.first method two dimensional array
int d[][]=new int[2][9];//[2] is row and [9] is column.
d[1][8]=9;
System.out.println(d[1][2]);
//2.second method two dimensional array.
int f[][]={{4,3,45,9,0},{3,4}}; 
System.out.println(f[1][0]);

}
    
}
