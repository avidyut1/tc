import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ElectronicPetEasy {
	
	public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
		Set<Integer> hs = new HashSet<>();
		int time = st1;
		for (int i = 0; i < t1; i++) {
			hs.add(time);
            time += p1;
		}
		time = st2;
		for (int i = 0; i < t2; i++) {
			if (hs.contains(time)) {
				return "Difficult";
			}
			time += p2;
		}
		return "Easy";
	}
}
