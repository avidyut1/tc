import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MiddleCode {
	
	public String encode(String s) {
		Vector<Character> v = new Vector<>();
		for (int i = 0; i < s.length(); i++) {
			v.add(s.charAt(i));
		}
		String t = "";
		while(v.size() != 0) {
			if (v.size() % 2 != 0){
				int mid = v.size() / 2;
                t += v.get(mid);
				v.remove(mid);
			}
			else{
				int mid = v.size() / 2;
				if (v.get(mid) < v.get(mid - 1)) {
					t+=v.get(mid);
					v.remove(mid);
				}
				else{
					t+=v.get(mid - 1);
					v.remove(mid - 1);
				}
			}
		}
		return t;
	}
}
