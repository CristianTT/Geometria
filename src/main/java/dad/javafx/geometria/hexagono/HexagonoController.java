package dad.javafx.geometria.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController {
	
	private HexagonoView view = new HexagonoView();
	private HexagonoModel model = new HexagonoModel();
	
	public HexagonoController() {
		Bindings.bindBidirectional(view.getApotemaText().textProperty(), model.apotemaProperty(), new NumberStringConverter());
		view.getHexagon().radiusProperty().bind(model.apotemaProperty());

		model.apotemaProperty().addListener((ov, nv, v) -> {
			view.getPerimetroLabel().setText("Perimetro: " + model.getPerimetro());
			view.getAreaLabel().setText("Area: " + model.getArea());
		});
		
		model.setApotema(30);
	}
	
	public HexagonoView getView() {
		return view;
	}

}
