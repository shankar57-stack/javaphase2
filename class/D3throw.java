import java.util.Scanner;
class D3throw {

    public static void main(String[] args) {
        int balance=1000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int withdraw=sc.nextInt();
        if (withdraw > balance) {
                throw new RuntimeException("Insufficient balance");
            
        }
        System.out.println("Transaction completed , remaining balance: " + (balance - withdraw));
    }
}

