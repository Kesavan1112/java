//jump statement or loop control statement such as break,continue
//for a given n,find the nearest number divisible by 10 that is less than or equal to n
import java.util.Scanner;
public class jumpstate {

    public static void main(String args[])
    {

        int n;int sum=0;//without initiliaze we can't run.
        Scanner t=new Scanner(System.in);
        System.err.println("enter the n number:");
        
        /*while(n>10){
            if(n%10==0){
        System.out.println(n);
        break;
    
        }
        n--;

        
        }*/
        while(true){
            n=t.nextInt();
            if(n<=-1){
                break;//break is everything after condition true.
            }
            sum+=n;//sum=sum+n//0+infinite value .for example infinite value is 2 3 4 finally i got 2+3+4=7;
            }
System.out.println(sum);
        
    for(int w=0;w<=3;w++){
        for(int r=0;r<=4;r++){
        if(w==2&&r==2){
System.out.print(" ");
        continue;//it only stop  condition and it would continue to execute.
        }
        System.out.print("w");
        }
        System.out.println();

    }
}}
    /*break->it would break everything.
     * continue->it break particular.
        */