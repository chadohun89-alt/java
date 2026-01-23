package exam23;

public class Calculator<T extends Number> {
	public double doubleValue(T number) {
		return number.doubleValue();
	}
}
