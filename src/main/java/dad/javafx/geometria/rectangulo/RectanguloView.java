package dad.javafx.geometria.rectangulo;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends Tab {
	
	private TextField anchoText, altoText;
	private Label perimetroLabel, areaLabel;
	private Rectangle rectangulo;
	
	public RectanguloView() {
		super();
		
		anchoText = new TextField();
		altoText = new TextField();
		perimetroLabel = new Label("Perímetro:");
		areaLabel = new Label("Area:");
		

		HBox anchoPane = new HBox(10);
		anchoPane.setAlignment(Pos.CENTER);
		Label anchoLabel = new Label("Ancho:");
		anchoLabel.setPrefWidth(60);
		anchoPane.getChildren().addAll(anchoLabel, anchoText);
		HBox altoPane = new HBox(10);
		altoPane.setAlignment(Pos.CENTER);
		Label altoLabel = new Label("Alto:");
		altoLabel.setPrefWidth(60);
		altoPane.getChildren().addAll(altoLabel, altoText);
		
		rectangulo = new Rectangle();
		rectangulo.setFill(Color.rgb(0, 162, 232));
		rectangulo.setStrokeWidth(2);
		rectangulo.setStroke(Color.BLACK);
		
		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(anchoPane, altoPane, rectangulo, perimetroLabel, areaLabel);
		
		this.setText("Rectángulo");
		this.setContent(vbox);
	}

	public TextField getAnchoText() {
		return anchoText;
	}

	public void setAnchoText(TextField anchoText) {
		this.anchoText = anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public void setAltoText(TextField altoText) {
		this.altoText = altoText;
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

	public Rectangle getRectangulo() {
		return rectangulo;
	}

	public void setRectangulo(Rectangle rectangulo) {
		this.rectangulo = rectangulo;
	}
	

}
