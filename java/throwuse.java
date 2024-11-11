//throw (to learn  more)

class NotEnoughException extends Exception//while custom exception handle ,we do create class that custom exception name generally whatever name we can name for customexception but which should be extends by exception because of that is super  class of custom exception class or anyclass for exception.
{
/*double amount;
NotEnoughException(double am){
    amount=am;

}*/
}
public class throwuse {
    public static void main(String[] args) {
        
int bal=200,withdraw=300;
try{//throw also handle by try catch block.
if(bal<withdraw)//200<300
{
    // throw new NotEnoughException(bal);//this is customized exception handling by throw keyword .when parameter constructor used in NotEnoughException(double am){ amount=am;} within NotEnoughException.
    
    
throw new NotEnoughException();//we don't need to give because which creates default constructor itself in  NotEnoughException class that's why we don't need to give inside parenthesis.
}
}
catch(NotEnoughException f1){

System.err.println("this exception name is="+f1);
}

    }
}
