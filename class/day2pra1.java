class Interview {
    String Name ;
    String Degree;
    int Age;
     
    void display(){
        selection(Age, Name);
        System.out.println("Thanks for attening ");
    }
    void Setdetails(String name,String degree,int age){
        Name=name;
        Degree=degree;
        Age=age;
    }
    void selection(int age,String name){
        if(age<25){
            System.out.println("__________________"+name+" your are too young for this job as ur agr is "+age+"__________________");
        }
        else{
            System.out.println("__________________"+name+" your are selected"+"__________________");
        }
    }
    
    
}

public class day2pra1 {
    public static void main(String[] args) {
       
        Interview p1=new Interview();
        p1.Setdetails("hari","BE", 26);

        Interview p2=new Interview();
        p2.Setdetails("siva","BCA", 18);

        Interview p3=new Interview();
        p3.Setdetails("AADHUma","ME", 30);

        p1.display();
        p2.display();
        p3.display();


    }
}