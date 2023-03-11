/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.NonValueLine;
import in.ac.iitmandi.compl.ds.NonValuePoint;

/**
 * @author arjun
 *
 */
public class NonValueMain extends SuperMainClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		NonValueMain mainObj = new NonValueMain();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public NonValueLine createLine() {
		Random randomGenerator = new Random();
		return new NonValueLine(createNVPoint(randomGenerator),createNVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private NonValuePoint createNVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new NonValuePoint(x, y);
	}

}
