/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class ValueLine8x extends AbstractLine {

	private ValuePoint8x s;
	private ValuePoint8x e;
	
	/**
	 * @param s
	 * @param e
	 */
	public ValueLine8x(ValuePoint8x s, ValuePoint8x e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public ValuePoint8x getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(ValuePoint8x s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public ValuePoint8x getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(ValuePoint8x e) {
		this.e = e;
	}
	
	public ValueLine8x scaleLine(int scale) {
		ValuePoint8x p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		ValuePoint8x p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
		return new ValueLine8x(p1, p2);
	}
	
	private ValuePoint8x createPoint(double x, double y, int scale) {
		return new ValuePoint8x(x+scale,y+scale);
	}
	
	
}
