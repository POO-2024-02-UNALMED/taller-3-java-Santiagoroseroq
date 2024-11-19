package taller3.televisores;
public class TV {
    // Atributos de instancia
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    // Atributo de clase para contar televisores
    private static int numTV = 0;

    // Constructor
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV++;  // Incrementar el contador al crear un televisor
    }

    // Métodos estáticos para numTV
    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int num) {
        numTV = num;
    }

    // Métodos get y set
    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    // Métodos para gestionar el estado
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    // Métodos para cambiar el canal
    public void canalUp() {
        if (estado && canal < 120) {
            canal++;
        }
    }

    public void canalDown() {
        if (estado && canal > 1) {
            canal--;
        }
    }

    // Métodos para cambiar el volumen
    public void volumenUp() {
        if (estado && volumen < 7) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (estado && volumen > 0) {
            volumen--;
        }
    }
}
