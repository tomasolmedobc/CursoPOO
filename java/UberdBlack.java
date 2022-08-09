import java.util.ArrayList;
import java.util.Map;

public class UberdBlack extends Car {
    Map<String,Map<String,Integer>> typeCarAccepted;
    ArrayList<String>  seatsMaterial;
    
    public UberdBlack(String license, Account driver, Map<String,Map<String,Integer>> typeCarAccepted){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
    
}
