public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Coche coche1 = new Coche();
        Coche coche2 = new Coche(300, 6, 4);
        System.out.println("Coche1 vel Max: " + coche1.velocidadMaxima);
        System.out.println("Coche2 vel Max: " + coche2.velocidadMaxima);
    }
}
class Coche {
    int numeroPuertas;
    int numeroRuedas;
    int velocidadMaxima;
    float velocidadActual;
    // El constructor, sobre-carga del constructor (cuando se define 2 veces con distintas caracteristicas)
    public Coche() {
        velocidadMaxima = 240;
        velocidadActual = 100;
        numeroPuertas = 5;
        numeroRuedas = 4;
        System.out.printf("Ejecutando el constructor de la clase Coche SIN PARAMETROS...%d\n", numeroPuertas);
    }
    public Coche(int velocidadMaxima, int puertas, int ruedas) {
        this.velocidadMaxima = velocidadMaxima;
        numeroPuertas = puertas;
        numeroRuedas = ruedas;
        System.out.printf("Ejecutando el constructor de la clase Coche CON PARAMETROS...%d\n", numeroPuertas);
    }

    public void acelerar(){ velocidadActual += 10; }
    public void frenar(){ velocidadActual -= 10;}
}
