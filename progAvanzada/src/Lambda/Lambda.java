package Lambda;

//Si tenemos la siguiente interface
interface Saludo{
    public String say();
}

interface Saludo2{
    public String say(String nombre);
}

public class Lambda {
    public static void main(String[] args) {

        //mediante clases anónimas
        Saludo holaSpain =new Saludo() {
            @Override
            public String say() {
                return "Hola...";
            }
        };


        //mediante lambdas
        Saludo holaPortugues=()->{
            return "Olá...";
        };
        Saludo holaIngles=()-> {
            return "Hello...";
        };

        Saludo holaChino=() -> "Ni hao";


        //llamamos al método say
        System.out.println(holaSpain.say());
        System.out.println(holaPortugues.say());
        System.out.println(holaIngles.say());




        //CON UN SOLO PARAMETRO
        //con parentesis
        Saludo2 holaSpain2 = (nombre) -> "Hola..."+nombre;
        Saludo2 holaPortugues2=(nombre)->"Olá..."+nombre;
        //sin parentesis
        Saludo2 holaIngles2=nombre-> "Hello..."+nombre;

        //llamamos al método say
        System.out.println(holaSpain2.say("Pepe"));
        System.out.println(holaPortugues2.say("Maria"));
        System.out.println(holaIngles2.say("Pablo"));
    }

}
