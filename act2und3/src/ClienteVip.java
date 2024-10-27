public class ClienteVip {

    private String nombre;
    private double limiteCredito;
    private String email;
    private TipoVip tipoVip;

    public enum TipoVip {
        GOLD, SILVER, NORMAL
    }
    // en el rsc puedes crear una clase enum genérica que te sirva
    //para todos los porgramas (no hgace falta hacerlo, es solo información)



    //constructor por defecto
    public ClienteVip() {
        this ("Luis", 200, "lucia@gmail", TipoVip.GOLD);
    }
    /*aquí pones todos los parámetros, lugo llamas solo a 2 de ellos en el de 2 y luego
    en el de 4 solo tienes que llamar a lo otros 2 ya que ya los ahs llamado
    en el constructor de 2 parámetros, SOBRECARGA DEL SISTEMA!!
    esto son valores por defectoq ue le damos a los campos (o atributos)*/


    //constructor de 2
    public ClienteVip(String nombre, double limiteCredito) {
        this (nombre, limiteCredito, "antonio@gmail", TipoVip.SILVER);
    }


    //constructor de 4
    public ClienteVip(String nombre, double limiteCredito, String email, TipoVip tipoVip) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.email = email;
        this.tipoVip = tipoVip;
    }



    //getters - setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoVip getTipoVip() {
        return tipoVip;
    }

    public void setTipoVip(TipoVip tipoVip) {
        this.tipoVip = tipoVip;
    }
}
