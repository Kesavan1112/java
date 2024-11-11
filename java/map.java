//Map does n't extend or implement from any class and any interface ,it's just  part of collection interface.but Map is seperately interface in java.
/*Map is collection of key and value pair.

key      value
city     trichy
phoneno  9994739552



 */
//we will learn method in Map later in replace() remove().  
 import java.util.HashMap;
import java.util.Map;
public class map {

    public static void main(String[] args) 
    {
        
Map<String,Integer> s=new HashMap<>();//hashtable  also we can use.difference between hashtable and haspmap .hashtable is synchronized,haspmap is not synchronized naturally\default.

s.put("kesavan", 14);//if you add,you use put method.   
s.put("kiran babu", 15);
s.put("mani shankar", 16);
s.put("kesavan", 89);/*it doesn't show because which is set in map.
*A Set in Java is a collection that does not allow duplicate elements.
*In the context of a Map, the keys must be unique, which is why they can be represented as a Set.
*The values in a Map can be duplicates, so they are not typically represented as a Set. 
*it does take last key value only.
*/

System.out.println(s);
System.out.println(s.get("kesavan"));//get method shows value by key.
System.out.println(s.keySet());
//for loop in list.

for(String ans:s.keySet()){
System.out.println(ans+":"+s.get(ans));
}
}
    }
/*In Java, both `Hashtable` and `HashMap` are used to store key-value pairs, but there are some important differences between them:

### 1. **Thread Safety**

   - **Hashtable**: It is **synchronized**, meaning it is thread-safe. Multiple threads can access a `Hashtable` concurrently without causing issues because it locks the entire table for any read or write operation.
   - **HashMap**: It is **not synchronized** by default, so it is not thread-safe. If multiple threads access a `HashMap` simultaneously and modify it, there could be unexpected results.

   If thread safety is needed, you can make a `HashMap` synchronized by using `Collections.synchronizedMap()`.

### 2. **Performance**

   - **Hashtable**: Because of its synchronized nature, `Hashtable` generally has slower performance than `HashMap`, especially in single-threaded scenarios where synchronization is unnecessary.
   - **HashMap**: Since it isn’t synchronized, `HashMap` is faster and is generally preferred in non-threaded applications for better performance.

### 3. **Null Values and Keys**

   - **Hashtable**: Does **not allow null keys or values**. Attempting to insert a `null` key or value will throw a `NullPointerException`.
   - **HashMap**: Allows one **null key** and multiple **null values**. You can use `null` as a key, and values can also be `null`.

### 4. **Legacy vs. Modern Collection**

   - **Hashtable**: It is considered a **legacy class** from the earlier versions of Java, before the introduction of the Java Collections Framework. It has been retrofitted to implement the `Map` interface, but it is generally not used in modern code.
   - **HashMap**: Part of the **Java Collections Framework** introduced in Java 1.2 and is more commonly used in contemporary Java development.

### 5. **Initial Capacity and Load Factor**

   - **Hashtable**: Has a default initial capacity of 11 and resizes by doubling the capacity +1 when needed.
   - **HashMap**: Has a default initial capacity of 16 and resizes by doubling the capacity when the load factor (default is 0.75) is reached.

### 6. **Iteration Style**

   - **Hashtable**: Uses an enumeration (`Enumeration`) for iterating over keys and values, which is older and less versatile than the iterator used in the Java Collections Framework.
   - **HashMap**: Uses `Iterator`, which is part of the modern Java Collections Framework and supports fail-fast behavior (throws `ConcurrentModificationException` if modified during iteration).

### Quick Comparison Table

| Feature              | Hashtable         | HashMap           |
|----------------------|-------------------|-------------------|
| Thread Safety        | Synchronized      | Not synchronized  |
| Performance          | Slower            | Faster            |
| Null Keys/Values     | Not allowed       | Allowed           |
| Part of Collections  | Legacy class      | Java Collections  |
| Initial Capacity     | 11                | 16                |
| Iteration            | Enumeration       | Iterator          |

### When to Use Which?
- **Use `Hashtable`** if you specifically need thread safety and don’t want to use additional synchronization methods.
- **Use `HashMap`** for most cases in modern applications where thread safety is not an issue, as it is faster and more versatile. 

If thread safety is required in `HashMap`, you can use `Collections.synchronizedMap(new HashMap<>())` to wrap it in a synchronized map. */