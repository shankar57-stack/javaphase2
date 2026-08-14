abstract class Bank
{
   abstract void pin();
   void account()
   {
    
   }  

}

class own extends Bank
{
    void pin()
    {
        System.out.println("Pin is 1234");
    }
}

class manager
{
 void account()
    {
        System.out.println("account number is 1234567890");
    }
}
public class abstraction {
    public static void main(String[] args) {
       own u = new own();
       u.pin();
       u.account();
    }
}
