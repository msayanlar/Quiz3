package Quiz3Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Quiz3.Triangle;

public class triangleTest {

	public static Triangle tri1;
	public static Triangle tri2;
	public static Triangle tri3;

	/** These define all the triangles that are being tested */
	@Before
	public void setUpBeforeClass() throws Exception {
		tri1 = new Triangle(0, 4, 4);
		tri2 = new Triangle(5, 7, 10);
		tri3 = new Triangle(6, 8, 10);
	}

	/** This tests the perimeter of the test triangles */
	@Test
	public void testPerimeter() {
		assertTrue(tri1.getPerimeter() == 8);
		assertTrue(tri2.getPerimeter() == 22);
		assertTrue(tri3.getPerimeter() == 24);

	}

	/** This tests the area of the test triangles */
	@Test
	public void testArea() {
		assertTrue(tri1.getArea() == 0);
		assertTrue(tri2.getArea() == 16.248);
		assertTrue(tri3.getArea() == 24);

	}

}
