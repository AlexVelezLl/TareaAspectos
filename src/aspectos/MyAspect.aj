package aspectos;
import interfaces.Observador;
public aspect MyAspect {
	
	pointcut change(String x): call(void Observador.update(String)) && args(x);
	
	after(String x):change(x){
		System.out.println("The color has been changed to "+x+"\n");
		System.out.println("-------------------------------------");
	}
	
	//Implementación adicional
	before(String x): change(x){
			System.out.println("The color is going to change to: "+x+"\nPlease wait.\n");
		}
}
