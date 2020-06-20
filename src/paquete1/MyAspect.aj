package paquete1;

import javafx.scene.paint.Color;

public aspect MyAspect {
	
	pointcut change(Color x): call(void update(Color)) && args(x);
	
	after(Color x):change(x){
		System.out.println("El color ha sido llamada a "+x.toString());
	}
}
