package dad.javafx.geometria.triangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class TrianguloModel {

	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty altura = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();

	public TrianguloModel() {
		area.bind(base.multiply(altura).divide(2));
		perimetro.bind(base.divide(2).multiply(base.divide(2)).add(altura.multiply(altura)));
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}

	public final double getBase() {
		return this.baseProperty().get();
	}

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}

	public final double getAltura() {
		return this.alturaProperty().get();
	}

	public final void setAltura(final double altura) {
		this.alturaProperty().set(altura);
	}

	public final ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}

	public final double getPerimetro() {
		return base.get() + Math.sqrt(this.perimetroProperty().get()) * 2;
	}

	public final ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}

	public final double getArea() {
		return this.areaProperty().get();
	}

}
