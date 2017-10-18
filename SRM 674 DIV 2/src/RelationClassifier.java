import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RelationClassifier {
	
	public String isBijection(int[] domain, int[] range) {
		int map[] = new int[101];
		Set<Integer> domains = new HashSet<Integer>();
		for (int i = 0; i < domain.length; i++) {
			domains.add(domain[i]);
		}
		Set<Integer> ranges = new HashSet<Integer>();
		for (int i = 0; i < domain.length; i++) {
			ranges.add(range[i]);
		}
		if (domains.size() == domain.length && range.length == ranges.size()) {
			return "Bijection";
		}
		return "Not";
	}
}
