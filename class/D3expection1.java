import java.util.Scanner;
public class D3expection1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        try {
            int result = a / b;
            System.out.println("0");
        } catch (Exception e) {
            System.out.println("Division zero.");
        }
    }
}
