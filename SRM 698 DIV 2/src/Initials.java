import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Initials {
	
	public String getInitials(String name) {
		String names[] = name.split(" ");
		String res = "";
		for (int i = 0; i < names.length; i++) {
			res += names[i].charAt(0);
		}
		return res;
	}
}
