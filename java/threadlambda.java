//we use lambda expresssion for thread 
public class threadlambda {
    public static void main(String args[]){
Runnable o=()->{
    for(int x=6;x>1;x--){
        System.err.println("for lambdaexpression by Runnable");
    try{
        Thread.sleep(300);
    }
                catch(InterruptedException s){}
}
};
Thread f=new Thread(o);
f.start();
Thread  d=new Thread(()->{
    for(int x=6;x>1;x--){
        System.err.println("for lambda expression by use Thread");
    try{
        Thread.sleep(100);
    }
                catch(InterruptedException s){}
}
});
d.start();

    }
}
