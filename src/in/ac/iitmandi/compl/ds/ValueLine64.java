/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class ValueLine64 extends AbstractLine {

	private ValuePoint64 s;
	private ValuePoint64 e;
	
	/**
	 * @param s
	 * @param e
	 */
	public ValueLine64(ValuePoint64 s, ValuePoint64 e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public ValuePoint64 getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(ValuePoint64 s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public ValuePoint64 getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(ValuePoint64 e) {
		this.e = e;
	}
	
	public ValueLine64 scaleLine(int scale) {
		ValuePoint64 p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		ValuePoint64 p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
//		System.out.println("SL");
		return new ValueLine64(p1, p2);
	}
	
	private ValuePoint64 createPoint(double x, double y, int scale) {
		return new ValuePoint64(x+scale,y+scale);
	}
	
	
}
