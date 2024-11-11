package oop;
import java.util.*;

class employee{
    protected String name;
    private double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    } 
    public String getName(){return name;}
    public void setName(String n){name=n;}

    public double getsalary(){return salary;}
public void raisesalary(double percent){
    salary+=salary*percent/100;
}
public boolean equals(Object obj){
    if(this==obj)
    return true;
    if(obj==null)
return false;
if(this.getClass()!=obj.getClass())
return false;
employee e=(employee)obj;
return this.name.equals(e.name)&&this.salary==e.salary;
}

}
class manager extends employee{
    private double bonus;
    manager(String n,double s,double b){
        super(n,s);
        bonus=b;
    }
    public void setbonus(double b){
        bonus=b;
    }
    public double getsalary(){
        return super.getsalary()+bonus;
    }
}
public class interfaceexamplein {
    public static void main(String args[]){
        employee e1=new employee("ram", 200);
        System.out.println(e1.getsalary());
        employee e2=new manager("ramya",6800, 0);
employee e3=new employee("run",3500);
System.out.println(e1.equals(e3));
int[] arr=new int[50];
employee[]emp=new employee[4];
emp[0]=new employee("ram",35000);
emp[1]=new employee("hari",32000);
emp[2]=new employee("vidhya",37000);
//emp[3]=new employee("john",65000.0,0.0);

//emp[3].setSalary(75000);
manager m1;
if(emp[3] instanceof manager){
    m1=(manager) emp[3];
    m1.setbonus(20000);

}
manager m2;
if(emp[2] instanceof manager)
m2=(manager)emp[2];
for(employee e:emp){//dynamic binding
    System.out.println(e.getName()+""+e.getsalary());
}
    }
}
