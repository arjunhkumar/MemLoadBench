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
public class ValueMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		intializeDataPoints();
		runExperiments();
	}

	private static void runExperiments() {
		ScalingExperiment exp = new ScalingExperiment();
		exp.runExpt(true);
	}

	private static void intializeDataPoints() {
		for(int i=0;i<8000000;i++) {
			GlobalStorage.addToValList(createVLine());
		}
	}

	private static ValueLine createVLine() {
		Random randomGenerator = new Random();
		return new ValueLine(createVPoint(randomGenerator),createVPoint(randomGenerator));
	}

	/**
	 * @param randomGenerator
	 * @return 
	 */
	private static ValuePoint createVPoint(Random randomGenerator) {
		int x = randomGenerator.nextInt();
		int y = randomGenerator.nextInt();
		return new ValuePoint(x, y);
	}
	

}
