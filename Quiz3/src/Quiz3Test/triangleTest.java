package Quiz3Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Quiz3.Triangle;
import Quiz3.TriangleException;

public class triangleTest {

	public triangleTest() {

	}

	/** a method to test whether it is an imaginary triangle */
	@Test(expected = TriangleException.class)
	public void ImaginaryTriagle() throws TriangleException {
		Triangle tri = new Triangle(100, 10000, 2);
	}

	/** This tests the perimeter of the test triangles */
	@Test
	public void getPerimeter() throws TriangleException {
		Triangle triangle = new Triangle(10, 11, 10);
		double expected = 31;
		double answer = triangle.getPerimeter();
		assertEquals(answer, expected, .01);

	}

	/** This tests the area of the test triangles */
	@Test
	public void getArea() throws TriangleException {
		Triangle triangle = new Triangle(10, 11, 10);
		double expected = 45.93;
		double answer = triangle.getArea();
		assertEquals(answer, expected, .01);

	}
}