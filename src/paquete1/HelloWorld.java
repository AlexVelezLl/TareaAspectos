package paquete1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorld extends Application{

	@Override
    public void start(Stage primaryStage) {
                
        Pantalla root = new Pantalla();      
        Boton b1 = new Boton("black");
        Boton b2 = new Boton("red");
        Boton b3 = new Boton("green");
        b1.agregarObservador(root);
        b2.agregarObservador(root);
        b3.agregarObservador(root);
        root.agregarBoton(b1, 10, 20);      
        root.agregarBoton(b2, 10, 60);  
        root.agregarBoton(b3, 10, 100);  
        Scene scene = new Scene(root.getPane(), 300, 250);        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
