/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class NonValueLine64 extends AbstractLine {

	private NonValuePoint64 s;
	private NonValuePoint64 e;
	
	/**
	 * @param s
	 * @param e
	 */
	public NonValueLine64(NonValuePoint64 s, NonValuePoint64 e) {
		this.s = s;
		this.e = e;
	}
	/**
	 * @return the s
	 */
	public NonValuePoint64 getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(NonValuePoint64 s) {
		this.s = s;
	}
	/**
	 * @return the e
	 */
	public NonValuePoint64 getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(NonValuePoint64 e) {
		this.e = e;
	}
	public NonValueLine64 scaleLine(int scale) {
		NonValuePoint64 p1 = createPoint(this.getS().getX(),this.getS().getY(),scale);
		NonValuePoint64 p2 = createPoint(this.getE().getX(),this.getE().getY(),scale);
//		System.out.println("SLN");
		return new NonValueLine64(p1, p2);
	}

	private NonValuePoint64 createPoint(double x, double y, int scale) {
		return new NonValuePoint64(x+scale,y+scale);
	}
	
}
