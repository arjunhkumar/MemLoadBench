/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.ValueLine64;
import in.ac.iitmandi.compl.ds.ValuePoint64;

/**
 * @author arjun
 *
 */
public class ValueMain64 extends SuperMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		ValueMain64 mainObj = new ValueMain64();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public ValueLine64 createLine() {
		Random randomGenerator = new Random();
		return new ValueLine64(createVPoint64(randomGenerator),createVPoint64(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private ValuePoint64 createVPoint64(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePoint64(x, y);
	}
	

}
