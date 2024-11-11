/*queue=>fifo=>first in first out
 * queue methods we will learn later.
*/

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueincollections {

    public static void main(String args[])
    {
Queue<Integer>h=new LinkedList<>();//new version of java if i give integer in left side ,i don't need to give to right side.we can't create object for queue ,because queue is interface.we can create only refernce.
/*h.add(23);
h.add(33);
h.add(39);*/
System.out.println(h.peek());//if i need to see ,what is in head of queue,i should use peek()method.
System.out.println(h.poll());//if i need to remove of head of queue,i should use remove()method or we can utilize poll()method but when we don't use any queue,remove throw a exception but poll() method throw null value.
System.out.println("after remove of head "+h.peek());
System.out.println(h.size());

PriorityQueue<Integer>i=new PriorityQueue<>();//priorityqueue is class in collections which starts the value from 1.it is like ascending. 
i.add(2);
i.add(1);
i.add(7);
i.add(4);
System.out.println(i.peek());
System.out.println(i.poll());
System.out.println(i.peek());

    }

}
