package paquete1;

import javafx.scene.paint.Color;

public aspect MyAspect {
	
	pointcut change(String x): call(void Pantalla.update(String)) && args(x);
	
	after(String x):change(x){
		System.out.println("The color has been changed to "+x);
	}
}
