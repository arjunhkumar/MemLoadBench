/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import in.ac.iitmandi.compl.ds.AbstractLine;
import in.ac.iitmandi.compl.suite.experiments.ScalingExperiment;

/**
 * @author arjun
 *
 */
public abstract class SuperMainClass {

	protected abstract AbstractLine createLine();
	
	protected void intializeDataPoints() {
		GlobalStorage.createNewLineList();
		for(int i=0;i<GlobalStorage.ITERSIZE;i++) {
			GlobalStorage.addToLineList(this.createLine());
		}
	}

	protected void runExperiments() {
		ScalingExperiment exp = new ScalingExperiment();
		exp.runExpt();
	}

}
