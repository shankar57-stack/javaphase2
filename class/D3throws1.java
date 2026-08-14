class division {
    void div(int a, int b) throws Exception {
        int c = a/b;
        System.out.println(c);
    }
}


public class D3throws1 {
    static void main(){
        division d = new division();
        try{
            d.div(10,0);}
        catch(Exception e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.println("End of the program");

    }
}
