import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MultiplicationTable2Easy {
	
	public String isGoodSet(int[] table, int[] t) {
		int n = t.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int res = table[t[i] * (int)Math.sqrt(table.length) + t[j]];
				System.out.println(res);
				boolean ans = false;
				for (int k = 0; k < n; k++) {
					if (t[k] == res) {
						ans = true;
						break;
					}
				}
				if (!ans){
					return "Not Good";
				}
			}
		}
		return "Good";
	}
}
