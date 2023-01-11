/**
 * 
 */
package in.ac.iitmandi.compl.suite.experiments;

import java.util.ArrayList;
import java.util.List;

import in.ac.iitmandi.compl.ds.AbstractLine;
import in.ac.iitmandi.compl.ds.NonValueLine;
import in.ac.iitmandi.compl.ds.ValueLine;
import in.ac.iitmandi.compl.suite.GlobalStorage;

/**
 * @author arjun
 *
 */
public class ScalingExperiment {

	List<ValueLine> scaledVLines;
	List<NonValueLine> scaledNVLines;
	
	public void runExpt(boolean isVal) {
		int scale = 1;
		if(isVal) {
			List<ValueLine> lines = GlobalStorage.getInstance().getValLineList();
			for(AbstractLine line: lines) {
					scale = scaleValueLine(scale, line);
			}
			System.out.println("Expt completed. Result: "+lines.hashCode());
		}else {
			List<NonValueLine> lines = GlobalStorage.getInstance().getnValLineList();
			for(AbstractLine line: lines) {
				scale = scaleNonValueLine(scale, line);
			}
			System.out.println("Expt completed. Result: "+lines.hashCode());
		}
		
		
	}

	/**
	 * @param scale
	 * @param line
	 * @return
	 */
	private int scaleNonValueLine(int scale, AbstractLine line) {
		NonValueLine nvLine = (NonValueLine) line;
		addToScaledNonValueLines(nvLine.scaleLine(scale));
		scale = nvLine.getS().getX() + nvLine.getE().getY();
		return scale;
	}

	/**
	 * @param scale
	 * @param line
	 * @return
	 */
	private int scaleValueLine(int scale, AbstractLine line) {
		ValueLine vLine = (ValueLine) line;
		addToScaledValueLines(vLine.scaleLine(scale));
		scale = vLine.getS().getX() + vLine.getE().getY();
		return scale;
	}
	
	public void addToScaledValueLines(ValueLine line) {
		if(null == scaledVLines) {
			scaledVLines = new ArrayList<>();
		}
		scaledVLines.add(line);
	}
	
	public void addToScaledNonValueLines(NonValueLine line) {
		if(null == scaledNVLines) {
			scaledNVLines = new ArrayList<>();
		}
		scaledNVLines.add(line);
	}
	
}
