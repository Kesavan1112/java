//inheritence 
//employee is base class,super class,parent class.
//manager is derived class,sub class,child class.
//when we use inheritence .we set the general information or functionality everything in super class ,special information or functionality in sub class that's inheritence.
//when inheritence is applicable,that's (is a relationship) which means for example car is a vechicle,triangle is shape,car is derived class,vechicle is base class.shape is base class ,triangle is derived class.
//actually super class object only access super class variable,method.but sub class we able to access everything we can superclass variable,method and sub class method,variable also . 
//In inheritence if i set private variable or private method in super class ,i can't access by sub class. because private only within class.  
//types of inheritence=>(single inheritence =>class A{} class B extends A{}),(multi level=>class A {} class B extends A{},class C extends B{}),hierarchical inheritence=>class A{},class B extends A{},class C extends A

class employee{
    public String name;
     public double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
     /*  employee(){
        name=" ";
        salary=0.0;
    }*/
    String getname(){
        return name;
    }
    void setname(String n){
        name=n;

    }
    double getsalary(){
        return salary;
    }
    void setSalary(double s){
        salary=s;

    }


void raisesalary(double percent){
    salary+=salary*percent/100;
}    
    

}
class manager extends employee{

    double bonus;

    manager(String n,double s,double b)//employee constructor what we have given those things are applicable this manager due to we have inherited the employee class.
    {
        //super();//which means this indicate super class constructor.not consider inside pramater.
super(n,s);//which means this indicate super class constructor.but name,salary for which we give the delegation from subclass.it does consider with name,salary.
//super.setname(n);
//super.setSalary(s);//we can utilize both setname()and getname() by using super keyword method but we can call construtor of super class by using super keyword.
bonus=b;
}
void setbonus(double b){
    bonus=b;
}
double getsalary()//we are overriding here.
{
return super.getsalary()+bonus;//return getsalary()+bonus.which does n't get superclass getsalary method
}
}    public class inheritence {
    public static void main(String args[])
    {
        employee e=new employee("hari", 2000);
    System.out.println(e.getsalary());
        e.raisesalary(3);
        System.out.println(e.getsalary());

        e.raisesalary(3);
        System.out.println(e.getsalary());

manager m1=new manager("kamal",90000,2000);//m1 is object/new manager ("kamal",90000,2000); is reference.m1 object is stored it's reference.

System.out.println("by manager's object="+m1.getsalary());

employee e2=new manager( "dood",6000,5000);//this is polymorphism behaviour.we can create object for derived class by base class. 
// manager m1=new employee(null, 0,0);//but we can't create object for base class by derived class.

int []a1=new int[20];//this is called integer array.
employee[]employees=new employee[4];//this is called array of object.when we use array we have to give perfect size that how we have to use,if i employee[]employees=new employee[5];,error will come.but if i use array list,this problem doesn't come.
employees[0]=new employee("ram",8600);
employees[1]=new employee("k9",9600);
employees[2]=new employee("hari",8200);
employees[3]=m1;//employees[3]=new manager("red", 11111, 222);//this is upcasting 

employees[3].setSalary(2222);//we can change which is base method.

manager m2=(manager)employees[3];//this is cast the base class.
//before we did implement to assign manager reference to employee object.for example employees[3]=m1;this is downcasting after downcasting we can access setbonus method.
//we can create by using instance like =>if(employees[3] instanceof manager){}
m2.setbonus(20000);

// employees[2].setbonus(333);//we can't change here cause of which is not base class method setbonus() ,if i change that method i can use derive class object.
//for(int i:a1){}//this foreach array to integer array.
for(employee o:employees)//this is dynamic binding.dynamic binding means which refers base class or derived class by it's object when we invoke override method by respective object.it shows its output that's why this called dynamic binding.which object is depend,it calls that class method,this is called dynamic binding.this foreach array to array of object.
{
    System.out.println(o.getname()+" "+o.getsalary());//we can access only derived class method that should be override method only.example o.getsalary(); but you can't access getname() because of it is only derived class method.if you access it,it should be override method.
}

manager m3;
if(employees[2] instanceof manager)//we can check that if employees[2] instance of manager,it would make cast.we can't create inside if block manager m3.it would come error.when we utilize 
{
m3=(manager)employees[2];//this cast.
}


}
    
}
