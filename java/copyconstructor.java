
public class copyconstructor 
{
    int length;
    int breadth;
    copyconstructor(int length,int breadth){
    this.length=length;
    this.breadth=breadth;
System.out.println(length);
    }
    //below is copy constructor because we are doing the copy the object inside constructor which means copyconstructor(cp).like constructor(object)
copyconstructor(copyconstructor c)//we create the object c for getting cp object.
{
length=c.length;//c.length denotes cp object.
breadth=c.breadth;//c.breadth denotes cp object.

}
void getting()
{
    System.out.println(length*breadth);
}

    public static void main(String[] args) 
    {
        copyconstructor cp=new copyconstructor(4,6);
        copyconstructor cp2=new copyconstructor(cp);//we pass object inside the constructor .
cp2.getting();
        //cp.copyconstructor();
    }
    
}
