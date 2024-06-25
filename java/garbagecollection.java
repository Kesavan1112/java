//garbage collection =most of language we creat the object for class  after creation.memory allocated and deleted it automatically is doing in java by garbage collection .garbage collector module has already coded which means garbage collection.garbage collector inside the jvm. 
public class garbagecollection {
    int a,b;
    void kk()
    {
        System.out.println("motherfucker");
    }
   /*  void protected finalize()//before memory dereferce if you would like to work something.you can use finalize method which doesn't return anything and should be protected specifier.finalize is calling by garbage collector.
    {

    }*/
    public static void main(String[] args) {
  garbagecollection p=new garbagecollection();      
  p.kk();
    
//implicitly happen 1,2,3.
  //1.deference
p=null;
garbagecollection w=new garbagecollection();
//2.dereference
w=p;
//3.anonymous object
new garbagecollection();//it would be deleted the memory or deallocated  by garbage collector       

}
}
