import Model.Computadora;

public class App {
    public static void main(String[] args) {
        // Instanciar una Computadora
        Model.Computadora PCGamer = new Model.Computadora();
        PCGamer.setModelo("Lenovo");

        // Llamar a encender() dos veces
        System.out.println("Intento de encender (1ra vez):");
        PCGamer.enceder();
        
        System.out.println("\nIntento de encender (2da vez):");
        PCGamer.enceder();

        System.out.println("\nIntento de apagar:");
        PCGamer.apagar();
        
        System.out.println("\nEstado final:");
        System.out.println("Modelo: " + PCGamer.getModelo());
        System.out.println("¿Está encendida? " + PCGamer.estado());
    }
}