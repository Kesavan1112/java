public class javatricky {
    public static void main(String k[])
    {
        //int a= ++12;//we can't inc or dec because this is constant value.
        //System.out.println(a);
    int y=10,z=20;
    int c,c1;
    c=y*z-20/10;//precedence first 200-2//it does multiplication and divison first.
    c1=(y*z-20)/10;//precedence first inside parenthises.
    System.out.println(c);
    System.out.println(c1);
    int a1=33;
    int l1=a1++ + ++a1;//33+35=68;
  int l2=++a1 + ++a1;//36+37=73;
  int r=1,o=2;
  int yu=r++ + o++;//1+2=3
  int ui=r++ + ++o;//2+4=6
  System.out.println("yu"+ui);  

  System.out.println(yu);  
    System.out.println(l1);
    System.out.println(l2);
int w=0;
int r1=w++;//incre 1 after zero
System.out.println(r1);
int r2=++w;//one +one =2
System.out.println(r2);
int giga=8;
System.out.println("giga="+(giga&2));
int r22=45;
int r3=46;
int ht=++r22 + --r3 - r22 - r3++;//46+45-46-45=91-91=0;
System.out.println(ht);
int tri=0;
int tr=--tri*--tri*--tri*tri;//-1*-2*-3*-3=2*9=18
int tri1=0;
int tr3=--tri1+--tri1+--tri1+tri1;//-1-2-3-3=-3-6=-9;
System.out.println(tr);

System.out.println(tr3);
/*xor^3
    11
    11
ans=00=(xor^3)
    11=^3
    11 final answer is =3; 
  * 
*/

int xor=3;
int finxor=(xor^3)^xor;
System.out.println(finxor);

int a=2,b=4;
System.out.println((a^b)^a);//4
System.out.println((a^b)^b);//2
//we can swap by using xor (a^b)^a=b,(a^b)^b=a
}
}
