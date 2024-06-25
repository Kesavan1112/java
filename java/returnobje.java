public class returnobje 
{
    int length,height,breadth;

    returnobje(int len,int hei,int bre){
        length=len;
        height=hei;

        breadth=bre;


    }
    //below if i use boolean it return true or false .if i use class. i return the object.
    returnobje doubletheobjectvalue(){//if return the object and modified current object to another object .to use syntax:classname methodname(){returnobje h=new returnobje(2*length,2*height,2*breadth);return newobject;};
        returnobje h=new returnobje(2*length,2*height,2*breadth);
        /*h.length=2*this.length;//this.length means rob object's value. we can use like this or  returnobje h=new returnobje(2*length,2*height,2*breadth);

        h.height=2*this.height;
        h.breadth=2*this.breadth;*/
        System.out.println(h);
        return h;

    }
public static void main(String[] args) 
{
returnobje rob=new returnobje(4,3,6);
returnobje o=rob.doubletheobjectvalue();//o is object o is reference of h object because doubletheobjectvalue return the h object.
System.out.println(o.breadth);
System.out.println(o.length);

System.out.println(o.height);
}
    
}
