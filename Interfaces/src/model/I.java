package model;

public interface I {
//JAVA 7
	 static final String MSG = "Hello";
	 abstract void monContrat();
	
	//JAVA 8
	//Methode default que les class ne sont pas oblige dimplemente
	default void sayHello() {
		System.out.println("hello");
		getMessage();//appel de la methode private dans default methode java 8
	}
	
	//Methode static
	public static int cal(int a) {
		organize();//appel de methode prive dans une methode static java 9
		return a*2;
	}
	
	//JAVA 9
	//Methode privé dans les interface
	private String getMessage() {
		return "hi";
	}
	
	private static void organize() {
		System.out.println("hello ");
	}
}
