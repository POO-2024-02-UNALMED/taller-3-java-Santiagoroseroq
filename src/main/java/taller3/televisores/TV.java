package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int volumen = 1;
    private boolean estado;
    private static int numTVs = 0;
    private int precio;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTVs++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(Control canal) {
        if (estado && canal >= 1 && control <= 120) {
            this.canal = canal;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }

    public static int getNumTVs() {
        return numTVs;
    }

    public static void setNumTVs(int numTVs) {
        TV.numTVs = numTVs;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
