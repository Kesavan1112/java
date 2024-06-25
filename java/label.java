//we can use other language goto statement but java doesn't need like instead of that.we can utilize label and jumpstatement that is break or continue. 
public class label {
    public static void main(String arg[])
    {int row,column;
        outerloop://label
        for(row=1;row<5;row++)
        {
            innerloop://label
for(column=1;column<3;column++)
    {
if(row==2&&column==2){
    break;//we can break column .
//break outerloop;//we can break also row
}
    System.out.print("*");

}
System.out.println();

}

}

}
