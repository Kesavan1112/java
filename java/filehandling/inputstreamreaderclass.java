import java.io.InputStreamReader;
import java.io.IOException;
public class inputstreamreaderclass {


public static void main(String args[])
{

// try(){}what is bracket near try block.
try{
    InputStreamReader D=new InputStreamReader(System.in);
System.out.println("enter a number");
// System.out.println();
int letters=D.read();//only uses int for read()method and it does return char.

/*The ready() method of Reader Class in Java is used to check whether this Reader is ready to be read or not. It returns a boolean which states if the reader is ready.  */
while(D.ready()){
    System.out.println((char)letters);
    letters=D.read();

    

}
// D.close();//we don't implement after java 7 because it does implement itself.

}

catch(Exception e){
    System.out.println(e.getMessage());
}

}

    
}
