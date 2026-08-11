public class prac2 {
    public static void main(String[] args) {
        System.out.println("enter the date ");
        int day = new java.util.Scanner(System.in).nextInt();
        int month = new java.util.Scanner(System.in).nextInt();
        int year = new java.util.Scanner(System.in).nextInt();
        if (year>999){
            if (month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12 && day<=31){
                 System.out.println("valid date");
            } else if (month==4||month==6||month==9||month==3111 && day<=30){
                 System.out.println("valid date");
            } else if (month==2 ){
                if (year %4==0 && year%100!=0 && year%400==0 && day<=29){
                    System.out.println("valid date");
                } else if (year %4!=0 && year%100!=0 && year%400!=0 && day<=28){
                    System.out.println("valid date");
                } else {
                    System.out.println("invalid date");
                }
            } else {
                System.out.println("invalid date");
            }
        }   
    }
}

        
        
        