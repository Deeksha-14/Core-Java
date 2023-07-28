package random;

public class Concep {

	public static void main(String[] args) {
		String s1= new String("hello world");
		System.out.println(s1.charAt(3));
		s1.length();//Returns the length of this string
		System.out.println(s1.contains("o"));
		System.out.println(s1.contains("f"));

		
			char[] chr = {'a','b','c'};
			char[] car = {'h','e','d','a',' ','s',' '};
			
			String cop = String.copyValueOf(car);
			System.out.println(cop);
	
			String check = String.copyValueOf(car, 2, 4);
			System.out.println(check);
			
			
			String name="MyName";
			int number=50;
			
			String formattedString = String.format("Hello my name is %s and i am %d years old", name, number);
			
			System.out.println("Example 1 : "+formattedString);
	
			
			double pi = 3.14159265;
			formattedString = String.format("The value of pi is approximately %.2f", pi);
			System.out.println("Example 2 : "+formattedString);
			
			int a = 10;
			System.out.println(a);
			a = 11;
			System.out.println(a);
			
			int age = 3;
			formattedString = String.format("her age is %010d", age);
			System.out.println("example 3: "+formattedString);
			
			
			String text ="Hello World";
			boolean isStrtWit=text.startsWith("H");//true
			boolean isStrtWit2=text.startsWith("o");//false
			boolean isStrtWit3=text.startsWith("h");//false
			
			
			System.out.println(isStrtWit+" "+isStrtWit2+" "+isStrtWit3);
	
	}

}
