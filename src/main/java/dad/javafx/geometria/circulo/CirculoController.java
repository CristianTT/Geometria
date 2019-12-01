package dad.javafx.geometria.circulo;

import dad.javafx.geometria.rectangulo.RectanguloModel;
import dad.javafx.geometria.rectangulo.RectanguloView;
import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CirculoController {
	
	private CirculoView view = new CirculoView();
	private CirculoModel model = new CirculoModel();
	
	public CirculoController() {
		Bindings.bindBidirectional(view.getRadioText().textProperty(), model.radioProperty(), new NumberStringConverter());
		view.getCircle().radiusProperty().bind(model.radioProperty());

		model.radioProperty().addListener((ov, nv, v) -> {
			view.getPerimetroLabel().setText("Perimetro: " + model.getPerimetro());
			view.getAreaLabel().setText("Area: " + model.getArea());
		});
		
		model.setRadio(30);
	}
	
	public CirculoView getView() {
		return view;
	}
}
