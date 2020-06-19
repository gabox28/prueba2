
public class Television extends Electrodomestico {
	int resolucion = 20;
	boolean sintonizadorTDT = false;
	public Television(double preciobase, double peso, String color, String consumo, int resolucion, boolean sintonizadorTDT) {
		super(preciobase, peso, color, consumo);
		this.resolucion=resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	public void preciofinaltele() {
		if(resolucion>40) {
			this.preciobase=preciobase * 1.3;
	}
		if(sintonizadorTDT=true) {
			this.preciobase=preciobase +50000;
		}
	}
}
