public class Animal {

    protected String name;
    protected int size;
    protected int weight;

    public Animal(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        System.out.println("Ejecutando el constructor de Animal...");
    }

    //getters y setters

    public void eat() {
        System.out.println("comiendo animal..."+name);

    }

    public void move() {
        System.out.println("se mueve el animal..."+name);
    }
}

    class Dog extends Animal {

        private int eyes;
        private int legs;
        private int tail;

        public Dog(String name, int size, int weight, int eyes, int legs, int tail) {
            super(name, size, weight);//llama al constructor de Animal
            this.eyes = eyes;
            this.legs = legs;
            this.tail = tail;
            System.out.println("Ejecutando el constructor de Dog...");
        }

        @Override
        public void eat(){  //!!!!!!!!!!!! (aquí no irá pero el protected va en alguna parte)
            System.out.println("El dog "+ name +" está comiendo...");
        }
    }


// una flor es una planta y una planta es un ser vivo
