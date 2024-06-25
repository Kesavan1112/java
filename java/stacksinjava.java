
public class stacksinjava {
static int f[]=new int[3];
static int tov=-1;
/*stacksinjava(){
  
}*/
static int item;
void push(int item){
    
  f[++tov]=item;
  this.item=item;
  

}


static void pop()
{
  if(tov>=0)
  {
int get=f[tov--];  //2=8,1=5,0=4
    System.out.println(get); //8,5,4
    
    /*if(tov<=-1)
    System.out.println("empty");*/
  
  }
  else{
    if(tov<=-1)
    System.out.println("empty");
      
  }

 
  
}

    public static void main(String[] args) 
    {
      stacksinjava s=new stacksinjava(); 
      //s.push(3);
      s.push(4); //0
      s.push(5);//1
     s.push(8);//2

      pop();//2
      //System.out.println(q);
      //stacksinjava s1=new stacksinjava();
      pop(); //1
      pop();//0
      pop();//-1
      pop();//-2
      pop();//-3

    }
    
}
