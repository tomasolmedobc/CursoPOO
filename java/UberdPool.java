public class UberdPool extends Car {
    String brand;
    String model;

    public UberdPool(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    
    }
}