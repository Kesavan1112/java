public class elseifja {
    public static void main(String[] args) {
        int a=70,b=90,g=45;
         if(g>b){
System.out.println("okay");
        }
        //note:you can't utilize else if without use before if satement.if you use multiple else if statement.to handle carefully because.if i give first condition like initially true and second condition also true but it would take only one first condition.and set the condition gradually decrease like (a>=90)(a>=80) (a>=70) (a>=60).  
        else if(a>=60)
        {
        System.out.println("a is okay");
    }
    else if(b>=90)
        {
        System.out.println("b is okay");
    }
}
}
