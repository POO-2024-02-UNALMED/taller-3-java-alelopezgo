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
		TV.numTV += 1;
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
	public static int getnumTV() {
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
	public void turnon() {
		this.estado = true;
	}
	public void turnoff() {
		this.estado = false;
	}
	public void canalup() {
		if (this.estado = true && canal >= 1 && canal <= 120);
		this.canal += 1;
	}
	public void canaldown() {
		if (this.estado = true && canal >= 1 && canal <= 120);
		this.canal -= 1;
	}
	public void volumenup() {
		if (this.estado = true && volumen >= 0 && volumen <= 7)
		this.volumen += 1;
	}
	public void volumendown() {
		if (this.estado = true && volumen >= 0 && volumen <= 7)
		this.volumen -= 1;
	}
}