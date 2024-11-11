import java.io.OutputStreamWriter;
import java.io.Writer;//character stream 
import java.io.*;
import java.io.PrintStream;
public class writeruses{
   // public static void main(String args[])
   public static void main(String[] args) {
    
   

/*try(OutputStreamWriter s=new OutputStreamWriter(System.out)){
s.write(12);
s.write('a');
}
(or)
try{OutputStreamWriter s=new OutputStreamWriter(System.out);
    s.write(12);
    s.write('a');
    }
*/
try{

    OutputStream os = System.out;
//OutputStream s1=System.out;
os.write();
}
catch(Exception ss){}


try{
    OutputStreamWriter s=new OutputStreamWriter(System.out);
    s.write(12);
    s.write('a');
    s.write("dd");
    // s.write(🤣);
    // s.write(😀);//it does n't image only read character.
    s.flush();//flush is must ,if i don't use ,output does n't come. 
    }


catch(Exception e){
System.out.println(e.getMessage());
}




        
    }  
    
}
