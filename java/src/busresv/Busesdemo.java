package busresv;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
// import java.util.;;
public class Busesdemo 
{
    public static void main(String[] args) 
    {
    ArrayList<angryvechile>busy=new ArrayList<>();
    ArrayList<booking>bookings=new ArrayList<>();
      busy.add(new angryvechile(1,true,1));
      busy.add(new angryvechile(2,true,3));
      busy.add(new angryvechile(2,true,4));

      //Busy.add(b1);
for(angryvechile bu:busy){
      bu.display();
    }
      
        int useroption=1;
        Scanner sc1=new Scanner(System.in);
        while(useroption==1)
        {
            System.out.println("enter 1 which you can book or 2 which can cancel.");
            
            useroption=sc1.nextInt();
if(useroption==1){
    booking book=new booking();        
   if(book.isavailable(bookings,busy)){
    bookings.add(book);
    System.out.println("keep continuing the booking");
   }
          
else{
    System.out.println("thank you");
    

}
}

}
        
        /*switch (a) {
            case 77:
            System.out.println("booking");
                
                break;
        
            default:
            System.out.println(" not booking");

            //break;
        }*/
    }
}
class angryvechile {
    public int busno,capacity;
    public boolean AC;
   public angryvechile(int busno,boolean ac,int cap)
    {
      
      this.busno=busno;
      this.AC=ac;
      this.capacity=cap;

    }
    public int getcapcity()//accessor method
    {
      return capacity;
    }
    public void setcapcity(int cap)//mutator
    {
capacity=cap;

    }
    void display(){
      System.out.println("BUS NO:"+busno+"AC:"+AC+"CAPACITY OF BUS:"+capacity);

    }

    public static void main(String[] args) {
// bus b1=new bus(2,true,20);      
      //System.out.println("okay");  
    }
}

class booking
 {
String passengername;
int busno;
Date date;//we create the object for date.
booking(){
Scanner sca=new Scanner(System.in);
System.out.println("enter the passenger name");
passengername=sca.next();
System.out.println("enter bus no");
busno=sca.nextInt();
System.out.println("enter date dd-mm-yyyy");
String dateinput=sca.next();
SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");////small m indicates mintues.
try{
    date=dateFormat.parse(dateinput);//parse convert into date by use string.
}
catch(Exception e){
    e.printStackTrace();

}
}
 boolean isavailable(ArrayList<booking> bookings, ArrayList<angryvechile> busy)
{
    int capacity=0;
    for(angryvechile o:busy)
    {
if(o.getcapcity()==busno)
{
    capacity=o.getcapcity();
}
    }
int booked=0;
for(booking b:bookings){
    if(b.busno==busno && b.date.equals(date))
    {
    booked++;
    }


}
return booked<capacity?true:false;
}
}
    


