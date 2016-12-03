import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LuckyXor {
	
	public int construct(int a) {
		for (int b = a; b <= 100; b++) {
			int res = a ^ b;
			if (isLucky(res)) {
				return  b;
			}
		}
		return -1;
	}
	public boolean isLucky(int n) {
		String ns = ""+n;
		for (int i = 0; i < ns.length(); i++) {
			if (ns.charAt(i) == '4' || ns.charAt(i) == '7') {
				continue;
			}
			return false;
		}
		return  true;
	}
}
