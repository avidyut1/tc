import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Cdgame {
	
	public int rescount(int[] a, int[] b) {
		Set<Integer> outcome = new HashSet<>();
		int suma = 0;
		int sumb = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		for (int i = 0; i < b.length; i++) {
			sumb += b[i];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int resa = suma;
				resa -= a[i];
				resa += b[j];
				int resb = sumb;
				resb -= b[j];
				resb += a[i];
				outcome.add(resa * resb);
			}
		}
		return outcome.size();
	}
}
