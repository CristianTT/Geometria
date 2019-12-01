package dad.javafx.geometria.hexagono;

import dad.javafx.geometria.shapes.Hexagon;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HexagonoView extends Tab {

	private TextField apotemaText;
	private Label perimetroLabel, areaLabel;
	private Hexagon hexagon;

	public HexagonoView() {
		super();

		apotemaText = new TextField();
		perimetroLabel = new Label("Perímetro:");
		areaLabel = new Label("Area:");

		HBox apotemaPane = new HBox(10);
		apotemaPane.setAlignment(Pos.CENTER);
		Label apotemaLabel = new Label("Apotema:");
		apotemaLabel.setPrefWidth(60);
		apotemaPane.getChildren().addAll(apotemaLabel, apotemaText);

		hexagon = new Hexagon();
		hexagon.setFill(Color.PURPLE);
		hexagon.setStrokeWidth(2);
		hexagon.setStroke(Color.BLACK);

		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(apotemaPane, hexagon, perimetroLabel, areaLabel);

		this.setText("Hexágono");
		this.setContent(vbox);
	}

	public TextField getApotemaText() {
		return apotemaText;
	}

	public void setApotemaText(TextField apotemaText) {
		this.apotemaText = apotemaText;
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

	public Hexagon getHexagon() {
		return hexagon;
	}

	public void setHexagon(Hexagon hexagon) {
		this.hexagon = hexagon;
	}

}
