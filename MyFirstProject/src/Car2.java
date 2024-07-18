
public class Car2 {

	private String make;
	private String model;
	private int price;
	
	Car2(String make,String model,int price){
//		this.make=make;
//		this.model=model;
//		this.price=price;
		//we can now do this insted of this 
		
		this.setmake(make);
		this.setmodel(model);
		this.setprice(price);
	}
	
	//we need to use the getter method to send these private variables
	
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
	public int getprice() {
		return price;
	}
	
	//this is used to change or update the private variable from the inste3nce of that class
	public void setmake(String make) {
		this.make=make;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public void setprice(int price) {
		this.price=price;
	}
	
}
