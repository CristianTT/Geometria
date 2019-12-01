package dad.javafx.geometria.circulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends Tab {

	private TextField radioText;
	private Label perimetroLabel, areaLabel;
	private Circle circle;

	public CirculoView() {
		super();

		radioText = new TextField();
		perimetroLabel = new Label("Perímetro:");
		areaLabel = new Label("Area:");

		HBox radioPane = new HBox(10);
		radioPane.setAlignment(Pos.CENTER);
		Label radioLabel = new Label("Radio:");
		radioLabel.setPrefWidth(60);
		radioPane.getChildren().addAll(radioLabel, radioText);

		circle = new Circle();
		circle.setFill(Color.RED);
		circle.setStrokeWidth(2);
		circle.setStroke(Color.BLACK);

		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(radioPane, circle, perimetroLabel, areaLabel);

		this.setText("Círculo");
		this.setContent(vbox);
	}

	public TextField getRadioText() {
		return radioText;
	}

	public void setRadioText(TextField radioText) {
		this.radioText = radioText;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
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

}
