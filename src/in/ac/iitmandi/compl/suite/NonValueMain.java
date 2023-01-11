/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.Random;

import in.ac.iitmandi.compl.ds.NonValueLine;
import in.ac.iitmandi.compl.ds.NonValuePoint;
import in.ac.iitmandi.compl.ds.ValueLine;
import in.ac.iitmandi.compl.ds.ValuePoint;
import in.ac.iitmandi.compl.suite.experiments.ScalingExperiment;

/**
 * @author arjun
 *
 */
public class NonValueMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		intializeDataPoints();
		runExperiments();
	}

	private static void runExperiments() {
		ScalingExperiment exp = new ScalingExperiment();
		exp.runExpt(false);
	}

	private static void intializeDataPoints() {
		for(int i=0;i<4000000;i++) {
			GlobalStorage.addToValList(createNVLine());
		}
	}

	private static NonValueLine createNVLine() {
		Random randomGenerator = new Random();
		return new NonValueLine(createNVPoint(randomGenerator),createNVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private static NonValuePoint createNVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new NonValuePoint(x, y);
	}

}
