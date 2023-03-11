/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class NonValuePoint64 {

	private final double x1;
	private final double x2;
	private final double x3;
	private final double x4;
	private final double y1;
	private final double y2;
	private final double y3;
	private final double y4;
	
	public NonValuePoint64() {
		this.x1 = 0;
		this.y1= 0;
		this.x2 = 0;
		this.y2= 0;
		this.x3 = 0;
		this.y3= 0;
		this.x4 = 0;
		this.y4= 0;
	}

	public NonValuePoint64(int x, int y) {
		this.x1 = x;
		this.y2 = y;
		this.y1= 0;
		this.x2 = 0;
		this.x3 = 0;
		this.y3= 0;
		this.x4 = 0;
		this.y4= 0;
	}
	
	public NonValuePoint64(double x, double y) {
		this.x1 = x;
		this.y2 = y;
		this.y1= 1d;
		this.x2 = 1d;
		this.x3 = 1d;
		this.y3= 1d;
		this.x4 = 1d;
		this.y4= 1d;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x1;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y1;
	}

	/**
	 * @return the x1
	 */
	public double getX1() {
		return x1;
	}

	/**
	 * @return the x2
	 */
	public double getX2() {
		return x2;
	}

	/**
	 * @return the x3
	 */
	public double getX3() {
		return x3;
	}

	/**
	 * @return the x4
	 */
	public double getX4() {
		return x4;
	}

	/**
	 * @return the y1
	 */
	public double getY1() {
		return y1;
	}

	/**
	 * @return the y2
	 */
	public double getY2() {
		return y2;
	}

	/**
	 * @return the y3
	 */
	public double getY3() {
		return y3;
	}

	/**
	 * @return the y4
	 */
	public double getY4() {
		return y4;
	}
	
}
