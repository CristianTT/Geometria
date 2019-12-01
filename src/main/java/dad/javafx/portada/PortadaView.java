package dad.javafx.portada;

import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Tab;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PortadaView extends Tab {
	
	private Circle circulo;
	private Rectangle rectangulo;
	private Triangle triangulo;
	private Hexagon hexagono;

	public PortadaView() {
		super();
		
		circulo = new Circle();
		circulo.setRadius(40);
		circulo.setFill(Color.RED);
		circulo.setStrokeWidth(2);
		circulo.setStroke(Color.BLACK);

		rectangulo = new Rectangle();
		rectangulo.setWidth(80);
		rectangulo.setHeight(60);
		rectangulo.setFill(Color.rgb(0, 162, 232));
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);

		triangulo = new Triangle(80, 60);
		triangulo.setFill(Color.GREEN);
		triangulo.setStrokeWidth(2);
		triangulo.setStroke(Color.BLACK);

		hexagono = new Hexagon(40);
		hexagono.setFill(Color.PURPLE);
		hexagono.setStrokeWidth(2);
		hexagono.setStroke(Color.BLACK);
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.add(circulo, 1, 0);
		gridPane.add(rectangulo, 0, 0);
		gridPane.add(triangulo, 0, 1);
		gridPane.add(hexagono, 1, 1);
		
		this.setText("Portada");
		this.setContent(gridPane);
	}

}
