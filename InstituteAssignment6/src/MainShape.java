import java.util.Scanner;

abstract class Shape {
	abstract protected void area();
}

class Circle extends Shape {
	float r;

	public Circle(float r) {
		this.r = r;
	}

	protected void area() {
		System.out.println("Area of circle" + 3.14 * r * r);
	}

	public static Circle buildCircle() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious of circle");
		float r = sc.nextFloat();
		return new Circle(r);

	}
}

class Cylinder extends Shape {
	float r, h;

	public Cylinder(float r, float h) {
		this.r = r;
		this.h = h;
	}

	protected void area() {
		System.out.println("Area of cylinder" + 2 * 3.14 * r * (r + h));
	}

	public static Cylinder buildCylinder() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious of cylinder");
		float r = sc.nextFloat();
		System.out.println("Enter height of cylinder");
		float h = sc.nextFloat();
		return new Cylinder(r, h);
	}
}

class Square extends Shape {
	float a;

	public Square(float a) {
		this.a = a;
	}

	protected void area() {
		System.out.println("Area of square" + a * a);
	}

	public static Square buildSquare() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of sqare");
		float a = sc.nextFloat();
		return new Square(a);
	}
}

class Rectangle extends Shape {
	float w, h;

	private Rectangle(float w, float h) {
		this.w = w;
		this.h = h;
	}

	protected void area() {
		System.out.println("Area of rectangle" + w * h);
	}

	public static Rectangle buildRectangle() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of rectangle");
		float w = sc.nextFloat();
		System.out.println("Enter the height of rectangle");
		float h = sc.nextFloat();
		return new Rectangle(w, h);
	}

}

public class MainShape {
	public static void main(String args[]) {

		Shape[] shape = new Shape[10];
		shape[0] = Circle.buildCircle();
		shape[1] = Cylinder.buildCylinder();
		shape[2] = Square.buildSquare();
        shape[3] = Rectangle.buildRectangle();
        shape[4] = Circle.buildCircle();
		shape[5] = Cylinder.buildCylinder();
		shape[6] = Square.buildSquare();
		shape[7] = Rectangle.buildRectangle();
		shape[8] = Cylinder.buildCylinder();
		shape[9] = Square.buildSquare();
		for (int i = 0; i < 10; i++) {
			shape[i].area();
		}

	}

}