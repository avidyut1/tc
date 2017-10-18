import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DoubleString {
	
	public String check(String S) {
		int mid = S.length() / 2;
		if (S.substring(0, mid).equals(S.substring(mid))) {
			return "square";
		}
		return "not square";
	}
}
