//inner class or nested class.

//i understood every class will create class file after compiled.
class outer{

boolean showdeets=true;
void shows(){
    System.out.println(showdeets);
}
class inner1{

    boolean showy=false;
    void shows(){
        System.out.println(showy);

    }

}

 static class inner2{

    char showy='a';
    void shows(){
        System.out.println(showy);

    }}
}


public class innerclass {

    public static void main(String args[]){
outer o=new outer();
o.shows();
    outer.inner1 i1=o.new inner1();//when we don't use static keyword for inner class,create object for inner class like this.structure :outerclass.innerclass object=outerclass's object.new innerclass();
    //class file creation for inner class=> class file created outer$inner1 after compiled .
    i1.shows();

    outer.inner2 i2=new outer.inner2();//when we use static keyword for inner class,create object for inner class like this.structure :outerclass.innerclass object=new outerclass.innerclass();
    //class file creation for inner class=>class file created outer$inner2 after compiled .
    i2.shows();
    }
    
}
