//loops which uses for set of instruction again and again. 
public class loops {
    public static void main(String[] args) {
        //for(initialization;condition;increment/decrement)
        int a;
        for(a=0;a<=4;a++)//i stands for iteration we can give like for(;;){}or  for(;k>5;k++)
        {
System.out.println(a);//first initialize,second check the condition,third inside loop of body,fourth increment,fifth condition ,sixth body of loop,remember one thing initilaize only first time.
        }
        System.out.println("outof a="+a);//it did increase in loop but condition fail.
        int b=20;
         while (b>=9) {
           
    //--b; //19,18,17,16,15,14,13,12,11,10,9,8
            System.out.println(b);//20,19,18,17,16,15,14,13,12,11,10,9
--b;//19,18,17,16,15,14,13,12,11,10,9

        }
        System.out.println(b);

        /*int g=10;
        int l1=g--;
        System.out.println(g);//9
        
        System.out.println(l1);//10
        */
        
    
// diff do while=exit control loop at least one loop would be ran without condition checking /while=entry control loop after condition check. which will execute.
/*syntax:
do{

} 
while();//semicolon is essential*/
int y2=2;
do{
System.out.println(y2);
y2++;
}
while(y2==10);
System.out.println(y2);

/*for another ways
int k=99;
for(;k<=109;k++){
    System.out.println("okay");//it works properly
}
for(;;)
{
//no error and not come any output
}
//int i,j;
for(i=10,j=20;i<11||j>10;i++,j++)//inside parenthises we can use multiple initilization , condition checking and increment and decrement also.one remember which is initialize every value first we shouldn't initialize into parentheis.but below method we can initialize easily.
{

}
for (int i = 3,j = 4; ;)//initially provide the int for both of them.
 {
    // Loop body
}*/

}
}