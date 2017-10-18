import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class NamingConvention {
	
	public String toCamelCase(String variableName) {
		String sc[] = variableName.split("_");
		String res = sc[0];
		for (int i = 1; i < sc.length; i++) {
			res += Character.toUpperCase(sc[i].charAt(0)) + sc[i].substring(1);
		}
		return res;
	}
}
