//if i don't need run concurrently,for example atm ,if i have an account and both atm card,i can't both access both card simultaneously.because of if i have 5000 into account ,both card use simultaneously which allow only one card.may be we can access each card 5000.it can't access.because we have only 5000.remember this story (javasir)


/*class table{
  synchronized void calculate(int qq)
    {
        for(int i=1;i<5;i++)
        {
       
            System.out.println(qq+"X"+i+"="+i*qq);
    try{
            Thread.sleep(2000);
    
        }
        catch(Exception f){}
}
}
}

public class threadsynchronization {
    public static void main(String[] args) {
        table r=new table();
        
    
    Thread ss=new Thread(){
        public void run(){

r.calculate(3);    

}
    
    };


Thread q=new Thread(){
    public void run(){
    
        r.calculate(5);    


    }

};

q.start();
    ss.start();
    
    }
    
}*/
class Cakecounter{
    int cakecount=0;
 
    public  void increment(){//if i use without synchronization,output would be inappropriate.
    cakecount++;


 }
}


class Team implements Runnable{
Cakecounter counter;

Team(Cakecounter counter)
{
this.counter=counter;//it means this.counter(this.counter which stores that what user gives)=what user given into team constructor bracket. 
}

public void run()//this is override method because of run method is runnable super class.
{
for(int i=0;i<1000;i++){
counter.increment();
}
}
}

class threadsynchronization{
    public static void main(String[] args) {
        
        Cakecounter counter=new Cakecounter();
        
        Thread t1=new Thread(new Team(counter));

        Thread t2=new Thread(new Team(counter));

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception s){}
        System.out.println(counter.cakecount);//if i don't handle with join() method,output comes zero.because main is also thread which runs initially.


    }
}





/***Synchronization** in Java is a mechanism that controls the access of multiple threads to shared resources (such as objects or variables). It ensures that only one thread can access a resource at a time, which helps prevent **race conditions** and ensures data consistency in multi-threaded environments.

### Why Synchronization is Needed:
In a multi-threaded environment, if two or more threads try to access a shared resource simultaneously, there could be unpredictable results, such as incorrect calculations, data corruption, or inconsistencies. Synchronization helps avoid these issues by allowing only one thread to work on a shared resource at a time.

### How Synchronization Works:
In Java, synchronization can be achieved in several ways, usually by locking the resource so that only one thread can access it at any given time. This ensures thread safety.

### Types of Synchronization:

1. **Synchronized Method**: The entire method is synchronized, meaning once a thread enters the method, no other thread can access it until the first one exits.
   
   ```java
   public synchronized void synchronizedMethod() {
       // only one thread can access this block at a time
   }
   ```

   In this case, the method is locked on the object's intrinsic lock, so only one thread can execute the method at a time for a particular object.

2. **Synchronized Block**: A block of code within a method can be synchronized, allowing you to lock only the critical section of the code instead of the entire method.
   
   ```java
   public void method() {
       synchronized (this) {
           // synchronized block, only one thread can access this part at a time
       }
   }
   ```

   Here, you can synchronize on any object, but most commonly, you synchronize on `this`, the current object.

3. **Static Synchronization**: Synchronizing a static method locks on the class’s intrinsic lock rather than the object's lock, so it applies to all instances of the class.

   ```java
   public static synchronized void synchronizedStaticMethod() {
       // only one thread can execute this static method at a time for the class
   }
   ```

### Locking Mechanism:
- When a thread enters a synchronized method or block, it acquires a lock on the object.
- Other threads trying to access a synchronized method or block on the same object are blocked until the first thread releases the lock by exiting the method or block.

### Example of Synchronization:
In the following example, multiple threads are trying to access and modify the `counter` variable. Without synchronization, there could be race conditions where the value of `counter` is inconsistent.

```java
class Counter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.getCounter());
    }
}
```
In this case, the `increment()` method is synchronized, ensuring that the `counter` variable is modified safely, and the final output will be correct (2000).

### Advantages of Synchronization:
- **Thread safety**: Prevents thread interference and race conditions.
- **Data consistency**: Ensures the consistency of shared resources in multi-threaded environments.

### Disadvantages of Synchronization:
- **Performance overhead**: Synchronization can cause delays due to thread contention and can lead to reduced performance if many threads are waiting to acquire a lock.
- **Deadlocks**: If not used properly, synchronization can lead to deadlocks, where two or more threads are waiting on each other to release locks, causing the program to hang.

### Conclusion:
Synchronization in Java is essential when working with shared resources in multi-threaded applications to ensure thread safety and data consistency. However, it needs to be used carefully to avoid performance bottlenecks and deadlocks. */