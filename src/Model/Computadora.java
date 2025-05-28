package Model;

public class Computadora {
    private String marca;
    private String modelo;
    private boolean encedido;

    public void enceder() {
        this.encedido = true;
    }

    public void apagar() {
        this.encedido = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public boolean estado() {
        return encedido;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
