import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class AlphabetOrderDiv2 {
	Vector<Character> dummy = new Vector<>();
	public String isOrdered(String[] words) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int len = alpha.length();
        Vector<Character> before[] = new Vector[len];
		Vector<Character> after[] = new Vector[len];
		for (int i = 0; i < len; i++) {
			before[i] = new Vector<>();
			after[i] = new Vector<>();
		}
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (int j = 0; j < word.length(); j++) {
				for (int k = 0; k < word.length(); k++) {
					if (k == j) {
						continue;
					}
					if (k < j) {
						before[word.charAt(j) - 'a'].add(word.charAt(k));
					}
					else {
						after[word.charAt(j) - 'a'].add(word.charAt(k));
					}
				}
			}
		}
		for (int i = 0; i < len; i++) {
			dummy.clear();
            recurse(i, before);
            Vector<Character> newBefore = new Vector<>(dummy);
			before[i] = newBefore;
		}
		for (int i = 0; i < len; i++) {
			dummy.clear();
			recurse(i, after);
			Vector<Character> newAfter= new Vector<>(dummy);
			after[i] = newAfter;
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < before[i].size(); j++) {
                char beforeCharacter = before[i].get(j);
                if (beforeCharacter == alpha.charAt(i)) {
					continue;
				}
				if (before[beforeCharacter - 'a'].contains(alpha.charAt(i))) {
					return "Impossible";
				}
			}
		}
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < after[i].size(); j++) {
				char afterCharacter = after[i].get(j);
				if (afterCharacter == alpha.charAt(i)) {
					continue;
				}
				if (after[afterCharacter - 'a'].contains(alpha.charAt(i))) {
					return "Impossible";
				}
			}
		}
		return "Possible";
	}
	public void recurse(int i, Vector<Character> v[]) {
		for (int j = 0; j < v[i].size(); j++) {
			if (dummy.contains(v[i].get(j))) {
				continue;
			}
			dummy.add(v[i].get(j));
            recurse(v[i].get(j) - 'a', v);
		}
	}
}
