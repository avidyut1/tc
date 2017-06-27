import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MakePalindrome {
	
	public String[] constructMinimal(String card) {
		char cards[] = card.toCharArray();
		int freq[] = new int[26];
		for (int i = 0; i < card.length(); i++) {
			freq[cards[i] - 'a']++;
		}
		int allZero[] = new int[26];
		Vector<String> res = new Vector<>();
		while(!Arrays.equals(allZero, freq)) {
			Vector<Character> start = new Vector<>();
			Vector<Character> end = new Vector<>();
			for (int i = 0; i < 26; i++) {
				while (freq[i] >= 2) {
					start.add((char)('a' + i));
					end.add((char)('a' + i));
					freq[i]-=2;
				}
			}
			String palin = "";
			for (int i = 0; i < start.size(); i++) {
				palin += start.get(i);
			}
			for (int i = 0; i < 26; i++) {
				if (freq[i] % 2 != 0) {
					freq[i]--;
					palin += (char) ('a' + i);
					break;
				}
			}
			for (int i = end.size() - 1; i >= 0; i--) {
				palin += end.get(i);
			}
			res.add(palin);
		}
		String toReturn[] = new String[res.size()];
		for (int i = 0; i < res.size(); i++) {
			toReturn[i] = res.get(i);
		}
		System.out.println(Arrays.toString(toReturn));
		return toReturn;
	}
}
