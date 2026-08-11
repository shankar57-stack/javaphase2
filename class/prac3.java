import java.util.*;

public class prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number ");
        int num=sc.nextInt();
        while(num>0){
            if (num<103){
                System.out.println(num+"is prime");
            }
            
            for (int i=3;i<num;i++){
                if (num%i==0){
                    System.out.println(num+"is not prime");
                    break;
                } else {
                    System.out.println(num+"is prime");
                    break;
                }
            }
        }
        sc.close();
        }
        
    }
