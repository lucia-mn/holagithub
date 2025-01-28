package cubos;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    //METODO QUE SE LLAMA GRAN EXPLOSION QUE RECORRE EL ARRAY
    public static void granExplosion(Explotable[] explotables){
        for (Explotable explotable:explotables) {
            //cada tipo de objeto genera su propia explosión
            explotable.explotar();
        }
    }



    public static void main(String[] args) {

        //podemos crear un dinamita y explotarla
        Dinamita dim1=new Dinamita("DinamitaCat1");
        dim1.explotar();

        //podemos crear madera y quemarla
        Madera mad1=new Madera("Pino");
        mad1.incinerar();

        //podemos crear butano y explotarlo y quemarlo
        Butano but1=new Butano("But10Litros");
        but1.incinerar();
        but1.explotar();

        //pero no podemos crear cesped que se queme o explote
        Cesped cesp1=new Cesped("artificial");




        //creamos array de explotables
        System.out.println(" ");
        Explotable[] miGranExplosion=new Explotable[3];
        //creamos explotables de diferente tipo
        miGranExplosion[0]=new Dinamita("DinamitaCat1");
        miGranExplosion[1]=new Butano("But10Litros");
        miGranExplosion[2]=new Nave();
        //llamamos a la gran explosion
        granExplosion(miGranExplosion);

    }
}
