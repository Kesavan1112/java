public class operator 
{
    public static void main(String arg[])
    {/*  %,+,-,*,/  */ //arithmetic operator
        int a=2,b=3,c,d=99;
        c=a*b;

        System.out.println("example arithmetic ="+c);   
    //compound operator +=,-=,*=
    d+=100;//first assign for next you can assign .
    System.out.println(d); 

    a-=9;//a=a+9;
    System.out.println(a); 
//increment and decrement operator
int u=8;
u++;
System.out.println("increment:"+u++);
//System.out.println(u); 

int i=u++;
System.out.println(i);//post increment don't increment
System.out.println(u);//post increment don increment because when it meets u again.it increases.
int l=4;
int dq=++l;
System.out.println("preincrement"+dq);//preincrement always be same. 
System.out.println("preincrement"+l); //preincrement always be same.

// pre/pos=dec
int s1=9;
int s2=--s1;//8
System.out.println("predecrement="+ --s1);//7
System.out.println(s2);

int g1=5;
int g2=9;
//System.out.println(g1--);
//int g2=g1--;
//System.out.println(g2);//4
//System.out.println(g1);//
System.out.println("first post decrement="+g1--);
System.out.println(g1--);
System.out.println(g2--);
System.out.println(g1--);
System.out.println(g1--);

System.out.println(g1-(-1));

//relational operator <,>,<=,>=,==,!=
int o1=5,o2=9;
System.out.println(o1==o2);
System.out.println(o1!=o2);
for(int i1=1;i1<=10;i1++)
{
    System.out.println(o2+" X "+i1+" ="+o2*i1);

}
//bitwise operator &-AND,|-OR,~-NOT,^-xor
/*which uses whatsapp's encrypt and decrypt
1.>>-right shift
 2.<<-left shift
3.>>>-right with zero fill.//these 1,2,3 i have doubt.because i have exhausting while this concept.
we can utilize compound operator to bitwise operator. 
 
*/
int a_1=2,a_2=3;
System.out.println(a_1&a_2);
//we can use like boolean.
boolean dsd=true;
boolean dfkk=false;
System.out.println(dsd&dfkk);//1-true,0-false.

/*
eg:a=9=>1001
,b=12=>1100//2 power of zero=1;
    a&b=1000=8,1000=0*2power of 0=0
    =0*2power of 1=0
    =0*2power of 2=0
    =1*2power of 3=8
    output will be 8.

and is & below
 1 0=0
 0 1=0
 1 1=1
 0 0=0
or is | below
1 1=1
1 0=1
0 1=1
0 0=0
not is ~ below
0=1
1=0
xor is ^ below
0  0=0
0  1=1
1  0=1
1  1=0


 */

//actually negative number store 2s compliment in java
//if i use negative number,it will be not straight forward output;

//short circuit logical operator in java
/*&&
 1 0=0
 0 1=0
 1 1=1
 0 0=0
||

1 1=1
1 0=1
0 1=1
0 0=0
*/
int shclo=3;

//what is difference between both of them.
//short circuit operator which 
//short circuit which works (false&&nevercheck);initially false it shows false.most developer prefer short circuit.
System.out.println(shclo>=5&&shclo<=10);
//boolean and which works (false&false);initially false it both of them check it says false.
System.out.println(shclo>=5&shclo<=10);

//operation precedence in java
int y7=9,y8=9,a11=8;
double ffff=y7*y8-10/a11;//expression means combination operands,operator and variables.//priority multiplication=>division=>addition=>subtraction
// if i change priority,i can use parenthisis.
double fff=(y7*y8-10)/a11;

System.out.println(fff);

System.out.println(ffff);



}
    

}