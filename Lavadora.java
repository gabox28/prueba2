
public class Lavadora extends Electrodomestico {
private int carga;
final private static int cargac=5;
	
	public Lavadora() {
		this(preciobasec,pesoc,colorc,consumoc,cargac);
	}
	public Lavadora(double preciobase,double peso) {
		this(preciobase,peso,consumoc,colorc,cargac);
	}
	public Lavadora(double preciobase, double peso, String color, String consumo, int carga) {
		super(preciobase, peso, color, consumo);
		this.carga=carga;
		this.precioFinal(carga);
	}
public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

public void precioFinal(int carga) {
	if(carga>30) {
		this.preciobase=preciobase+50000;}
}
@Override
public String dimeprecio() {
	// TODO Auto-generated method stub
	return super.dimeprecio();
}
@Override
public String comprobarConsumoEnergetico(String consumo) {
	// TODO Auto-generated method stub
	return super.comprobarConsumoEnergetico(consumo);
}


@Override
public double getPreciobase() {
	// TODO Auto-generated method stub
	return super.getPreciobase();
}
@Override
public double getPeso() {
	// TODO Auto-generated method stub
	return super.getPeso();
}
@Override
public String getColor() {
	// TODO Auto-generated method stub
	return super.getColor();
}
@Override
public String getConsumo() {
	// TODO Auto-generated method stub
	return super.getConsumo();
}

}