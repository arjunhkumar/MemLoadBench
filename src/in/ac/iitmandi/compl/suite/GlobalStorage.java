/**
 * 
 */
package in.ac.iitmandi.compl.suite;

import java.util.ArrayList;
import java.util.List;

import in.ac.iitmandi.compl.ds.NonValueLine;
import in.ac.iitmandi.compl.ds.ValueLine;

/**
 * @author arjun
 *
 */
public class GlobalStorage {
	
	private List<ValueLine> valLineList;
	private List<NonValueLine> nValLineList;
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

	public static void addToValList(ValueLine line) {
		List<ValueLine> currentList = getInstance().getValLineList();
		if(currentList == null) {
			currentList = new ArrayList<>();
			getInstance().setValLineList(currentList);
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
}
