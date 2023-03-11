/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class ValueLine4x extends AbstractLine {

	private ValuePoint4x s;
	private ValuePoint4x e;
	
	/**
	 * @param s
	 * @param e
	 */
	public ValueLine4x(ValuePoint4x s, ValuePoint4x e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public ValuePoint4x getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(ValuePoint4x s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public ValuePoint4x getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(ValuePoint4x e) {
		this.e = e;
	}
	
	public ValueLine4x scaleLine(int scale) {
		ValuePoint4x p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		ValuePoint4x p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
		return new ValueLine4x(p1, p2);
	}
	
	private ValuePoint4x createPoint(double x, double y, int scale) {
		return new ValuePoint4x(x+scale,y+scale);
	}
	
	
}
