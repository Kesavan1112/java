
import java.io.*;
public class filewriterclass {
    public static void main(String ll[]){

        try{
FileWriter fw=new FileWriter("filreads.txt",true);//if you want to append,this statement should be  added true FileWriter fw=new FileWriter("filreads.txt",true).and don't use write() you do utilize append fw.append("11 added new things");
fw.write("Français: à, é, è, ô");//because working by universal language.
fw.close();//https://chatgpt.com/share/672e2b6a-7430-8010-ae38-4ef3e4ce6e9a

        }
        catch(IOException e){

        }

    }
}
