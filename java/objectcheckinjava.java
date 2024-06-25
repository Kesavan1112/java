public class objectcheckinjava 
{
    int l,b,h;
    objectcheckinjava(int len,int hei,int bre)//like this we can use method but we have to call separately that's why i create construtor.
    {
        l=len;
        h=hei;
        b=bre;

    }
    void j(){
        System.out.println(l*b*h);
    }
    boolean checktheobject(objectcheckinjava p2)//this method like other common method cause of if i recive object's value that's why i created object which means p2.
    //boolean must be  return true or false
    {
        if(l==p2.l&&h==p2.h&&b==p2.b)//l,h,b indicates the p1 object.p.l,p.h,p.b denotes the p2 object
        return true;//1
        return false;//0//we don't need else after true condition doesn't come return false.

    }
    public static void main(String[] args)
     {
        objectcheckinjava p=new objectcheckinjava(2,34,6);
        //p.k(10,10,10);
       // p.j();
        objectcheckinjava p1=new objectcheckinjava(20,34,6);
        System.out.println(p1.checktheobject(p));//we pass object that is 'p' .'p' passes to 'p2' object.
    }
    
}
