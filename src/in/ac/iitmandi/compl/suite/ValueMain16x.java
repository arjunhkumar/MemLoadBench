/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.ValueLine16x;
import in.ac.iitmandi.compl.ds.ValuePoint16x;

/**
 * @author arjun
 *
 */
public class ValueMain16x extends SuperMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		ValueMain16x mainObj = new ValueMain16x();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public ValueLine16x createLine() {
		Random randomGenerator = new Random();
		return new ValueLine16x(createVPoint64(randomGenerator),createVPoint64(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private ValuePoint16x createVPoint64(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePoint16x(x, y);
	}
	

}
