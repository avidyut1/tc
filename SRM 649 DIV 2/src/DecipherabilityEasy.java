import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DecipherabilityEasy {
	
	public String check(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            String ns = s.substring(0, i) + s.substring(i + 1);
            if (ns.equals(t)) {
                return "Possible";
            }
        }
        return "Impossible";
	}
}
