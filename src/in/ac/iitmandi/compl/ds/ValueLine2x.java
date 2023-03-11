/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class ValueLine2x extends AbstractLine {

	private ValuePoint2x s;
	private ValuePoint2x e;
	
	/**
	 * @param s
	 * @param e
	 */
	public ValueLine2x(ValuePoint2x s, ValuePoint2x e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public ValuePoint2x getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(ValuePoint2x s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public ValuePoint2x getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(ValuePoint2x e) {
		this.e = e;
	}
	
	public ValueLine2x scaleLine(int scale) {
		ValuePoint2x p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		ValuePoint2x p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
		return new ValueLine2x(p1, p2);
	}
	
	private ValuePoint2x createPoint(double x, double y, int scale) {
		return new ValuePoint2x(x+scale,y+scale);
	}
	
	
}
