import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Quacking {
	
	public int quack(String s) {
		String word = "quack";
		for (int numduck = 1; numduck <= 500 ; numduck++) {
			String [] ds = new String[numduck];
			for (int i = 0; i < numduck; i++) {
				ds[i] = "";
			}
			boolean can = true;
			char sc[] = s.toCharArray();
			for (int i = 0; i < s.length(); i++) {
				char c = sc[i];
				int ind = word.indexOf(c);
				if (ind < 0)
					return -1;
				char prev;
				if (ind - 1 >= 0) {
					prev = word.charAt(ind - 1);
				}
				else {
					prev = 'k';
				}
				boolean placed = false;
				for (int j = 0; j < numduck; j++) {
					if (ds[j] == ""){
						ds[j] += c;
						placed = true;
						break;
					}
					else {
						if(ds[j].charAt(ds[j].length() - 1) == prev) {
							ds[j] += c;
							placed = true;
							break;
						}
					}
				}
				if (!placed) {
					can = false;
					break;
				}
			}
			if (can){
				for (int i = 0; i < numduck; i++) {
					while (ds[i].indexOf("quack") >= 0) {
						ds[i] = ds[i].replace("quack", "");
					}
				}
				for (int i = 0; i < numduck; i++) {
					if (!ds[i].equals("")) {
						can = false;
					}
				}
				if (can)
					return numduck;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Quacking q = new Quacking();
		System.out.println(q.quack("quqacukqauackck"));
	}
}
