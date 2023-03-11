/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.ValueLine3x;
import in.ac.iitmandi.compl.ds.ValuePoint3x;

/**
 * @author arjun
 *
 */
public class ValueMain3x extends SuperMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		ValueMain3x mainObj = new ValueMain3x();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public ValueLine3x createLine() {
		Random randomGenerator = new Random();
		return new ValueLine3x(createVPoint(randomGenerator),createVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private ValuePoint3x createVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePoint3x(x, y);
	}
	

}
