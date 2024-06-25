import java.util.Scanner;
public class arrayhandlewithloop 
{
    public static void main(String[] args) {
        int []ar={2,3,4,45};
        
        System.out.println(ar.length);
       for(int x=0;x<ar.length;x++)//remeber when we use array with handle loop the we initial the value from zero and give less than .don't give less than equal to.
       {
        System.out.println(ar[x]+" ");
       }
       int b[]=new int[3];
       Scanner g=new Scanner(System.in);
       System.out.println("enter the array number");
       
int p=0;
       while(p<b.length){
        b[p]=g.nextInt();
 p++;
    }
     p=0;
    while(p<b.length){
       
        System.out.println("below arrays="+b[p]);
 p++;
    }
    /*for(p=0;p<ar.length;p++){
        System.out.println("below arrays="+b[p]);

    }*/
        

       }

}
    

