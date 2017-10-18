import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LostCharacter {
	
	public int[] getmins(String[] str) {
        int n = str.length;
		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			char[] val = str[i].toCharArray();
			String ist = fill(val, 'a');
            Vector<String> other = new Vector<>();
			for (int j = 0; j < n; j++) {
				if (j == i) {
					continue;
				}
				other.add(fill(str[j].toCharArray(), 'z'));
			}
			other.add(ist);
			Collections.sort(other);
			res[i] = other.indexOf(ist);
		}
		return res;
	}
	public String fill(char car[], char c) {
		for (int i = 0; i < car.length; i++) {
			if (car[i] == '?') {
				car[i] = c;
			}
		}
		return new String(car);
	}
}
