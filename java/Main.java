public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrra", "ASD123", "andresHH@gmail.com", "12345"));
        //car.license = "AMQ123";
        //car.driver = "Andres Herrera";
        car.passegenger = 4;
        car.printDataCar();

        //System.out.println("Car license: " + car.license);
        
        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "QWE123", "andreah@gmail.com", "9992"));
       // car2.license = "QWE567";
        //car2.driver ="Andrea Herrera";
        car2.passegenger = 3;
       // System.out.println("Car License: " + car2.license);
        car2.printDataCar();
        User user = new User("Tomas Olmedo ", "36036328 ", "tomasolmedobc@gmail.com ", "8885555");
        user.printDataUser();
        Driver driver = new Driver("Agustin Reinado ", "98555522 ", "agusreinado@gmail.com ",  "93218381");
        driver.printDataDriver();
    }
}
