package dad.javafx.geometria.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {
	
	private RectanguloView view = new RectanguloView();
	private RectanguloModel model = new RectanguloModel();
	
	public RectanguloController() {
		Bindings.bindBidirectional(view.getAnchoText().textProperty(), model.anchoProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(view.getAltoText().textProperty(), model.altoProperty(), new NumberStringConverter());
		view.getRectangulo().widthProperty().bind(model.anchoProperty());
		view.getRectangulo().heightProperty().bind(model.altoProperty());

		model.anchoProperty().addListener((ov, nv, v) -> {
			view.getPerimetroLabel().setText("Perimetro: " + model.getPerimetro());
			view.getAreaLabel().setText("Area: " + model.getArea());
		});
		model.altoProperty().addListener((ov, nv, v) -> {
			view.getPerimetroLabel().setText("Perimetro: " + model.getPerimetro());
			view.getAreaLabel().setText("Area: " + model.getArea());
		});
		
		model.setAncho(70);
		model.setAlto(50);
	}
	
	public RectanguloView getView() {
		return view;
	}

}
