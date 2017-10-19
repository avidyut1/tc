import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TCPhoneHomeEasy {
	
	public long validNumbers(int digits, String[] specialPrefixes) {
		long totalNumbers = 1l;
		for (int i = 0; i < digits; i++) {
			totalNumbers *= 10L;
		}
		for (String pre: specialPrefixes){
			long totalNumberWithPrefix = 1L;
			for (int i = 0; i < digits - pre.length(); i++) {
				totalNumberWithPrefix *= 10;
			}
			totalNumbers -= totalNumberWithPrefix;
		}
		return totalNumbers;
	}
}
