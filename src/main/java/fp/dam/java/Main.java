package fp.dam.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	static ArrayList<String> m1(String s) {
		ArrayList<String> list = new ArrayList<>();
		int inicio = 0;
		int i;
		for (i = 1; i<s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
			if (i - inicio >= 2)
				list.add(s.substring(inicio, i));
			inicio = i;
			
		}
	}
	if (i - inicio >= 2)
		list.add(s.substring(inicio, i));
		return list;
	}

	static ArrayList<String> m2(String s) {
		ArrayList<String> list = new ArrayList<>();
		Matcher m = Pattern.compile("(.)\\1+").matcher(s);
		while (m.find())
			list.add(m.group());
		return list;
	}

	static Integer m3a(int [][] m) {
		int max = Integer.MIN_VALUE;
		if (m.length < 3)
			return null;
		int cols = m[0].length;
		if (cols < 3)
			return null;
		for (int i=1; i<m.length; i++)
			if (m[i].length != cols || m[i].length < 3)
				return null;
		
		for (int i=0; i<=m.length-3; i++) 
			for (int j=0; j<=m[i].length-3; j++) {
			int suma = 0;
			for (int k=i; k<=i+2; k++)
				for (int l=j; l<=j+2; l++)
					suma += m[k][l];
				if (max < suma)
					max = suma;
			
		}
		return max;
	}







}		
			
				
			
				
			


