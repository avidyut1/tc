import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AttackOfTheClones {
	
	public int count(int[] firstWeek, int[] lastWeek) {
		int w = 1;
		for (int i = 0; i < firstWeek.length; i++) {
			for (int j = 0; j < lastWeek.length; j++) {
				if(firstWeek[i] == lastWeek[j]){
					w = Math.max(w, i - j + 1);
				}
			}
		}
		return w;
	}
}
