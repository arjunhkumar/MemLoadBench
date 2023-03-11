/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class ValueLineMeduim extends AbstractLine {

	private ValuePointMeduim s;
	private ValuePointMeduim e;
	
	/**
	 * @param s
	 * @param e
	 */
	public ValueLineMeduim(ValuePointMeduim s, ValuePointMeduim e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public ValuePointMeduim getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(ValuePointMeduim s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public ValuePointMeduim getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(ValuePointMeduim e) {
		this.e = e;
	}
	
	public ValueLineMeduim scaleLine(int scale) {
		ValuePointMeduim p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		ValuePointMeduim p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
		return new ValueLineMeduim(p1, p2);
	}
	
	private ValuePointMeduim createPoint(double x, double y, int scale) {
		return new ValuePointMeduim(x+scale,y+scale);
	}
	
	
}
