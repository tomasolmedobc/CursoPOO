public class Driver extends Account {
    public Driver(String name, String document, String email, String password){
        super(name, document, email, password);

    }
    void printDataDriver(){
        System.out.println("Name driver:" + name + " Document Driver:" + document + " Email:" + email + "Password:" + password);;
    }

}
