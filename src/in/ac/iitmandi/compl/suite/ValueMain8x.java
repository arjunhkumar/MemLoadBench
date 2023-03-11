/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.ValueLine2x;
import in.ac.iitmandi.compl.ds.ValueLine4x;
import in.ac.iitmandi.compl.ds.ValuePoint2x;
import in.ac.iitmandi.compl.ds.ValuePoint4x;

/**
 * @author arjun
 *
 */
public class ValueMain8x extends SuperMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		ValueMain8x mainObj = new ValueMain8x();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public ValueLine4x createLine() {
		Random randomGenerator = new Random();
		return new ValueLine4x(createVPoint(randomGenerator),createVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private ValuePoint4x createVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePoint4x(x, y);
	}
	

}
