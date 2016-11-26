import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LengthUnitCalculator {
	
	public double calc(int amount, String fromUnit, String toUnit) {
		double res = (double)amount;
		if (fromUnit.equals("ft")	) {
			res *= 12.0;
		}
		else if(fromUnit.equals("yd")) {
			res *= 12.0 * 3.0;
		}
		else if(fromUnit.equals("mi")) {
			res *= 12.0 * 3.0 * 1760.0;
		}
		if (toUnit.equals("ft")) {
			res /= 12.0;
		}
		else if(toUnit.equals("yd")) {
			res /= (12.0 * 3.0);
		}
		else if (toUnit.equals("mi")) {
			res /= (12.0 * 3.0 * 1760);
		}
		return res;
	}
}
