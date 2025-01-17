package utilities;

public class Converter {

	public static final double IOF = 0.06;
	
	public static double CurrencyConverter(double price, double bought) {
		return price * bought * (1.0 + IOF);
	}
}