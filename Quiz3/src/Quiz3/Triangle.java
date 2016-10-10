package Quiz3;

public class Triangle extends GeometricObject {

	/** Three double data fields */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	/** no-arg constructor */
	public Triangle() {

	}

	/** Constructor that creates a triangle with the specified sides */
	public Triangle(double side1, double side2, double side3) {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	/** The accessor methods for all data types */
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/** a method to return the perimeter */
	public double getPerimeter() {

		return (side1 + side2 + side3);

	}

	/** A method to return the area */
	public double getArea() {

		double per = getPerimeter() / 2;

		return Math.sqrt(per * ((per - side1) * (per - side2) * (per - side3)));
	}

	/** A method that returns a string description of the triangle */
	public String toString() {
		return " Triangle's: Side 1 is equal to " + side1 + " Side 2 is equal 2 " + side2 + " Side 3 is equal to "
				+ side3 + "/n Area is equal to" + getArea() + "/n perimeter is equal to" + getPerimeter();

	}

}
