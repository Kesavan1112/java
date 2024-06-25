//this pointer which is 'this' keyword which represent the object .if i call by object name b.dump().inside compiler called implicit like this.y=yello;//this keywoard refer the object values. 
public class thispointer {
    int y,z;
     void dump(int yello,int zebra){
        y=yello;//acutally compiler this.y=yello;which is implicity.we can give explicitly.
        this.z=zebra;
        System.out.println(this);//it prints current object address which hascode format in hexadeciaml foramt.
        System.out.println(this);//it prints current object.

System.out.println(this.z);

    }
    int u1,i1;
    int same(int u1,int i1){
        this.u1=u1;//when we use same name. then we should use this keyword because it does assign the  for instance variable if i don't use this keyword. ,it doesn't only assign the instance variable.it does assign for local variable which means what it has inside parameter.
        this.i1=i1;
        return u1;//System.out.println(u);
    }
    public static void main(String[] args) {
    thispointer b=new thispointer();
    b.dump(3,5);
    thispointer c=new thispointer();
    c.dump(3,5);
    System.out.println(c.same(9, 3)+"\n"+c.u1);

    }
    
}
