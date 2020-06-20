package paquete1;

public aspect MyAspect {
	before(): execution(* *.test()){
        System.out.println("Aspecto");
    }
}
