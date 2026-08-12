class person{
    String name ="siva";
    String work="gate exam preparation";
    String activity="putting poster for department";

}
class student extends person{
    String college="sri ramakrishna college of engineering";
    String branch="electronic and instrumentation engineering";
    String year="3rd year";
}
class hobby extends student{
    String hobby="self love";
}

public class day2prac2 {
    public static void main(String[] args){

        student s1=new student();
        System.out.println("Name: "+s1.name);
        hobby h1=new hobby();
        System.out.println("Hobby: "+h1.hobby);
        System.out.println("Work: "+s1.work);
        System.out.println("Activity: "+s1.activity);
        System.out.println("College: "+h1.college);
        System.out.println("Branch: "+h1.branch);
        System.out.println("Year: "+h1.year);



    }     
    }
