class Car {
    private String modelName = "Tesla Model 3";

    
    class Engine {
        void start() {
            System.out.println(modelName + " engine is starting...");
        }
    }
}

public class day2pra1 {
    public static void main(String[] args) {
       
        Car myCar = new Car();

        Car.Engine myEngine = myCar.new Engine();
        myEngine.start();
    }
}