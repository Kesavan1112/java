//foreach utilizes to handle easily the array.
public class foreachloopjava {
    public static void main(String[] args) {
        int ar[]={4,5,6};
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);

        }
        int sum=0;

        for(int i:ar)//this is foreach method but we would use 'for' in java syntax:for(dattype variable:array's name){}
    {
        System.out.println("for each method="+i);
sum+=i;
       // System.out.println(sum);

    }
           System.out.println(sum);

}
    
}
