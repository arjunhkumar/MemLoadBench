/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.ValueLine2x;
import in.ac.iitmandi.compl.ds.ValuePoint2x;

/**
 * @author arjun
 *
 */
public class ValueMain2x extends SuperMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		ValueMain2x mainObj = new ValueMain2x();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public ValueLine2x createLine() {
		Random randomGenerator = new Random();
		return new ValueLine2x(createVPoint(randomGenerator),createVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private ValuePoint2x createVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePoint2x(x, y);
	}
	

}
