
import java.util.*;
public class my2ndcode {

	public static void main(String[] args) {
		System.out.println("This is the start of the oop");
		
		//crating the instance 
		
//		car myCar = new car();
		
		//under the car class with its blue print i can create multiple instances
		
//		car my2ndcar = new car();
//		
//		System.out.println(myCar.name);
//		System.out.println(myCar.company);
//		System.out.println(myCar.price);
//		
//		myCar.drive();
//		myCar.brek();
//		
//		System.out.println("Below This is the Stuff for the 2nd instances ");
//		
//
//		System.out.println(my2ndcar.name);
//		System.out.println(my2ndcar.company);
//		System.out.println(my2ndcar.price);
//		
//		my2ndcar.drive();
//		my2ndcar.brek();
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter your name :");
//		
//		String name = scanner.nextLine();
//		
//		System.out.println("Welcome "+ name );
//		
//		
		
		//Here we will be trying out constructor the constructor must have the same name as the class
		
//		Human human = new Human("Tuhin","Front-End-Developer",21);
//		
//		Human human2 = new Human("badar","Front-End-Developer",21);
//		
//		System.out.println("Hello "+human.name);
//		System.out.println("You are currently working as a : "+human.job);
//		System.out.println("Your are : "+human.age+" years old");
//		
//		
//		System.out.println("Hello "+human2.name);
//		System.out.println("You are currently working as a : "+human2.job);
//		System.out.println("Your are : "+human2.age+" years old");
//		
//		human.drink();
		//so constructors allow us to manipulate the class and use its dynamically
		
//		car myCar = new car();
		
//		System.out.println(myCar.toString());//This is the explicit way of printing by overwriting the function in the class
//		
//		System.out.println(myCar);
		//in this case it is using the function on its own 
		
		//for creating the array of objects we can simply create a array with the same name name as the class as its data type then just follow the normal procedure
//		
//		Human[] collectionOfHumans = new Human[3];
//		
//		Human human1 = new Human("Rick","police",35);
//		Human human2 = new Human("Rose","prostitute",25);
//		
//		Human human3 = new Human("Xavi","SlaveTrader",65);
//		
//		collectionOfHumans[0]=human1;
//		collectionOfHumans[1]=human2;
//		collectionOfHumans[2]=human3;
//		
//		System.out.println(collectionOfHumans[1]);
		
		//Inheritance in this case a class can have all the methods and the attributes of a another class and for this we are using extends then the predecessor of that class that will inherit the properties
		
//		
//		pop1 pop = new pop1();
//		
//		System.out.println(pop.company);
//		
		//now this new pop has all the attributes of its predecessor and now we can also add unique attributes of its own in the class
		
		
		//now will be looking into method overriding
		
		
		//here basically the method that is being  passed as an inheritance to the class of a designated requirement we can modify that method in that class 
		
//		pop1 pop = new pop1();
//		
//		pop.bow();
		//so in this example we overwritten the method that was passed down as inheritance in the pop1 class
		
		
		
		//super keyword in java (used to create super hero objects)
		
		//it basically means the parent class of an object
		
//		Hero hero1 = new Hero("Batman",35,"$$$$");
//		
//		System.out.println(hero1.power);
//		
//		Hero hero2 = new Hero("Superman",45,"Everything");
//		
//		System.out.println(hero2.toString());		
		
		
		
		//abstract keyword in java
		
		//this allows us to stop using a class its will not allow the instantiate the class if its too abstract or plain
		//for example you want a car so you will go and ask for a car with a specific model not going to buy a car that is simple just a transport
		
		//so if we use the keyword abstract we can't create a class 
		
//		Vechicle vehicle = new Vehicle();
		
		//here we have created a instance called vehicle
		
		//but if we use the abstract we can't create it
		
		//Cartop car1 = new Cartop();
		
		//so both car is the child of vehicle so it doesn't make any sense 
		
		//so we will not let the option of creating a instance with the vehicle 
		//Vechicle vehicle = new Vehicle();//now its not possible 
		
		//abstract can also be used for method for example if we use a abstract in the abstract class we won't be able to use the body in that class
		
		//but we can use it in the other class and then override it 
		
		//now
		//car1.go();//this will now work
		
		//Access modifiers in java
		
		//(they are public ,protected,protected ,and the default is none)
		
		
		
		//for this we need to create packages in the project file 
		
		//they are basically a collection of classes
		
		
		//encapsulation
		//its a method of hiding or private the attributes of a class 
		//and can only be accessed by special method getter and setter method
//		
//		Car2 car =new Car2("Tesla","Elon",20000);
//		
//		System.out.println(car.getmodel());
//		System.out.println(car.getmake());
//		System.out.println(car.getprice());
		
		//now if we want to update the value of this car 
//		car.setmake("tuhin");
//		car.setprice(2000000000);
//		
//		//after the update
//		System.out.println(car.getmake());
//		System.out.println(car.getprice());
		
		
		//interface it can be applied to a class
		//similar to inheritance but specifies what a class has and can do 
		
		//a single class can have multiple interfaces but a inheritance can only have one super class
		
		//in interface we can use variable as normal and use method and we don't have to use the body for the methods
		
//		rabit rabit1 = new rabit();
//		rabit1.flee();
//		hawk hawk1 = new hawk();
//		hawk1.hunt();
//		
//		fish fish1 = new fish();
//		fish1.flee();
//		fish1.hunt();
//		
		
		//polymorphism its a greek work poly - many morph - form 
		
		//so basically its the ability of an object to identify as more then one type
		
//		
//		bus bus1 = new bus();
//		bycicle bycicle1 = new bycicle();
//		boat boat1 = new boat();
//		
//		Vehicle2[] racers = {bus1,bycicle1,boat1};
		//here we can't store all the object because each one is unique but they all are under the same superclass called Vehicle2 
		//so this is a example of polymorphism the array type can be Vehicle2 []
//		
//		bus1.go();
//		bycicle1.go();
//		boat1.go();
//		
		//thers a better way of doing this thing 
		
		//using an enhanced for loop
		
//		for(Vehicle2 x : racers) {
//			
//			x.go();
//		}
		
		
		//Dynamic polymorhism
		
		//its the ability of an object to take many shapes and form during the run time 
		
		Scanner scanner = new Scanner(System.in);
		Animal animal ;
		
		System.out.println("What animal do you want ?");
		System.out.println("1 = DOG and 2 = Cat");
		
		int choice = scanner.nextInt();
		
		if(choice==1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice == 2)
		{
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("You have selected the wrong key !!");
			animal.speak();
		}
		
		
		scanner.close();
		
	}

}
