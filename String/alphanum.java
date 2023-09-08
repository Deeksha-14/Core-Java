package STr;

import java.util.Scanner;

public class thir {

	public static void main(String[] args) {
		//alphanumeric
		
		Scanner sc = new Scanner(System.in);
		//how*was23your&today
		System.out.println("Enter alphanumeric String : ");

		String str = sc.nextLine();
		
		StringBuffer alpha = new StringBuffer(), 
				num = new StringBuffer(),
				special = new StringBuffer();
		
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num.append(str.charAt(i));
			}else if(Character.isAlphabetic(str.charAt(i)))
			{
				alpha.append(str.charAt(i));
			}else {
				special.append(str.charAt(i));
			}
		}
		
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(special);
		
		
	}

}
