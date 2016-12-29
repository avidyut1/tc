import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FoxAndSouvenirTheNext {
	
	public String ableToSplit(int[] value) {
		int sum = 0;
		Arrays.sort(value);
		if (value.length % 2 != 0) {
			return "Impossible";
		}
		Queue<Integer> pqmin = new PriorityQueue<>();
		Queue<Integer> pqmax = new PriorityQueue<>(100000, Collections.reverseOrder());
		for (int i = 0; i < value.length; i++) {
			sum += value[i];
            pqmax.add(value[i]);
			pqmin.add(value[i]);
		}
		Vector<Integer> setf = new Vector<>();
        while(setf.size() != value.length / 2) {
			if (pqmin.size() > 0) {
				int min = pqmin.poll();
				setf.add(min);
				pqmax.remove(new Integer(min));
				sum -= min;
			}
			if (setf.size() == value.length / 2)
				break;
			if (pqmax.size() > 0) {
				int max = pqmax.poll();
				setf.add(max);
				pqmin.remove(new Integer(max));
				sum -= max;
			}
		}
		int fs = 0;
		for(int s: setf) {
			fs += s;
		}
		if (sum == fs){
			return "Possible";
		}
		return "Impossible";
	}
}
