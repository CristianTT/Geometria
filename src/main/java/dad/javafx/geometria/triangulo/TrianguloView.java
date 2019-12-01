package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TrianguloView extends Tab {
	
	private TextField baseText, alturaText;
	private Label perimetroLabel, areaLabel;
	private Triangle triangle;
	
	public TrianguloView() {
		super();
		
		baseText = new TextField();
		alturaText = new TextField();
		perimetroLabel = new Label("Perímetro:");
		areaLabel = new Label("Area:");
		

		HBox basePane = new HBox(10);
		basePane.setAlignment(Pos.CENTER);
		Label baseLabel = new Label("Base:");
		baseLabel.setPrefWidth(60);
		basePane.getChildren().addAll(baseLabel, baseText);
		HBox alturaPane = new HBox(10);
		alturaPane.setAlignment(Pos.CENTER);
		Label alturaLabel = new Label("Altura:");
		alturaLabel.setPrefWidth(60);
		alturaPane.getChildren().addAll(alturaLabel, alturaText);
		
		triangle = new Triangle();
		triangle.setFill(Color.GREEN);
		triangle.setStrokeWidth(2);
		triangle.setStroke(Color.BLACK);
		
		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(basePane, alturaPane, triangle, perimetroLabel, areaLabel);
		
		this.setText("Triángulo");
		this.setContent(vbox);
	}

	public TextField getAnchoText() {
		return baseText;
	}

	public void setAnchoText(TextField anchoText) {
		this.baseText = anchoText;
	}

	public TextField getAltoText() {
		return alturaText;
	}

	public void setAltoText(TextField altoText) {
		this.alturaText = altoText;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public void setPerimetroLabel(Label perimetroLabel) {
		this.perimetroLabel = perimetroLabel;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public void setAreaLabel(Label areaLabel) {
		this.areaLabel = areaLabel;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
