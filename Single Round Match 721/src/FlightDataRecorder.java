import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FlightDataRecorder {
	
	public double getDistance(int[] heading, int[] distance) {
	    double x = 0.0d;
		double y = 0.0d;
		for (int i = 0; i < heading.length; i++) {
			x += (Math.sin(Math.toRadians(heading[i])) * distance[i]);
			y += (Math.cos(Math.toRadians(heading[i])) * distance[i]);
		}
		return Math.sqrt(Math.pow(x, 2.0d) + Math.pow(y, 2.0d));
	}
}
