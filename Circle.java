package ecomHomeWork041221;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double printSize() {
		return radius*radius*Math.PI;
	}
	
	public void actualSize() {
		System.out.println("calculate the area of the circle: "+ radius*radius*Math.PI);
	}

}
