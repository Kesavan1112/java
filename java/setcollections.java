/*
*set =>only can be without redundancy which means no duplicate value.
 * hashset=(background code is hashing(data structure concept))
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setcollections {
    public static void main(String[] args) {
        HashSet<String>k1=new HashSet<>();//hashset which comes unorderly.
TreeSet<String>jj=new TreeSet<>();
        LinkedHashSet<String>k=new LinkedHashSet<>();//new java version we don't need give String inside angular bracket at right side inside .
        k.add("ragu");
        k.add("jd");
        k.add("leo");
        k.add("gandhi");
        k.add("leo");



        System.out.println("linkedhashset="+k);//linkedhashset which comes source code order .

        jj.add("ragu");
        jj.add("jd");
        jj.add("leo");
        jj.add("gandhi");
        jj.add("leo");


        System.out.println("treeset="+jj);//treeset which comes alphatpetic order.



    }


}
