
class Circle {

	double radius = 1;

	Circle() {
	}

	Circle(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}
}

public class CircleMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(1);
		System.out.println("The area of circle c1= " + c1.getArea());
		System.out.println("The Perimeter of circle c1= " + c1.getPerimeter());

		Circle c2 = new Circle();
		c2.setRadius(1.25);
		System.out.println("The area of circle c2= " + c2.getArea());
		System.out.println("The Perimeter of circle c2= " + c2.getPerimeter());

		Circle c3 = new Circle();
		c3.setRadius(3);
		System.out.println("The area of circle c3= " + c3.getArea());
		System.out.println("The Perimeter of circle c3= " + c3.getPerimeter());
	}
}
