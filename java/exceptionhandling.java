//Exception handling->try,catch,finally,throws(to learn deeply),throw(throwuse.java)
/*
checked exception-compile time exception.eg:FileNotException
unchecked exception-run time exception.eg:ArithmeticException,NullPointerException.

Exception is  a class.

ArithmeticException is run time exception.runtime exception is sub class of exception class.ArithmeticException is sub class of runtimeException.


 *try{if any error comes inside block it does throw exception to catch block .we able to exception by Exception's class object like(catch(Exception e){})} 
 *single try multiple catch we able to handle.
 *if i handle multiple catch ,initially we don't give catch block like this catch(Exception e) because it does handle only it.
 */
import java.io.*;//for input stream and output stream
import java.util.Scanner;//for scanner
 public class exceptionhandling {
   public static void main(String args[])//throws FileNotFoundException
   {
    int a=10,b=0,c;

    try{
        int arr[]=null;
        System.out.println(arr[1]);//when we utilize try block and simultaneausly error occur this line, code does n't excute after this line cause of  which goes to catch statement for catching it's error.if it doesn't have error here,it goes next line. 
        // throw new NullPointerException("demo1");//usually throw keyword utilizes for custom exception.
        c=a/b;//when i don't give try block,this program stopped at this line.it does run only until this line.we don't code like that. we should handle with try catch block.
    System.out.println(c);
    System.out.println("end of the program");



     
    }
    catch(ArithmeticException g)//we can use catch block by or(|) which introduces from java 1.7 before we use separate .how to utilize or(|) like catch(ArithmeticException|NullPointerException e).Exception is a class g is object of Exception's class.this only for arithmetic exception.if i don't give any catch block for nullpointerException below this.it will throw exception by jvm.   
    {
        //System.out.println(g);//we can use System.err.println();err which shows red that's all.
        System.out.println("error occurred by Arithmetic");
    }
    catch(NullPointerException f){

        System.out.println("error occurred by nullpointer");

    }
    catch(Exception a1){
        System.out.println("error occurred ");

    }

    finally{
System.out.println("demonstration");//this block will execute ,despite try catch blocks error occurr or not occurr.
    }
    System.out.println("after compeletion");
File r=new File("upcastingdowncastin.txt");
try{
FileInputStream fs=new FileInputStream(r);//fileinputstream process  File's object here,we can handle two way the fileinputStream one is with try and catch block,another one is throws,throws use like beside the main method eg:public static void main(String args[])throws FileNotFoundException but when we use can't handle the error like try,catch (if error occurr in try block to go catch block for handling that error.)
//System.out.println(fs);
}
catch(FileNotFoundException d)
{
d.printStackTrace();
}

/*
int y;
Scanner s=new Scanner(System.in);//acutally when we use scanner,we have to close properly like s.close().
y=s.nextInt();
s.close();
System.out.println(y);*/

//mainly uses the try with reference for to close itself like s.close().
int i;
try(Scanner s1=new Scanner(System.in))//this syntax called try with refernce.try()we have to create scanner object within try parenthesis.not only scanner ,we can utilize bufferreader,file.
{
    i=s1.nextInt();//we don't need to create scanner class close like s1.close() cause try block closes itself.
}
System.out.println(i);
// catch(){}
} 
}
