import java.util.*;

public class split{

public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str = sc.nextLine();
	
	
	String[] strArr = str.split(" ", 2);
	
	for(String s:strArr)
	{
	System.out.println(s);
	}
	
String[] strArr1 = str.split(" ", 3);
	
	for(String s:strArr1)
	{
	System.out.println(s);
	}
	
	
	
String[] strArr2 = str.split(" ", -3);
	
	for(String s:strArr2)
	{
	System.out.println(s);
	}
	
	
String[] strArr3 = str.split(" ", 0);
	
	for(String s:strArr3)
	{
	System.out.println(s);
	}
	
	String abc = "hi@for@oyu";
String[] strArr4 = abc.split("@", 3);
	
	for(String s:strArr4)
	{
	System.out.println(s);
	}

}


}
