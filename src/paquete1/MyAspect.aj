package paquete1;

import javafx.scene.paint.Color;

public aspect MyAspect {
	
	pointcut change(String x): call(void Pantalla.update(Color)) && args(x);
	
	after(String x):change(x){
		System.out.println("El color ha sido llamada a "+x);
	}
}
