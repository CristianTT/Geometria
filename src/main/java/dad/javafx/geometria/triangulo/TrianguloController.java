package dad.javafx.geometria.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController {
	
	private TrianguloView view = new TrianguloView();
	private TrianguloModel model = new TrianguloModel();
	
	public TrianguloController() {
		Bindings.bindBidirectional(view.getAnchoText().textProperty(), model.baseProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(view.getAltoText().textProperty(), model.alturaProperty(), new NumberStringConverter());
		view.getTriangle().baseProperty().bind(model.baseProperty());
		view.getTriangle().heightProperty().bind(model.alturaProperty());

		model.baseProperty().addListener((ov, nv, v) -> {
			view.getPerimetroLabel().setText("Perimetro: " + model.getPerimetro());
			view.getAreaLabel().setText("Area: " + model.getArea());
		});
		model.alturaProperty().addListener((ov, nv, v) -> {
			view.getPerimetroLabel().setText("Perimetro: " + model.getPerimetro());
			view.getAreaLabel().setText("Area: " + model.getArea());
		});
		
		model.setBase(70);
		model.setAltura(60);
	}
	
	public TrianguloView getView() {
		return view;
	}

}
