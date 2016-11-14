import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SimilarUserDetection {
	
	public String haveSimilar(String[] handles) {
		boolean similar = false;
		for (int i = 0; i < handles.length; i++) {
			for (int j = i + 1; j < handles.length; j++) {
				if (similar(handles[i], handles[j])) {
					similar = true;
					break;
				}
			}
		}
		if (similar) {
			return "Similar handles found";
		}
		return "Similar handles not found";
	}
	public boolean similar(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		boolean similar = true;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				continue;
			}
			if (s1.charAt(i) == '0' && s2.charAt(i) == 'O') {
				continue;
			}
			if (s1.charAt(i) == 'O' && s2.charAt(i) == '0') {
				continue;
			}
			if (s1.charAt(i) == '1' && s2.charAt(i) == 'l') {
				continue;
			}
			if (s1.charAt(i) == 'l' && s2.charAt(i) == '1') {
				continue;
			}
			if (s1.charAt(i) == '1' && s2.charAt(i) == 'I') {
				continue;
			}
			if (s1.charAt(i) == 'I' && s2.charAt(i) == '1') {
				continue;
			}
			if (s1.charAt(i) == 'I' && s2.charAt(i) == 'l') {
				continue;
			}
			if (s1.charAt(i) == 'l' && s2.charAt(i) == 'I') {
				continue;
			}
			similar = false;break;
		}
		return similar;
	}
}
