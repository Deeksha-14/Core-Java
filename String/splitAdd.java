import java.util.*;

public class sec{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String ad +: ");
	String str = sc.nextLine();
	
	String[] strArr = str.split("\\+");
	
	for(String s:strArr)
	{
	System.out.println(s);
	}
	
	
	}
	

}
