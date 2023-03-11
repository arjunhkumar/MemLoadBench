/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.ValueLineMeduim;
import in.ac.iitmandi.compl.ds.ValuePointMeduim;

/**
 * @author arjun
 *
 */
public class ValueMainMeduim extends SuperMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		ValueMainMeduim mainObj = new ValueMainMeduim();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public ValueLineMeduim createLine() {
		Random randomGenerator = new Random();
		return new ValueLineMeduim(createVPoint(randomGenerator),createVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private ValuePointMeduim createVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePointMeduim(x, y);
	}
	

}
