/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.ArrayList;
import java.util.List;

import in.ac.iitmandi.compl.ds.AbstractLine;
import in.ac.iitmandi.compl.ds.NonValueLine;
import in.ac.iitmandi.compl.ds.NonValueLine64;
import in.ac.iitmandi.compl.ds.ValueLine;
import in.ac.iitmandi.compl.ds.ValueLine16x;

/**
 * @author arjun
 *
 */
public class GlobalStorage {
	
	private List<ValueLine> valLineList;
	private List<NonValueLine> nValLineList;
	private List<ValueLine16x> valLine64List;
	private List<NonValueLine64> nValLine64List;
	
	private List<AbstractLine> lineList;
	
	public static int ITERSIZE;
	
	static GlobalStorage instance;
	
	private GlobalStorage() {
	}
	
	public static GlobalStorage getInstance() {
		if(instance == null) {
			instance = new GlobalStorage();
		}
		return instance;
	}
	
	/**
	 * @return the valLineList
	 */
	public List<ValueLine> getValLineList() {
		return valLineList;
	}

	/**
	 * @param valLineList the valLineList to set
	 */
	public void setValLineList(List<ValueLine> valLineList) {
		this.valLineList = valLineList;
	}

	/**
	 * @return the nValLineList
	 */
	public List<NonValueLine> getnValLineList() {
		return nValLineList;
	}

	/**
	 * @param nValLineList the nValLineList to set
	 */
	public void setnValLineList(List<NonValueLine> nValLineList) {
		this.nValLineList = nValLineList;
	}

	/**
	 * @return the valLine64List
	 */
	public List<ValueLine16x> getValLine64List() {
		return valLine64List;
	}

	/**
	 * @param valLine64List the valLine64List to set
	 */
	public void setValLine64List(List<ValueLine16x> valLine64List) {
		this.valLine64List = valLine64List;
	}

	/**
	 * @return the nValLine64List
	 */
	public List<NonValueLine64> getnValLine64List() {
		return nValLine64List;
	}

	/**
	 * @param nValLine64List the nValLine64List to set
	 */
	public void setnValLine64List(List<NonValueLine64> nValLine64List) {
		this.nValLine64List = nValLine64List;
	}

	/**
	 * @param args
	 */
	static void setIterVal(String[] args) {
		if(args.length > 0) {
			String iterSize = args[0];
			int iterVal = Integer.parseInt(iterSize);
			ITERSIZE = iterVal;
		}
	}

	/**
	 * @return the lineList
	 */
	public List<AbstractLine> getLineList() {
		return lineList;
	}

	/**
	 * @param lineList the lineList to set
	 */
	public void setLineList(List<AbstractLine> lineList) {
		this.lineList = lineList;
	}

	public static void addToValList(ValueLine line) {
		List<ValueLine> currentList = getInstance().getValLineList();
		if(currentList == null) {
			currentList = new ArrayList<>();
			getInstance().setValLineList(currentList);
		}
		currentList.add(line);
	}
	
	public static void addToValList(ValueLine16x line) {
		List<ValueLine16x> currentList = getInstance().getValLine64List();
		if(currentList == null) {
			currentList = new ArrayList<>();
			getInstance().setValLine64List(currentList);
		}
		currentList.add(line);
	}
	
	public static void addToValList(NonValueLine line) {
		List<NonValueLine> currentList = getInstance().getnValLineList();
		if(currentList == null) {
			currentList = new ArrayList<>();
			getInstance().setnValLineList(currentList);
		}
		currentList.add(line);
	}
	
	public static void addToValList(NonValueLine64 line) {
		List<NonValueLine64> currentList = getInstance().getnValLine64List();
		if(currentList == null) {
			currentList = new ArrayList<>();
			getInstance().setnValLine64List(currentList);
		}
		currentList.add(line);
	}
	
	public static void createNewLineList() {
		if(getInstance().lineList == null) {
			getInstance().lineList = new ArrayList<>();
		}else {
			getInstance().lineList.clear();
			getInstance().lineList = new ArrayList<>();
		}
	}
	
	public static void addToLineList(AbstractLine line) {
		if(getInstance().lineList == null) {
			getInstance().lineList = new ArrayList<>();
		}
		getInstance().lineList.add(line);
	}
	
}
