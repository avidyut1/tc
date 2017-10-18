import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class WaterAndOxygen {
	
	public double maxDays(int remainH20, int remainO2, int costH2O, int costO2) {
        double daysOxy = (double) remainO2 / costO2;
		double daysWater = (double) remainH20 / costH2O;
		if (daysOxy - daysWater >= 1e-9) {
			return daysWater;
		}
		double leftWater = remainH20 - (daysOxy * costH2O);
		double constant = (leftWater * 2 * costO2) / (2 * costO2 + costH2O);
		double days = (leftWater - constant) / costH2O;
		return days + daysOxy;
	}
}
