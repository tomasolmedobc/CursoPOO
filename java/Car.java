public class Car {
    protected int id;
    protected String  license;
    protected Account driver;
    protected Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    //Declarando un metodo para traer los datos de la Clase Car
    void printDataCar(){
        System.out.println("License: " + license + " Name Driver:" + driver.name + " Document Driver:" + driver.document + " Email:" +driver.email +" Passengenger:" + passegenger);
    }
}