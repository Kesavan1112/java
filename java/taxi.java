import java.util.*;
public class taxi {
    public static void main(String a[])
    {
Scanner g=new Scanner(System.in);
int time,distance,taxino;
char stop1,stop2,usersstop;
System.out.println("book the taxi");
for(taxino=1;taxino<4;taxino++){
    System.out.println("taxinumber"+taxino);
}
System.out.println("total "+(taxino-1)+" taxi is avaiable");
stop1='a';
stop2='b';
System.out.println("you can go only this location");
System.out.println(stop1+"\n"+stop2);
System.out.println("enter your distance");
distance=g.nextInt();
System.out.println("enter your location");
usersstop=g.next().charAt(0);
System.out.println("enter your mintues");
time=g.nextInt();
if(distance<=10&&time<=20){

    System.out.print("your available taxi is one");
}
else if(distance>=10&&time>=20){
    System.out.print("your available taxi is two");

}





    }
    
}
