//thread relevant topic threadrunnable.java,Threadanonymus.java,threadlambda.java,threadpriority.java

//actually multithreading is not java concept which comes from os(operating system).it is one of concept in java.
//thread =>segement of program
//multithreading=>more one thread run when cpu is free another thread come to run it takes just nano seconds by os sends thread to cpu.
//multiprocessing=it means when we use code,hear the song multiple process enabling simultaneously.
//servlet =>it is one of concept in java,it is called servlet class , which uses to handle http request in webpage.servlet has multiple threads ready for userthread.if users go into webpage.it assigns the thread for particular concurrently multiple users go into webpage which assign thread for each user .which works by multithreading concept.  


//Thread is standard class in java .
//when we use thread ,we have to implement which means inherit the thread class like (class classname extends Thread).


/*we can make two ways the thread.
1.extends Thread(class)syntax:class classname extends Thread
2.implements Runnable(interface)syntax:class classname implements Runnable,classname,classname(optional after Runnable we can use how many we want)=>threadrunnable.java
what is difference between extends Thread and implements Runnable?
*In Thread class,we can't achieve the multiple inheritence.
*In Thread interface,we can achieve the multiple inheritence.
*/
class worry extends Thread
{
    public void run()//run method defined into Thread class.it should be public.
    {
        for(int i=0;i<=5;i++){
System.err.println(i);
try{
Thread.sleep(1000);//we can give milli second here.
    }
catch(Exception d){

}
}
    }

    /*  public void run(int l){ //not work
        System.out.println("d*d:"+l);
    }*/

}
   
    class tows extends Thread{
        public void run(){
            for(int y=0;y<5;y++){
            System.out.println("two");
        try{
            Thread.sleep(500);
        }
        catch(Exception h){

        }
    
        }
        }
    void intelligent(){
        System.out.println("intelligent");
    
    }
}
        


public class multithreading {
    public static void main(String[] args) //main method also thread except main thread we can create separate thread
    {
        System.out.println("first");//this is runing by main thread


        worry w=new worry();//this is also thread now,worry's object is called Thread cause of worry class inherit the Thread class.that's why worry's object behave like thread. 
      tows w1=new tows();
        w.start();//this is also thread now,we able to start the thread by start() method.w.start() method go to check it's class method if it does have run() method,it does run() that method.
        // w.start(3);//not work
        /*try{
        w.join();
        }
        catch(Exception as){

        }*/
        if(w.isAlive()){
            System.out.println("executing");
        }

    w1.start();
    w1.setName("tows");//we can set name by using setName() method.
    System.out.println(w1.getName());//we can get name by using getName() method.
    try{
    w1.join();//join()method we have to do the try,catch block or throws.join() method prevent the main thread which means after completion twos class thread it allows the main thread. 
    }
    catch(Exception A){}
    w1.intelligent();////this is runing by main thread because of which does n't start by start() method and also this is normal method.
    System.out.println("last");////this is runing by main thread

if(w.isAlive())//isAlive() method checking if it is true,output shows that it is executing .if it is not alive ,output does n't show that it is executing.
{
    System.out.println("it is executing");
}
}
    
}
