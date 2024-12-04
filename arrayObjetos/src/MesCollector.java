import java.util.Arrays;

public class MesCollector {

    private int mes;
    private int anyo;
    private int diasMes;
    private int[] temperatura;


    //constructor
    public MesCollector(int mes, int anyo) {
        this.mes = mes;
        this.anyo = anyo;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diasMes = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = 30;
        } else if (mes == 2) {
            diasMes = 28;
        }

        this.temperatura = new int[diasMes];
    }


    public int getTemperatura(int dia){
        if (dia < 1 || dia > diasMes) {
            return -1;
        }
        return temperatura[dia - 1];
    }

    public void setTemperatura ( int dia, int temp){
        if (dia >= 1 && dia <= diasMes) {
            temperatura[dia - 1] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mes: ").append(mes).append(", Año: ").append(anyo)
                .append(", Días: ").append(diasMes).append("\n");
        for (int i = 0; i < diasMes; i++) {
            sb.append("Día ").append(i + 1).append(": ");
            if (temperatura[i] == 0) {
                sb.append("no hay datos\n");
            } else {
                sb.append(temperatura[i]).append("°C\n");
            }
        }
        return sb.toString();
    }

}
