package paquete1;

import java.awt.Color;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application{

	@Override
    public void start(Stage primaryStage) {
                
        Pantalla root = new Pantalla();
        //root.getChildren().add(new Label("Alo"));        
        Boton b1 = new Boton("black");
        Boton b2 = new Boton("red");
        Boton b3 = new Boton("green");
        b1.agregarObservador(root);
        b2.agregarObservador(root);
        b3.agregarObservador(root);
        root.agregarBoton(b1, 10, 20);      
        root.agregarBoton(b2, 10, 60);  
        root.agregarBoton(b3, 10, 100);  
        b1.getBoton().setOnMouseClicked((e)->{
        	root.update(b1.getColor());
        });
        b2.getBoton().setOnMouseClicked((e)->{
        	root.update(b2.getColor());
        });
        b3.getBoton().setOnMouseClicked((e)->{
        	root.update(b3.getColor());
        });
        Scene scene = new Scene(root.getPane(), 300, 250);        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Color c=Color.red;
    	
    	
        Persona p = new Persona();
        p.accion("juan");
        p.test();
        launch(args);
    }
}
