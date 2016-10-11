package Quiz3;

public class TriangleException extends Exception {

	private Triangle triangle;

	/** This is where the exception is thrown if its an imaginary triangle */
	public TriangleException(Triangle triangle) {

		super();

	}

	public Triangle getTriangle() {
		return triangle;
	}
}
