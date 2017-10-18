import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ABBA {
	public String canObtain(String initial, String target) {
        while(target.length() > initial.length()) {
			if (target.charAt(target.length() - 1) == 'A') {
				target = target.substring(0, target.length() - 1);
			}
			else {
				target = target.substring(0, target.length() - 1);
                target = new StringBuffer(target).reverse().toString();
			}
		}
		if (initial.equals(target))
			return "Possible";
		return "Impossible";
	}
}
