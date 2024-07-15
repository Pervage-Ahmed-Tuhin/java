package package2;

import package1.*;

public class Asub extends A {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		C c = new C();
//		System.out.println(c.defaultMEssage);//here we can use it
//	}
	
	
	//for showing protected class
	
	public static void main(String[] args) {
	 
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage);
	//here the protected message can be read because of the fact that asub is a subclass of a 
		
	}

}
