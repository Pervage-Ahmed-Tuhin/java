package package2;
import package1.*;
public class C {

	String defaultMEssage = "This is me";
	//if we crate this instance of c in a another package and then this default message won't be visible to that package but the same package class will be able to access it
	
	public String publicMessage = "This message is public";
//this will work fine because it's in public format
	
//	protected String protectedMessage = "This is a protected message";
//	//this protected message can be accessed as long as that class is a subclass of that class that is holding the protected class
	
}
