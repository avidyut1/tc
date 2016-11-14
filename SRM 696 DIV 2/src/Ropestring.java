import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Ropestring {
	
	public String makerope(String s) {
		char rop[] = s.toCharArray();
		Queue<Integer> even = new PriorityQueue<Integer>(rop.length, Collections.reverseOrder());
		Queue<Integer> odd = new PriorityQueue<Integer>(rop.length, Collections.reverseOrder());
		int dots = 0;
		for (int i = 0; i < rop.length; i++) {
			if(rop[i] == '.') {
				dots++;
				continue;
			}
			int j = i;
			int count = 0;
			while(j < rop.length && rop[j] == '-') {
				count++;
				j++;
			}
			i = j - 1;
			if(count % 2 == 0) {
				even.add(count);
			}
			else {
				odd.add(count);
			}
		}
		int used = 0;
		String res = "";
		while(!even.isEmpty()){
			int c = even.poll();
			for (int i = 0; i < c; i++) {
				res += "-";
			}
			res += ".";
			used++;
		}
		while(!odd.isEmpty()){
			int c = odd.poll();
			for (int i = 0; i < c; i++) {
				res += "-";
			}
			res += ".";
			used++;
		}
		if(used > dots) {
			res = res.substring(0, res.length() - 1);
			return res;
		}
		int dotrem = dots - used;
		System.out.println(dotrem);
		for (int i = 0; i < dotrem; i++) {
			res += ".";
		}
		return res;
	}
}
