import java.io.BufferedWriter;
import java.io.FileWriter;

public class bufferewriterclass {

    public static void main(String SS[]){


try{

    BufferedWriter bw=new BufferedWriter(new FileWriter("filreads.txt"));
bw.write("new added");
    bw.close();

}catch(Exception e){}

    }
    
}
