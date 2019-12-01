package dad.javafx.geometria.hexagono;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonoModel {

	private DoubleProperty apotema = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();

	public HexagonoModel() {
	}

	public final DoubleProperty apotemaProperty() {
		return this.apotema;
	}

	public final double getApotema() {
		return this.apotemaProperty().get();
	}

	public final void setApotema(final double apotema) {
		this.apotemaProperty().set(apotema);
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}

	public final double getPerimetro() {
		return (apotema.get() * Math.sin(Math.toRadians(30)) / Math.sin(Math.toRadians(60))) * 12;
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}

	public final double getArea() {
		return this.getPerimetro()*this.getApotema()/2;
	}

}
