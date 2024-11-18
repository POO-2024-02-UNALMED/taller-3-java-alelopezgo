package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv) {
		this.tv = tv;
	}
	public void turnOn() {
		this.tv.turnon();
	}
	public void turnOff() {
		this.tv.turnoff();
	}
	public void canalUp() {
		this.tv.canalup();
	}
	public void canalDown() {
		this.tv.canaldown();
	}
	public void volumenUp() {
		this.tv.volumenup();
	}
	public void volumenDown() {
		this.tv.volumendown();
	}
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}
	public TV gettv() {
		return this.tv;
	}
	public void settv(TV tv) {
		this.tv = tv;
	}
}