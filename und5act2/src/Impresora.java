public class Impresora {

    //campos/atributos
    private int nivelToner;
    private int paginasImpresas;
    private boolean impresionDobleCara;


    //constructor
    public Impresora(boolean impresionDobleCara, int paginasImpresas, int nivelToner) {
        this.impresionDobleCara = impresionDobleCara;
        this.paginasImpresas = 0;

        if (nivelToner >= 0 && nivelToner <= 100) {
            this.nivelToner = nivelToner;

        } else {
            this.nivelToner = 0;
        }
    }


    //getters y setters
    public int getNivelToner() {
        return nivelToner;
    }

    public void setNivelToner(int nivelToner) {
        this.nivelToner = nivelToner;
    }

    public void setPaginasImpresas(int paginasImpresas) {
        this.paginasImpresas = paginasImpresas;
    }

    public boolean isImpresionDobleCara() {
        return impresionDobleCara;
    }

    public void setImpresionDobleCara(boolean impresionDobleCara) {
        this.impresionDobleCara = impresionDobleCara;
    }


    //métodos
    public int nivelTonerActual(int toner) {
        if (toner <= 0 || toner >= 100) {
            System.out.println("La cantidad de tóner tiene que ser entre 1 y 100");
            return -1;

        } else if (toner + this.nivelToner > 100) {
            System.out.println("Te has pasado con el tóner");
            return -1;

        } else this.nivelToner += toner;

        return this.nivelToner;
    }

    public int imprimirPaginas() {
        int paginas;
        paginas = this.paginasImpresas;

        if (this.paginasImpresas == paginas) {
            return paginas;

        } else if (this.impresionDobleCara) {
            return paginas/2;

        } else this.paginasImpresas += paginas;

        return this.paginasImpresas;
    }

    public int getPaginasImpresas() {
        return this.paginasImpresas;
    }

}
