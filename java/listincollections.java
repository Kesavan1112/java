
//Arraylist is support redunancy which means if i give "lis.add("one")and again "lis.add("one")" it stores two times.Arraylist class created by array in background arraylist class 11.19.55.
import java.util.*;//list is inside java.util package.if i store orderly,i able to utilize Arraylist,Linkedlist.
public class listincollections {
    public static void main(String[] args) {
        
int a[]=new int[5];//fixed size we can't change size if i change the size ,i can change only in source code

//syntax:ArrayList<>
ArrayList<Integer>list=new ArrayList<Integer>();//arraylist is not fixed size we can add,delete,insert how many we want.which is so flexible and inside angular bracket which is Integer and Integer is wrapper class.
list.add(23);
list.add(2);
list.add(233);
list.add(2333);

System.out.println(list);

/*methods
get();
set();
remove();
contains();
clear();//we will learn later
clone();//we will learn later
* 
*/
System.out.println("index is of array then we should use get method="+list.get(2));//get the by index.
System.out.println("we have to update then we should use set method="+list.set(1,23));//set the value.
System.out.println("we have to remove then we should use remove method="+list.remove(2));//remove or delete

System.out.println("we have to check if it is or not, then we should use contains method="+list.contains(212));//we can check by contains method.

/*list.clear();
System.out.println("clear "+list);*/
for(int l:list)//for each method
{
    System.out.println("foreach method"+l);
}

//what is next() and hasNext() in collection we will see later 


Iterator <Integer>s1=list.iterator();//what is iterator in java we will learn latter.
System.out.println("iterator using here first="+s1.next());
System.out.println("iterator using here second="+s1.next());
/*System.out.println("iterator using here third="+s1.next());*/
while(s1.hasNext()){
    System.out.println("by  hasNext method="+s1.next());

}

for(int q=0;q<10;q++)
{
    list.add(q);
System.out.println(list);
}
ArrayList<String>lis=new ArrayList<String>();//we can define class inside angular bracket. 
lis.add("og");
System.out.println(lis);
ArrayList l1=new ArrayList();//when we don't utilize angular bracket,we able to use anything like Integer,String,Float etc which is called generic programing. 
l1.add(3);
l1.add("twos");
l1.add(1.22);


System.out.println(l1);

//we will learn linked list method and iterator also.
LinkedList f=new LinkedList();//how we create arraylist the same concept for also linkedlist.linkedList is a datastructure concept.which is data and pointer.
f.add(4);
f.add(4);
f.add(4);


System.out.println(f);
/*Array or arraylist(background code made by array) which is stored continously.
 * LinkedList which stores the data with pointer,-11.24.58
 * in likedlist stores the data and pointer,pointer mention next data that where it is stored.
 * difference between arraylist and linkedlist
 * arraylist if i insert any data or delete any data.it takes time excessily but linkedlist which takes less time because pointer immediately says that where is next data.
 * 
  */

}



    }
    

