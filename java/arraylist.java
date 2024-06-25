import java.util.ArrayList;//Arraylist is class  because i gonna use ArrayList.
public class arraylist {
    int len,hei,bas;
    arraylist(int l,int b,int h){
        len=l;
        hei=h;
        bas=b;

    }
    public static void main(String args[])
    {
       //syntax ArrayList<whattype>anyname=ArrayList<leftwhattypeigiven>();or if i need arrayList for. syntax:ArrayList<classname>anyname=ArrayList<leftclassname>();
ArrayList<arraylist> arrlis=new ArrayList<arraylist>();
arrlis.add(new arraylist(1, 2, 2));
        ArrayList<Integer> num=new ArrayList<Integer>();//
        num.add(4);//position 0
 num.add(5);//position 1
       /*  num.add(5);
        num.add(5);*/
num.remove(1);//we give position what  i've to remove.
        System.out.println(num);
    }
}

