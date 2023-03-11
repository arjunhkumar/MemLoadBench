/**
 * 
 */
package in.ac.iitmandi.compl.suite.experiments;

import java.util.ArrayList;
import java.util.List;

import in.ac.iitmandi.compl.ds.AbstractLine;
import in.ac.iitmandi.compl.ds.NonValueLine;
import in.ac.iitmandi.compl.ds.NonValueLine64;
import in.ac.iitmandi.compl.ds.ValueLine;
import in.ac.iitmandi.compl.ds.ValueLine2x;
import in.ac.iitmandi.compl.ds.ValueLine4x;
import in.ac.iitmandi.compl.ds.ValueLine16x;
import in.ac.iitmandi.compl.ds.ValueLine8x;
import in.ac.iitmandi.compl.ds.ValueLine3x;
import in.ac.iitmandi.compl.suite.GlobalStorage;

/**
 * @author arjun
 *
 */
public class ScalingExperiment {

	
	List<AbstractLine> scaledLines;
	
	public void runExpt() {
		int scale = 1;
		List<AbstractLine> lines = GlobalStorage.getInstance().getLineList();
		for(AbstractLine line: lines) {
			scale = scaleLine(scale, line);
		}
		System.out.println("Size: "+lines.size());
		System.out.println("Expt completed. Result: "+lines.hashCode());
	}
	
	public double runExptWB() {
		int scale = 1;
		List<AbstractLine> lines = GlobalStorage.getInstance().getLineList();
		for(AbstractLine line: lines) {
			scale = scaleLine(scale, line);
		}
		return scaledLines.hashCode();
	}

	public void addToScaledLines(AbstractLine line) {
		if(null == scaledLines) {
			scaledLines = new ArrayList<>();
		}
		scaledLines.add(line);
	}
	
	
	/**
	 * @param scale
	 * @param line
	 * @return
	 */
	private int scaleLine(int scale, AbstractLine line) {
		addToScaledLines(line.scaleLine(scale));
		return scale;
//		if(line instanceof ValueLine) {
//			ValueLine vLine = (ValueLine) line;
//			addToScaledLines(vLine.scaleLine(scale));
//			scale = vLine.getS().getX() + vLine.getE().getY();
//		}else if(line instanceof ValueLine64) {
//			ValueLine64 vLine = (ValueLine64) line;
//			addToScaledLines(vLine.scaleLine(scale));
//			scale = Double.valueOf((vLine.getS().getX() + vLine.getE().getY())).intValue();
//		}else if(line instanceof NonValueLine) {
//			NonValueLine nvline = (NonValueLine) line;
//			addToScaledLines(nvline.scaleLine(scale));
//			scale = nvline.getS().getX() + nvline.getE().getY();
//		}else if(line instanceof NonValueLine64) {
//			NonValueLine64 nvline = (NonValueLine64) line;
//			addToScaledLines(nvline.scaleLine(scale));
//			scale = Double.valueOf((nvline.getS().getX() + nvline.getE().getY())).intValue();
//		}else if(line instanceof ValueLineMeduim) {
//			ValueLineMeduim vLine = (ValueLineMeduim) line;
//			addToScaledLines(vLine.scaleLine(scale));
//			scale = Double.valueOf((vLine.getS().getX() + vLine.getE().getY())).intValue();
//		}else if(line instanceof ValueLine2x) {
//			ValueLine2x vLine = (ValueLine2x) line;
//			addToScaledLines(vLine.scaleLine(scale));
//			scale = Double.valueOf((vLine.getS().getX() + vLine.getE().getY())).intValue();
//		}else if(line instanceof ValueLine4x) {
//			ValueLine4x vLine = (ValueLine4x) line;
//			addToScaledLines(vLine.scaleLine(scale));
//			scale = Double.valueOf((vLine.getS().getX() + vLine.getE().getY())).intValue();
//		}else if(line instanceof ValueLine8x) {
//			ValueLine8x vLine = (ValueLine8x) line;
//			addToScaledLines(vLine.scaleLine(scale));
//			scale = Double.valueOf((vLine.getS().getX() + vLine.getE().getY())).intValue();
//		}else {
//			System.out.println("Error: Invalid Type. No scaling done");
//		}
	}
	
//	public void runExpt64(boolean isVal) {
//		int scale = 1;
//		if(isVal) {
//			List<ValueLine64> lines = GlobalStorage.getInstance().getValLine64List();
//			for(AbstractLine line: lines) {
//					scale = scaleValueLine(scale, line);
//			}
//			System.out.println("Size: "+lines.size());
//			System.out.println("Expt completed. Result: "+lines.hashCode());
//		}else {
//			List<NonValueLine64> lines = GlobalStorage.getInstance().getnValLine64List();
//			for(AbstractLine line: lines) {
//				scale = scaleNonValueLine(scale, line);
//			}
//			System.out.println("Size: "+lines.size());
//			System.out.println("Expt completed. Result: "+lines.hashCode());
//		}
		
		
//	/**
//	 * @param scale
//	 * @param line
//	 * @return
//	 */
//	private int scaleNonValueLine(int scale, AbstractLine line) {
//		if(line instanceof NonValueLine) {
//			NonValueLine nvLine = (NonValueLine) line;
//			addToScaledNonValueLines(nvLine.scaleLine(scale));
//			scale = nvLine.getS().getX() + nvLine.getE().getY();
//		}else if(line instanceof NonValueLine64) {
//			NonValueLine64 nvLine = (NonValueLine64) line;
//			addToScaledNonValueLines64(nvLine.scaleLine(scale));
//			scale = Double.valueOf(nvLine.getS().getX() + nvLine.getE().getY()).intValue();
//		}
//		return scale;
//	}
//
//	
//	public void addToScaledValueLines(ValueLine line) {
//		if(null == scaledVLines) {
//			scaledVLines = new ArrayList<>();
//		}
//		scaledVLines.add(line);
//	}
	
	
//	public void addToScaledValueLines64(ValueLine64 line) {
//		if(null == scaledVLines64) {
//			scaledVLines64 = new ArrayList<>();
//		}
//		scaledVLines64.add(line);
//	}
//	
//	public void addToScaledNonValueLines(NonValueLine line) {
//		if(null == scaledNVLines) {
//			scaledNVLines = new ArrayList<>();
//		}
//		scaledNVLines.add(line);
//	}
//	
//	public void addToScaledNonValueLines64(NonValueLine64 line) {
//		if(null == scaledNVLines64) {
//			scaledNVLines64 = new ArrayList<>();
//		}
//		scaledNVLines64.add(line);
//	}
}
