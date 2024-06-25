
//static block would call before object .
//static method inside access only static variable and we can utilize only static method.
//static method or variable we can call by class name.
public class staticuse
{ 
    static int count=0;
    static
    {
        System.out.println("this static block");
    }
    /*staticuse(){

    }*/
    void dummy(){
        System.out.println("method call by object");

    }
    static void method(){
        System.out.println("this is static method ");

    }
    staticuse(){
count++;

    }
    staticuse(int y){
        count++;
        
            }
    
    public static void main(String[] args) {
        System.out.println("inside main method before static block");
        staticuse st1=new staticuse(4);

        staticuse st=new staticuse();
        System.out.println(staticuse.count);//we can see how many object created by using static keyword.without static keyword i can't access that how many times object created.because if i use int .i can't access all object it's only specific object value.
        st.dummy();
        System.out.println("inside main method after static block");
staticuse.method();
    }
    
}
