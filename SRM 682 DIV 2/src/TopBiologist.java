import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TopBiologist {

	public String findShortestNewSequence(String sequence) {
		Set<String> hs = new HashSet<String>();
		String dna = "ACGT";
		//length 1
		for (int i = 0; i < 4; i++) {
			hs.add(Character.toString(dna.charAt(i)));
		}
		//length 2
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				String res = dna.charAt(i) + "" + dna.charAt(j);
				hs.add(res);
			}
		}
		//length 3
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					String res = dna.charAt(i) + "" + dna.charAt(j) + ""+ dna.charAt(k);
					hs.add(res);
				}
			}
		}
		//length 4
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						String res = dna.charAt(i) + "" + dna.charAt(j) + ""+ dna.charAt(k) + "" + dna.charAt(l);
						hs.add(res);
					}
				}
			}
		}
		//length 5
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						for (int m = 0; m < 4; m++) {
							String res = dna.charAt(i) + "" + dna.charAt(j) + ""+ dna.charAt(k) + "" + dna.charAt(l) + "" + dna.charAt(m);
							hs.add(res);
						}
					}
				}
			}
		}
		//length 6
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						for (int m = 0; m < 4; m++) {
							for (int n = 0; n < 4; n++) {
								String res = dna.charAt(i) + "" + dna.charAt(j) + ""+ dna.charAt(k) + "" + dna.charAt(l) + "" + dna.charAt(m) + "" + dna.charAt(n);
								hs.add(res);
							}
						}
					}
				}
			}
		}
		int ans = Integer.MAX_VALUE;
		String ret = "";
		for (String s: hs) {
			if (sequence.indexOf(s) < 0) {
				if (s.length() < ans) {
					ret = s;
					ans = s.length();
				}
			}
		}
		if(ret.equals(""))
			ret = "ACGTC";
		return ret;
	}
//	Set<String> hs = new HashSet<String>();
//	public String findShortestNewSequence(String sequence) {
//		String dna = "ACGT";
//		for (int i = 0; i < 1 << 4; i++) {
//			int mask = i;
//			String s = "";
//			for (int j = 0; j < 4; j++) {
//				if((mask & (1 << j)) != 0){
//					s += dna.charAt(j);
//				}
//			}
//			hs.add(s);
//		}
//		Vector<String> init = new Vector<String>();
//		for (String s: hs) {
//			init.add(s);
//		}
//		for(String s: init) {
//			permute(0, s);
//		}
//		int ans = Integer.MAX_VALUE;
//		String ret = "";
//		for (String s: hs) {
//			if (sequence.indexOf(s) < 0) {
//				if (s.length() < ans) {
//					ret = s;
//					ans = s.length();
//				}
//			}
//		}
//		return ret;
//	}
//	public void permute(int i, String s) {
//		if (i == s.length()) {
//			hs.add(s);
//			return;
//		}
//		char c[] = s.toCharArray();
//		for (int k = i; k < s.length(); k++) {
//			char temp = c[k];
//			c[k] = c[i];
//			c[i] = temp;
//			permute(i + 1, new String(c));
//			temp = c[k];
//			c[k] = c[i];
//			c[i] = temp;
//		}
//	}
}
