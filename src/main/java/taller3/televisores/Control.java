package taller3.televisores;


public class Control {
    private TV tv; // Atributo para enlazar el control con un televisor

    // Métodos get y set para el atributo tv
    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    // Método para enlazar el control con un televisor
    public void enlazar(TV televisor) {
        this.tv = televisor;          // Asignar el televisor al control
        televisor.setControl(this);   // Asignar este control al televisor
    }

    // Métodos para controlar el televisor de manera remota
    public void turnOn() {
        if (tv != null) {
            tv.turnOn();
        }
    }

    public void turnOff() {
        if (tv != null) {
            tv.turnOff();
        }
    }

    public void canalUp() {
        if (tv != null) {
            tv.canalUp();
        }
    }

    public void canalDown() {
        if (tv != null) {
            tv.canalDown();
        }
    }

    public void volumenUp() {
        if (tv != null) {
            tv.volumenUp();
        }
    }

    public void volumenDown() {
        if (tv != null) {
            tv.volumenDown();
        }
    }

    public void setCanal(int canal) {
        if (tv != null) {
            tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen) {
        if (tv != null) {
            tv.setVolumen(volumen);
        }
    }
}
