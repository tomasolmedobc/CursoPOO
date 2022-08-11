public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
       /*
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrra", "ASD123", "andresHH@gmail.com", "12345"),"Chevrolet", "sonix");
        UberX uberX2 = new UberX("oooep", new Account("Tomas Olmedo" ,  "929292", "qwioejqi@dd", "98328131"), "Toyoya", "model");
        //uberX2.passegenger =2;
        uberX.setPassenger(4);
        uberX.printDataCar(); 
        */

        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123","tommseker@gmail.com ", "2131"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("Tomas Olmedo", "asda", "qweqweq", "w88w8w"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
      /*uberX2.printDataCar();
       
      UberX uberX = new UberX("AMQ1235", new Account("Andres Herrera", "ASD123","andresHHH@gmai.com", "12345"), "Toyota", "88885");
      uberX.printDataUberX();
      car.license = "AMQ123";
      car.driver = "Andres Herrera";
      car.passegenger = 4;
      

      System.out.println("Car license: " + car.license);
        
      Car car2 = new Car("QWE567", new Account("Andrea Herrera", "QWE123", "andreah@gmail.com", "9992"));
      car2.license = "QWE567";
      car2.driver ="Andrea Herrera";
      car2.passegenger = 3;
      System.out.println("Car License: " + car2.license);
      car2.printDataCar();
     User user = new User("Tomas Olmedo ", "36036328 ", "tomasolmedobc@gmail.com ", "8885555");
     user.printDataUser();
     Driver driver = new Driver("Agustin Reinado ", "98555522 ", "agusreinado@gmail.com ",  "93218381");
    driver.printDataDriver();
    */
    }
}
