
public class Electrodomestico {
	//Definimos constantes para la construccion de la clase
	protected final static double preciobasec = 100000, pesoc = 5;
	protected final static String colorc="blanco";
	protected final static String consumoc = "F";
	//variables
	protected double preciobase;
	protected double peso;
	protected String color,consumo;
public Electrodomestico() {//constructor por defecto
	this(preciobasec,pesoc,colorc,consumoc);
}
//uno con precio y peso
public Electrodomestico(double preciobase,double peso) {
		this(preciobase,peso,consumoc,colorc);
	}//uno con todos los metodos
public Electrodomestico(double preciobase, double peso, String color, String consumo) {
	this.preciobase=preciobase;
	this.peso=peso;
	consumo.toUpperCase();//
	comprobarConsumoEnergetico(consumo);
	comprobarColor(color);
}
	
public String dimeprecio() {
	return "El precio es" + preciobase + "y el peso es = " + peso + " kgs";
}
public String comprobarConsumoEnergetico(String consumo) {
	//metodo para obtener consumo y en mayusculas
	
	if (consumo=="A"||consumo=="B"||consumo=="C"||consumo=="D"||consumo=="E"||consumo=="F") {
		this.consumo=consumo;}
		if (consumo=="a"||consumo=="b"||consumo=="c"||consumo=="d"||consumo=="e"||consumo=="f") {
			this.consumo=consumo.toUpperCase();
		
	}
	else consumo=consumoc;
	return consumo;
}
private void comprobarColor(String color) { //metodo color
	if (color=="blanco"||color=="negro"||color=="rojo"||color=="azul"||color=="gris"){
		this.color=color;
	}
	
	else this.color= colorc;
	
}
public double precioFinal(){ //metodo preciofinal
    double cont=0;
    switch(consumo){
        case "F":
            cont+=10000;
            break;
        case "E":
            cont+=30000;
            break;
        case "D":
            cont+=50000;
            break;
        case "C":
            cont+=60000;
            break;
        case "B":
            cont+=80000;
            break;
        case "A":
            cont+=100000;
            break;
         
    }

 if(peso<20) {
	cont+=10000;
 } else if(peso<50&&peso>=20) {
	 cont+=50000;
 } else if(peso<80&&peso>50) {
	 cont+=80000;
 } else if(peso>80) {
	 cont+=100000;
 }
 
  this.preciobase=preciobase+cont;
  return preciobase;
}
	
public double getPreciobase() {
	return preciobase;
}
public double getPeso() {
	return peso;
}
public String getColor() {
	return color;
}

public String getConsumo() {
	return consumo;
}
@Override
public String toString() {
	return "[preciobase=" + preciobase + ", peso=" + peso + " kgs" + ", color=" + color + ", consumo=" + consumo
			+ "]";
}

}
