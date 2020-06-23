package clases;

import interfaces.Observador;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Pantalla implements Observador{

	private Pane pane;
	
	public Pantalla() {
		pane = new Pane();
		
	}
	
	public void agregarBoton(Boton b1, int x, int y) {
		b1.getBoton().setLayoutX(x);
		b1.getBoton().setLayoutY(y);		
		pane.getChildren().add(b1.getBoton());		
		
	}
	public Pane getPane() {
		return this.pane;
	}
	
	public void setPane(BorderPane pane) {
		this.pane = pane;
	}
	
	
	@Override
	public void update(String color) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pane.setStyle("-fx-background-color: "+color);
	}

}
