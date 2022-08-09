public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        //car.license = "AMQ123";
        //car.driver = "Andres Herrera";
        car.passegenger = 4;
        car.printDataCar();
        //System.out.println("Car license: " + car.license);
        
        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
       // car2.license = "QWE567";
        //car2.driver ="Andrea Herrera";
        car2.passegenger = 3;
       // System.out.println("Car License: " + car2.license);
        car2.printDataCar();
    }
}
