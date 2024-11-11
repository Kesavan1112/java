
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileclassuses {
    
public static void main(String[] args) 
{
    try{
        //file creation
File f=new File("first.java");
f.createNewFile();
//file write
FileWriter fw=new FileWriter(f);
fw.write("only super star");
fw.close();
//file read
BufferedReader br=new BufferedReader(new FileReader("first.java"));
System.out.println(br.readLine());
//file delete
File f1=new File("second.java");
f1.createNewFile();
  if(f1.delete()){
      System.out.println(f1.getName());

}
    }
    catch(IOException e){

    }


}

}
