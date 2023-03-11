/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.ValueLine;
import in.ac.iitmandi.compl.ds.ValuePoint;

/**
 * @author arjun
 *
 */
public class ValueMain extends SuperMainClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		ValueMain mainObj = new ValueMain();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public ValueLine createLine() {
		Random randomGenerator = new Random();
		return new ValueLine(createVPoint(randomGenerator),createVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private ValuePoint createVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePoint(x, y);
	}
	

}
