/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public primitive class ValuePoint2x {

	private final double x;
	private final double y;
	private final double x1;
	private final double y1;
	
	public ValuePoint2x() {
		this.x = 0;
		this.y = 0;
		this.x1 = 4d;
		this.y1 = 8d;
	}

	public ValuePoint2x(double x, double y) {
		this.x = x;
		this.y = y;
		this.x1 = 4d;
		this.y1 = 8d;
	}

	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @return the x1
	 */
	public double getX1() {
		return x1;
	}

	/**
	 * @return the y1
	 */
	public double getY1() {
		return y1;
	}
	
	
	
}
