
/*In Java, the superclass of FileReader is InputStreamReader.
Here's a breakdown:
FileReader:
A convenience class for reading character files. It reads text from a file using the platform's default character encoding.
InputStreamReader:
A bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified character encoding.*/

import java.io.FileReader;
import java.io.IOException;//compile time exception
import java.io.*;

public class filereaderclass {
    
public static void main(String[] args) {
    

try{

    
FileReader fr=new FileReader("filreads.txt");
int a1=fr.read();

/*The ready() method of Reader Class in Java is used to check whether this Reader is ready to be read or not. It returns a boolean which states if the reader is ready.  */
while(fr.ready()){
System.out.println((char)a1);//it does come as unicode when we don't utilize a character.
a1=fr.read();

}

}
catch(Exception e){

System.out.println(e.getMessage());

}

}


}
