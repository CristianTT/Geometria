package dad.javafx;

import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.hexagono.HexagonoController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import dad.javafx.geometria.triangulo.TrianguloController;
import dad.javafx.portada.PortadaController;
import dad.javafx.portada.PortadaView;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GeometriaApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		TabPane root = new TabPane();

		PortadaController portada = new PortadaController();
		root.getTabs().add(portada.getView());
		RectanguloController rectangulo = new RectanguloController();
		root.getTabs().add(rectangulo.getView());
		CirculoController circulo = new CirculoController();
		root.getTabs().add(circulo.getView());
		TrianguloController triangulo = new TrianguloController();
		root.getTabs().add(triangulo.getView());
		HexagonoController hexagono = new HexagonoController();
		root.getTabs().add(hexagono.getView());

		Scene scene = new Scene(root, 400, 400);

		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}
