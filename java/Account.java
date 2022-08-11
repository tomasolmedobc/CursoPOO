public class Account {
    public static String printDataDriver;
    protected int id;
    protected String name;
    protected String document;
    protected String  email;
    protected String  password;
 
    public Account(String name, String document, String email, String password){
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;

    }
}
