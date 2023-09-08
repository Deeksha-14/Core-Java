package STr;

public class retString {

	public static void main(String[] args) {
		//return a string from num+string
		
		String str ="hello6354There8374";
		
		String str1 = str.replaceAll("[^0-9]", "");
		String str2 = str.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		System.out.println(str2);
		

	}

}
