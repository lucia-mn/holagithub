public class Procesador {

    private String modelo;
    private int ramSlots;
    private int cardSlots;

    public Procesador(String modelo, int ramSlots, int cardSlots) {
        this.modelo = modelo;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void presionarBotonEncendido() {
        System.out.println("Iniciando el pc");
    }

    public void cargarPrograma(String nombre) {
        System.out.println(nombre);
    }


    //getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }


    @Override
    public String toString() {
        return "Procesador{" +
                "modelo='" + modelo + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                '}';
    }
}

