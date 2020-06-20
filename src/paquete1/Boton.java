package paquete1;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class Boton implements SujetoObservable {
	private Button b;
	private Color color;
	private ArrayList<Observador> observadores;
	
	public Boton(Color color) {
		this.color=color;
		this.observadores=new ArrayList<Observador>();
		this.b= new Button(color.toString());
		
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
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color=color;
		this.b.setText(color.toString());
	}
	
}
