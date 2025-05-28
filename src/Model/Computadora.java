package Model;

public class Computadora {
    private String marca = "Lenovo";
    private String modelo;
    private boolean encedido;

    public void enceder() {
        if (!encedido) {
            System.out.println("Encendiendo...");
            this.encedido = true;
        } else {
            System.out.println("La computadora ya está encendida.");
        }
    }

    public void apagar() {
        if (encedido) {
            System.out.println("Apagando...");
            this.encedido = false;
        } else {
            System.out.println("La computadora ya está apagada.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public boolean encendido() {
        return encedido;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
