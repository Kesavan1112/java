
package busresv;
import java.util.*;//date class created in built in java inside util.
import java.text.SimpleDateFormat;
public class booking
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
public boolean isavailable(ArrayList<booking>bo,ArrayList<angryvechile>Bus)
{
    int capacity=0;
    for(angryvechile o:Bus)
    {
if(o.getcapcity()==busno)
{
    capacity=o.getcapcity();
}
    }
int booked=0;
for(booking b:bo){
    if(b.busno==busno && b.date.equals(date))
    {
        booked++;
    }


}
return booked<capacity?true:false;
}
    

public static void main(String[] args) 
{
    

}
}

