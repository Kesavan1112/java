//constructor in which should be class name 
/*
 * it is special method
 * same name as the class
 * immediately called when the object is created
 * used for initializating the values which means s=s1;
 * no return type
*/
public class constructorinjava{
 int s;
    constructorinjava(int s1){
        s=s1;//if i don't declare the variable .it will  come error. 
        System.out.println(s);
        // return s;//error

 }   
public static void main(String[] args) {
constructorinjava k=new constructorinjava(9);    //when we create the object it calls itself.
}    
}
