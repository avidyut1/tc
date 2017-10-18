import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CorruptedMessage {
	
	public String reconstructMessage(String s, int k) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < alpha.length(); i++) {
			String res = "";
			for (int j = 0; j < s.length(); j++) {
				res += alpha.charAt(i);
			}
			int diff = 0;
			for (int j = 0; j < res.length(); j++) {
				if (s.charAt(j) != res.charAt(j)) {
					diff++;
				}
			}
			if (diff == k){
				return res;
			}
		}
		return null;
	}
}
