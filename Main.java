package ecomHomeWork041221;

// 1.	When a class constructor gets called?
//when new obj created--> new,to initialize the variables
// 2.	If you create 5 objects of a class, then how many time constructors will be called?
// 5-times

// 3.	When you write a constructor, what return type do you write in constructor declaration?
//   constructor don't have return type

// 4.	Why do you use constructor?
// create new object of the class
//to initializes the newly created object before it is used

public class Main {

	public static void main(String[] args) {
// 5		
		Car car=new Car();
		String name=car.getBrand();
		System.out.println("brand of the Car is "+name);
// 6		
		Circle c=new Circle(5);
		System.out.println("calculate the area of the circle:" +c.printSize());
		c.actualSize();
		
		Circle c1=new Circle(5.4);
		System.out.println("calculate the area of the circle:" +c1.printSize());
		c1.actualSize();
		
		Circle c2=new Circle(8.7);
		System.out.println("calculate the area of the circle:" +c2.printSize());
		c2.actualSize();
		

	}

}
