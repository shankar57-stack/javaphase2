class Employee{
    int emloyeeID;
    String employeeName;
    private double basicSalary;
    int Bonus;
    int Tax;
    void setdetails(int id, String name,double salary,int bonus,int tax){
       emloyeeID =id;
       employeeName=name;
       basicSalary=salary;
       Bonus=bonus;
       Tax=tax;
    }
    void bouns( int bouns,double salary,String name){
        double bonusamt= (salary*bouns)/100;
        //basicSalary=basicSalary-bonusamt;
        System.out.println("bonus amt for "+name+"is"+bonusamt);


    }
    void tax(int tax,double salary,String name){
        double taxamt=(salary*tax)/100;
        //basicSalary=basicSalary-taxamt;
        System.out.println("tax amt for"+name+"is"+taxamt);
    }
    void finalsalary(double taxamt,double bonusamt,String name,double salary){
        double finsalary= salary-taxamt-bonusamt;
        System.out.println("finall salary for"+name+" is "+finsalary);
    }
    void display(){
        bouns(Bonus, basicSalary,employeeName);
        tax(Tax, basicSalary,employeeName);
        finalsalary(Tax,Bonus,employeeName,basicSalary);
        System.out.println("this is printed fron diaplayvoid when only called");
    }
   double getValue(){
    return basicSalary;

   }

}

public class practice{
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        
        e1.setdetails(01,"loki",10000,5,2);
        e2.setdetails(01,"",70000,6,1);
        e3.setdetails(01,"loki",90000,7,5);

        //e1.tax(e1.Tax, e1.basicSalary,e1.employeeName);
        e1.display();
        e2.display();
        e3.display();
        
        System.out.println(e1.getValue());
        System.out.println(e1.emloyeeID);


    }
}

