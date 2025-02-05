package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.precio = 500;
        this.volumen = 1;
        numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	public void canalUp() {
		if (this.estado) {
			if (this.canal < 120) {
				this.canal = this.canal + 1;
			}
		}
	}
	
	public void canalDown() {
		if (this.estado) {
			if (this.canal > 1) {
				this.canal = this.canal - 1;
			}
		}
	}
	
	public void volumenUp() {
		if (this.estado) {
			if (this.volumen < 7) {
				this.volumen = this.volumen + 1;
			}
		}
	}
	
	public void volumenDown() {
		if (this.estado) {
			if (this.volumen > 0) {
				this.volumen = this.volumen - 1;
			}
		}
	}

}