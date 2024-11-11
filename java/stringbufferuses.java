
//StringBuffer is mutable (changeable).stringBuffer is thread safe .StringBuilder is not thread safe.

public class stringbufferuses {

public static void main(String args[]){

StringBuffer sb=new StringBuffer("change");
sb.append("changed");
String ss=sb.toString();//if you want that from StrinBuffer convert to String .you do use like String ss=sb.toString(); because you can't  use String ss=sb; which shows error like "stringbufferuses.java:9: error: incompatible types: StringBuffer cannot be converted to String" that's why 

System.out.println(ss);
System.out.println(sb);
System.out.println(sb.capacity());//default capcity value is 16.
System.out.println(sb.length());
System.out.println(sb.deleteCharAt(0));
System.out.println(sb);
System.out.println(sb.insert(0," first"));
sb.setLength(222);//we learn later setLength method.
sb.ensureCapacity(11);//we learn later ensureCapacity method.
System.out.println("capacity:"+sb.capacity());

System.out.println(sb.length());//it shows new length.




}

    
}
