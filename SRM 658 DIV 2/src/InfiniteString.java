import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class InfiniteString {
	
	public String equal(String s, String t) {
		String T = t;
		String S = s;
        while(S.length() != T.length()) {
			if (S.length() < T.length()) {
				S = S + s;
			}
			else{
				T = T + t;
			}
		}
		if (S.equals(T)) {
			return "Equal";
		}
		return "Not equal";
	}
}
