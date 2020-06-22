package paquete1;

import javafx.scene.paint.Color;

public aspect MyAspect {
	
	pointcut change(String x): call(void Observador.update(String)) && args(x);
	
	after(String x):change(x){
		System.out.println("The color has been changed to "+x+"\n");
		System.out.println("-------------------------------------");
	}
	
	//Implementación adicional
		pointcut beforechange(String x): call(void Observador.update(String)) && args(x);	
		before(String x): beforechange(x){
			System.out.println("The color is going to change to: "+x+"\nPlease wait.\n");
		}
}
