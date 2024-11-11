//implements Runnable 
//thread priority ,interthread communication=>notify(),notifyAll(),wait(),synchronization,final method=>today topic
class access implements Runnable{
  
    
    public void run() {
        for(int x=6;x>1;x--){
            System.err.println("for runnable implementation");
        try{
            Thread.sleep(300);
        }
                    catch(Exception s){}
    }
    }
}
class sec extends Thread{
    public void run(){
        for(int e=0;e<5;e++){
            System.out.println("for extends thread");
            try{
                Thread.sleep(100);
            }
            catch(Exception s){}
        }
    }
}
public class threadrunnable {
  public static void main(String[] args) {
//Runnable r1=new access();//Runnable object is getting access's reference and assigning to runnable interface's object we can create like this. after create .to pass Runnable object as argument into Thread class parenthesis.due to Runnable is not inherit the Thread class but we can use for achievement the multiple inheritence by in multithreading with (implements Runnable).

//we can create object two ways for implements Runnable one is which class inherit(implements) Runnable that  directly create like  access ac=new access(); an another one is Runnable r1=new access();

 access ac=new access();
Thread th1=new Thread(ac);
th1.start();    
sec q=new sec();
q.start();
}  
}
