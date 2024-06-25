class datatype{
    public static void main(String arg[])
    {
int F=010;//if i  add zero initial,it means octal number.
int d=F;
int fd=0x2;//
int d2=0xA;//if i add hexadecimal value ,i start with zero and capital X or small x.
int d3=0B1000;//we,can store the binary number after jdk 7 version for which we have to use initially 0b or 0B.this is numeric literal
int comma=1_000;//this is also  can store after jdk 7 version underscore indicates comma instead 1,000.mere 1,000 which can't be use in java but we can use 1_000.
long h=7l;//we can use capital L or small l for long.
System.out.println("binary value="+h);//only use plus symbol.
char t='h';//only use single quote but whatever we can use single value inside single quote.
System.out.println("binary value="+d3);//only use plus symbol.
////we can use capital F or small f for float
float pi=3.14159F;//standard notation
float pi1=314159e-05f;//scientfic notation and we can use +05f but we should use for bigger value.

System.out.println("pi value="+pi);
System.out.println("pil1="+pi1);


System.out.println(d2);//10

System.out.println(fd);//11

System.out.println(d);

System.out.println(d2);

    }
}

