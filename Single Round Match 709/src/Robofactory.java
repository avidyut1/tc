import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Robofactory {
	
	public int reveal(int[] query, String[] answer) {
		int n = query.length;
		Vector<Integer> cr = new Vector<>();
        if (query[0] % 2 == 0 && !answer[0].equals("Even")) {
			cr.add(0);
		}
		else if(query[0] % 2 != 0 && !answer[0].equals("Odd")){
			cr.add(0);
		}
		boolean cantDecide = false;
		for (int i = 1; i < n; i++) {
            if (query[i] % 2 == 0 && answer[i].equals("Odd") || query[i] % 2 != 0 && answer[i].equals("Even")){
                if(query[i - 1] % 2 != 0) {
                    cr.add(i);
            	}
			}
			else {
				cantDecide = true;
			}
		}
		System.out.println(cr);
		if(cr.size() == 1) {
			return cr.get(0);
		}
		else if(cr.size() == 0) {
			return 0;
		}
		else if (cantDecide) {
			return -1;
		}
		return -1;
	}
}
