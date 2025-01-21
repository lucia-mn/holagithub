public class Ordenador {

    private Procesador procesador;
    private Teclado teclado;
    private Monitor monitor;

    public Ordenador(Procesador procesador, Teclado teclado, Monitor monitor) {
        this.procesador = procesador;
        this.teclado = teclado;
        this.monitor = monitor;
    }

    public void encender() {
        getProcesador().presionarBotonEncendido();
        dibujarLogo();
    }

    public void dibujarLogo() {
        monitor.dibujarPixel(12, 23);
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }


    @Override
    public String toString() {
        return "Ordenador{" +
                "\nprocesador=" + procesador +
                ", \nteclado=" + teclado +
                ", \nmonitor=" + monitor +
                '}';
    }
}