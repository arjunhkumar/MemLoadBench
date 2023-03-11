/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class ValueLine16x extends AbstractLine {

	private ValuePoint16x s;
	private ValuePoint16x e;
	
	/**
	 * @param s
	 * @param e
	 */
	public ValueLine16x(ValuePoint16x s, ValuePoint16x e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public ValuePoint16x getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(ValuePoint16x s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public ValuePoint16x getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(ValuePoint16x e) {
		this.e = e;
	}
	
	public ValueLine16x scaleLine(int scale) {
		ValuePoint16x p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		ValuePoint16x p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
		return new ValueLine16x(p1, p2);
	}
	
	private ValuePoint16x createPoint(double x, double y, int scale) {
		return new ValuePoint16x(x+scale,y+scale);
	}
	
	
}
