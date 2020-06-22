package paquete1;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Boton implements SujetoObservable {
	private Button b;
	private String color;
	private ArrayList<Observador> observadores;
	
	public Boton(String color) {
		this.color=color;
		this.observadores=new ArrayList<Observador>();
		this.b= new Button(color);
		b.setOnAction(e->notificar());
	}
	
	@Override
	public void notificar() {
		for (Observador o:observadores) {
			o.update(color);
		}
		
	}
	
	public void agregarObservador(Observador o) {
		this.observadores.add(o);
		
	}
	
	public Button getBoton(){
		return this.b;
	}
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color=color;
		this.b.setText(color);
	}
	
}
