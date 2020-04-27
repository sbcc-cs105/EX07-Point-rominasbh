package unittest.cs105;

import static org.junit.Assert.assertEquals;

import edu.sbcc.cs105.Point;
import org.junit.*;

public class PointTester {
	private static final int maximumScore = 20;
	private static final int maximumAssignmentScore = 25;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your unit test score is %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void testTranslateX() {
		Point p = new Point(1, 2);
		p.translateX(1.0);
		assertEquals(2.0, p.getX(), 0.0000001);
		assertEquals(2.0, p.getY(), 0.0000001);
		totalScore += 2;
	}

	@Test
	public void testTranslateY() {
		Point p = new Point(1, 2);
		p.translateY(2.0);
		assertEquals(1.0, p.getX(), 0.0000001);
		assertEquals(4.0, p.getY(), 0.0000001);
		totalScore += 2;
	}

	@Test
	public void testTranslateXY() {
		Point p = new Point(1, 2);
		p.translate(1.0, 2.0);
		assertEquals(2.0, p.getX(), 0.0000001);
		assertEquals(4.0, p.getY(), 0.0000001);
		totalScore += 2;
	}

	@Test
	public void testScaleX() {
		Point p = new Point(1, 2);
		p.scaleX(2.0);
		assertEquals(2.0, p.getX(), 0.0000001);
		assertEquals(2.0, p.getY(), 0.0000001);
		totalScore += 2;
	}

	@Test
	public void testScaleY() {
		Point p = new Point(1, 2);
		p.scaleY(2.0);
		assertEquals(1.0, p.getX(), 0.0000001);
		assertEquals(4.0, p.getY(), 0.0000001);
		totalScore += 2;
	}

	@Test
	public void testScaleXY() {
		Point p = new Point(1, 2);
		p.scale(3.0, 3.0);
		assertEquals(3.0, p.getX(), 0.0000001);
		assertEquals(6.0, p.getY(), 0.0000001);
		totalScore += 2;
	}

	@Test
	public void testDistanceUnit() {
		Point p = new Point(1, 1);
		Point origin = new Point();
		assertEquals(Math.sqrt(2), p.distance(origin), 0.0000001);
		totalScore += 4;
	}

	@Test
	public void testDistancePerfectSquares() {
		Point p = new Point(3, 4);
		Point origin = new Point();
		assertEquals(5.0, p.distance(origin), 0.0000001);
		totalScore += 4;
	}

}
