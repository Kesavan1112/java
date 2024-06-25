//encapsulation-1.bind the code and data 2.public methods act as interface for accessing private data.3.protect data 4.enables us to write methods without any parameter as data and code are bound
public class encapsulation {
    //1.variables and method bind the classes normally.2.another point of view if i have private variable,i can access the private by using public method which is also encapsulation.3.and another one is by using object we can access the method without passing any parameter this also encapsulation.because we used the constructor that's why we passing parameter to constructor which would be initiliazed value it would pass value to method.
//example for encapsulation below.
    private int y;
  encapsulation(int x){
    y=x;//initialized.

}
int memo(){
return y;
}
    public static void main(String[] args) 
    {

encapsulation ec=new encapsulation(3);
System.out.println(ec.memo());
    
   } 
}
