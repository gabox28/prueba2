import java.util.ArrayList;
import java.util.List;
public class Ejecutable {

	public Ejecutable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//creamos un array de tipo electrodomestico
		 Electrodomestico arrayelec[]=new Electrodomestico[10];
		//Tipos lavadora
		 arrayelec[0] = new Lavadora(159990,40,"negro","d",50);
			//nueva.precioFinal(nueva);; //metodo para calcular precio base lavadora segun consumo y peso
			arrayelec[0].precioFinal(); // metodo para sumar el valor segun carga
			System.out.println("Datos Lavadora " + arrayelec[0]); 
				//lav2
					
			arrayelec[1] = new Lavadora(89990,50,"rojo","A",20);	
		
			arrayelec[1].precioFinal(); // metodo para sumar el valor segun carga
			 //metodo para calcular precio base lavadora segun consumo y peso
			System.out.println("Datos Lavadora " + arrayelec[2]); 
					
			arrayelec[2] = new Television(139990,15,"negro","E",50,true);
			arrayelec[1].precioFinal();//suma valor dependiendo de resolucion y tdt
			System.out.println("Datos Televisor" + arrayelec[2]);
			
			arrayelec[3] = new Television(89990,21,"blanco","A",25,false);
			arrayelec[3].precioFinal();//suma valor dependiendo de resolucion y tdt
			System.out.println("Datos Televisor" + arrayelec[3]);
			//mas objetos
			arrayelec[4] = new Electrodomestico(49990,7,"rojo","D");
			arrayelec[5] = new Electrodomestico(29990,3,"azul","C");
			arrayelec[6] = new Television(49990,15,"negro","E",25,false);
			arrayelec[7] = new Television(109990,21,"negro","F",33,true);
			arrayelec[8] = new Lavadora(89990,50,"rojo","A",20);
			arrayelec[9] = new Television(139990,15,"negro","E",50,true);
			
			
			double electros=0;
	        double televisores=0;
	        double lavadoras=0;
	   
	        //recorrer array y sumar
	        for(int i=0;i<9;i++){
	           
	            if(arrayelec[i] instanceof Electrodomestico){
	                electros+=arrayelec[i].precioFinal();
	            }
	            if(arrayelec[i] instanceof Lavadora){
	                lavadoras+=arrayelec[i].precioFinal();
	            }
	            if(arrayelec[i] instanceof Television){
	                televisores+=arrayelec[i].precioFinal();
	            }
	        }
	   
	        //sumas
	        System.out.println("Suma lista total electrodomesticos");
	        System.out.println("Suma precio electrodomesticos"+electros);
	        System.out.println("Suma precio Lavadoras "+lavadoras);
	        System.out.println("suma precio televisores "+televisores);
			
	}

}
