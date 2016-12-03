import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class GoodString {
	
	public String isGood(String s) {
		String ab = "ab";
        while(s.contains(ab)) {
            s = s.replace(ab, "");
        }
        if (s.length() == 0) {
            return "Good";
        }
        return "Bad";
	}
}
