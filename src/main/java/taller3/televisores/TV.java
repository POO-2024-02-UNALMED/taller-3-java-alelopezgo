package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		TV.numTV++;
	}
	public Marca getMarca() {
		return this.marca;
	}
	public int getCanal() {
		return this.canal;
	}
	public int getPrecio() {
		return this.precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public static int getNumTV() {
		return TV.numTV;
	}
	public Control getControl() {
		return this.control;
	}
	public boolean getEstado() {
		return this.estado;
	}	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setControl(Control control) {
		this.control = control;
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
		if (this.estado == true && canal >= 1 && canal <= 120);
		this.setCanal(this.canal + 1);
	}
	public void canalDown() {
		if (this.estado == true && canal >= 1 && canal <= 120);
		this.setCanal(this.canal - 1);
	}
	public void volumenUp() {
		if (this.estado == true && volumen >= 0 && volumen <= 7)
		this.setVolumen(this.volumen + 1);
	}
	public void volumenDown() {
		if (this.estado == true && volumen >= 0 && volumen <= 7)
		this.setVolumen(this.volumen - 1);
	}
}
