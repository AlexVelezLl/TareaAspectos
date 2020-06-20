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
                
        StackPane root = new StackPane();
        root.getChildren().add(new Label("Alo"));
        
        Scene scene = new Scene(root, 300, 250);
        
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
