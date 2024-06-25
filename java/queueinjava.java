public class queueinjava {
     int s[]=new int[3];
    int indexque=-1;
     void enque(int addque){
        s[++indexque]=addque;//0,1,2
        
        System.out.println(s[indexque]); 

    }
    int k=-1;

    void deque()
    {
        
        indexque=++k;
        if(indexque<3){

        System.out.println(s[indexque]);
        }else{
    System.out.println("queue is empty");
    
}
    }
    /*void test(){
System.out.println(++k);
    }*/
    public static void main(String[] args) {
       queueinjava qja=new queueinjava();
qja.enque(10);
qja.enque(11);
qja.enque(12);

       qja.deque();//0 
qja.deque(); //1
       qja.deque(); //2

        //qja.test();
    //    qja.test();

qja.deque();//queue is empty 

       qja.deque(); //queue is empty
    }
    
}
