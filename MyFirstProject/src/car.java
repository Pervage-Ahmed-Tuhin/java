
public class car {

	String name = "Tesla";
	String company = "Elon Tesla";
	int price = 500000;
	
	void drive() {
		System.out.println("You are driving a tesla");
	}
	
	public String toString() {
		
		String MyString = name+"\n"+company+"\n"+price;
		return MyString;
	}
	
	void brek() {
		System.out.println("Please Step on the breakes to stop");
	}
	
	void bow(){
		
		System.out.println("Please bow down to your seniors");
	}
}
