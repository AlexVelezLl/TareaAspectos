package paquete1;

public aspect MyAspect {
	
	pointcut change(String x): call(void accion(String)) && args(x);
	
	after(String x):change(x){
		System.out.println(x);
		
	}
}
