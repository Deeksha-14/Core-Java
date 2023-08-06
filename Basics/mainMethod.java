package staticConcep;

public class mainCon {

	private static void main(String[] args) {
		
		int x = 10;
		System.out.println(x);
		//no compile time error but
		//Without the public modifier, the JVM (Java Virtual Machine) won't be able to find and execute the main method.
    //it will run successfully without error but it can not be taken as entry point of the application. It will run if it is invoked from somewhere else.







//		  package test;
//		  public class PrivateMain {
//		  protected  static void main( String [] args ) 
//		  {
//		          System.out.println( "Hello, I'm proctected and I'm running");
//		  }
//		  }
//		  
//		  class PublicMain {
//		  public static void main( String [] args ) {
//		  PrivateMain.main( args );
//		      }
//		  }
//		  $javac -d . PrivateMain.java  
//		  $java test.PrivateMain
//		  Main method not public.
//		  $java test.PublicMain
//		  Hello, I'm proctected and I'm running
//	





    

  
	}

}
