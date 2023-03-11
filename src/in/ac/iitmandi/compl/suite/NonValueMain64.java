/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.NonValueLine64;
import in.ac.iitmandi.compl.ds.NonValuePoint64;

/**
 * @author arjun
 *
 */
public class NonValueMain64 extends SuperMainClass{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GlobalStorage.setIterVal(args);
		NonValueMain64 mainObj = new NonValueMain64();
		mainObj.intializeDataPoints();
		mainObj.runExperiments();
	}

	public NonValueLine64 createLine() {
		Random randomGenerator = new Random();
		return new NonValueLine64(createNVPoint64(randomGenerator),createNVPoint64(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private NonValuePoint64 createNVPoint64(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new NonValuePoint64(x, y);
	}

}
