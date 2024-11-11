//we use anonymus class for thread
public class Threadanonymus {
public static void main(String args[])
{    
   Runnable b=new Runnable()//anonymus class 11.06.40
    {
    
   
    public void run() {
        for(int x=6;x>1;x--){
            System.err.println("for anonymus class by Runnable");
        try{
            Thread.sleep(300);
        }
                    catch(InterruptedException s){}
    }
    }
};
Thread w=new Thread(){
    public void run() {
        for(int x=6;x>1;x--){
            System.err.println("for thread unanoymus by use Thread");
        try{
            Thread.sleep(100);
        }
                    catch(InterruptedException s){}
    }
    }
};

w.start();
Thread s=new Thread(b);
s.start();
}
}