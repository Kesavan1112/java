//default thread priority =>min_priority=1,norm_priority=5,max_priority=10.
//thread priority works by thread scheduler.thread scheduler which accepts first which thread have maximum priority.
/*
 * public static final int MIN_PRIORITY=1;
 * public static final int NORM_PRIORITY=5;
 * public static final int MAX_PRIORITY=10;
 */
//priority method they are two setPrior

class d1 extends Thread{
    public void run(){
for(int i=0;i<=5;i++){
    System.out.println("d1="+i);
    try{
    Thread.sleep(100);
    }
    catch(Exception g){}
}
    }
}
class d2 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("d2="+i);
            try{
            Thread.sleep(200);
            }
            catch(Exception dq){}

        }       
    }
}

public class threadpriority {
 public static void main(String args[])
 {
d1 dd1=new d1();
d2 dd2=new d2();
dd1.start();
dd2.start();
/*we can set the priority two ways
 * 1.setPiority(10);//we can give the value of priority
 * 2.setPriority(Thread.MIN_PRIORITY);//min_priority is static variable that's why we access from directly Thread class.static variable can access by class.
*/

dd2.setPriority(Thread.MIN_PRIORITY);
dd1.setPriority(10);
System.out.println("this is priority of dd2="+dd2.getPriority());
System.out.println("this is priority of dd1="+dd1.getPriority());




}   
}
