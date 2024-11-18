package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv) {
        this.tv = tv;
        tv.setCanal(this);
    }

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
            tv.setCanal(tv.getCanal() + 1);
        }
    }

    public void canalDown() {
        if (tv != null) {
            tv.setCanal(tv.getCanal() - 1);
        }
    }

    public void volumenUp() {
        if (tv != null) {
            tv.setVolumen(tv.getVolumen() + 1);
        }
    }

    public void volumenDown() {
        if (tv != null) {
            tv.setVolumen(tv.getVolumen() - 1);
        }
    }

    public void setCanal(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCanal'");
    }

    public void setCanal(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCanal'");
    }
}
