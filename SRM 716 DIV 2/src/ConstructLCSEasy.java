import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ConstructLCSEasy {
	
	public String construct(int ab, int bc, int ca) {
        List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();
		for (int i = 0; i < ab; i++) {
			a.add(1);
			b.add(1);
		}
		for (int i = 0; i < bc; i++) {
            c.add(1);
		}
		if (bc > ab) {
			for (int i = 0; i < bc - ab; i++) {
				b.add(1);
			}
		}
		if (ca > ab) {
			for (int i = 0; i < ca - ab; i++) {
				a.add(0, 0);
                c.add(0, 0);
			}
		}
		String res = "";
		for (int i = 0; i < a.size(); i++) {
			res += a.get(i);
		}
		res += " ";
		for (int i = 0; i < b.size(); i++) {
			res += b.get(i);
		}
		res += " ";
		for (int i = 0; i < c.size(); i++) {
			res += c.get(i);
		}
		return res;
	}
}
