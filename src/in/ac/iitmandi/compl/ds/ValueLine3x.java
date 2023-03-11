/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class ValueLine3x extends AbstractLine {

	private ValuePoint3x s;
	private ValuePoint3x e;
	
	/**
	 * @param s
	 * @param e
	 */
	public ValueLine3x(ValuePoint3x s, ValuePoint3x e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public ValuePoint3x getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(ValuePoint3x s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public ValuePoint3x getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(ValuePoint3x e) {
		this.e = e;
	}
	
	public ValueLine3x scaleLine(int scale) {
		ValuePoint3x p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		ValuePoint3x p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
		return new ValueLine3x(p1, p2);
	}
	
	private ValuePoint3x createPoint(double x, double y, int scale) {
		return new ValuePoint3x(x+scale,y+scale);
	}
	
	
}
