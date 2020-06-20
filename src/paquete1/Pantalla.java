package paquete1;

import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;

public class Pantalla implements Observador{

	private BorderPane pane;
	
	public Pantalla() {
		pane = new BorderPane();
	}
	
	public BorderPane getPane() {
		return this.pane;
	}
	
	public void setPane(BorderPane pane) {
		this.pane = pane;
	}
	
	
	@Override
	public void update(String color) {
		pane.setStyle("-fx-background-color: "+color);
	}

}
