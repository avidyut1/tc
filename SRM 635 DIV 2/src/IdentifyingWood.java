import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class IdentifyingWood {
	
	public String check(String s, String t) {
		int tind = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t.charAt(tind)) {
				tind++;
			}
			if (tind == t.length()) {
				return "Yep, it's wood.";
			}
		}
		return "Nope.";
	}
}
