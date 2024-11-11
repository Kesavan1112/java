/*
 * Bufferreader usage to get input only .
 * Bufferreader uses readLine()
 */
import java.lang.String;
import java.io.*;
public class bufferereaderuses {

public static void main(String args[]){




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
try{
BufferedReader br=new BufferedReader(new FileReader("filreads.txt"));//new BufferedReader(Reader.in); 
System.out.println(br.readLine());//

}
catch(Exception w){
System.out.println(w.getMessage());
}

}

    
}
