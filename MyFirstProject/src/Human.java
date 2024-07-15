
public class Human {

	String name ;
	String job;
	int age ;
	
	Human(String name,String job,int age){
		
		this.name=name;
		this.job=job;
		this.age=age;
		
	}
	
	public String toString() {
		
		String MyString = this.name+"\n"+this.job+"\n"+this.age;
		return MyString;
	}
	
	void drink() {
		
		System.out.println(this.name + " is drinking milk");
	}
	
	
}
