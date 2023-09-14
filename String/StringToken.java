package AllGIt;

import java.util.StringTokenizer;

public class StringTok {

	public static void main(String[] args) {
		String str = "hi where are you going";
		
		StringTokenizer str1 = new StringTokenizer(str);
		
		while(str1.hasMoreElements())
		{
			System.out.println(str1.nextElement());
		}

	}

}
