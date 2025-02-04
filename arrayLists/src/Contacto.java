public class Contacto {

    protected String name;
    protected String phoneNumber;

    //constructor
    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //constructor2
    public Contacto(String name) {
        this.name = name;
    }

    //getters y metodos
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String name, String phoneNumber) {

        //se puede poner aqui o en el main
        Contacto contacto = new Contacto("H", "376");
        return contacto;

        //return new Contacto("H", "376"); esto es otra opcion
    }
}
