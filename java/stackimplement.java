class dump{
    int s[]=new int[3];
    int tos;
    dump(){
tos=-1;
    }
    void push(int item)
    {
if(tos==2)
System.out.println("we can't push anymore");
else
s[++tos]=item;
}    
int pop(){
    if(tos>=0)
    return s[tos--];
    else
    {
    System.out.println("stack is empty");
return -1;    
} 
    
}

}
public class stackimplement {
    public static void main(String[] args) {
dump g=new dump();
g.push(4);
g.push(3);        
g.push(33);
g.push(34);

//int r=g.pop();
System.out.println(g.pop());
System.out.println(g.pop());
System.out.println(g.pop());
System.out.println(g.pop());

}
    
}
