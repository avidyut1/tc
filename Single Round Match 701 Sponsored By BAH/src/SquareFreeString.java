import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SquareFreeString {
	
	public String isSquareFree(String s) {
		boolean sf = true;
		for (int i = 0; i <= s.length() && sf; i++) {
			for (int j = i + 1; j <= s.length() && sf; j++) {
				String subs = s.substring(i, j);
//				System.out.println(subs);
				if(!isSquareFreeSub(subs)){
					sf = false;break;
				}
			}
		}
		if (sf) {
			return "square-free";
		}
		else{
			return "not square-free";
		}
	}
	public boolean isSquareFreeSub(String s) {
		int len = s.length();
		if (len % 2 == 0) {
			int mid = len / 2;
			String fp = s.substring(0, mid);
			String sp = s.substring(mid);
			if (fp.equals(sp)){
				return false;
			}
			return true;
		}
		else {
			return true;
		}
	}
}
