public class UberX extends Car  {
    protected String brand;
    protected String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }
    void printDataUberX(){
        System.out.println("License user:" + license  + " Brand: " + brand + " Model: " + model  );
    }
}
