
public class fish implements prey,preditor {

	@Override
	public void hunt() {
		
		System.out.println("This fish is hunting smaller fish");
	}

	@Override
	public void flee() {
		System.out.println("This fish is fleeing from a larger fish");
		
	}
//a single class can have multiple interfaces 
	
}
