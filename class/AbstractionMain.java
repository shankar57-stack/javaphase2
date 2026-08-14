abstract class Company {
   private String name = "Google";
    String location = "USA";
    abstract void doc();
    void website(){
        System.out.println("employee accessing website");
    }
}
class employee extends Company{
    void doc(){
        System.out.println("employee is accessing document");
    }
    Company m = new employee();
    void display(){
        System.out.println(m.location);
    }
}
public class AbstractionMain {
    public static void main(String[] args) {
        employee e = new employee();
        System.out.println(e.location  );
        Company c = new employee();
        
    }
    
}
