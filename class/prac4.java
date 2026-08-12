class Emp{
    int rollno;
    String name;
    int marks;
    Emp(int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
public class prac4 {
   public static void main(String[] args){
        Emp s1= new Emp(1,"abc",90);
        Emp s2= new Emp(2,"xyz",80);
        System.out.println("employee 1: "+s1.rollno+" "+s1.name+" "+s1.marks);
        System.out.println("employee 2: "+s2.rollno+" "+s2.name+" "+s2.marks);
        Emp[] students = new Emp[2];
    }
}