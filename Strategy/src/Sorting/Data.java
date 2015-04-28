package Sorting;

public abstract class Data {
	
	ISorting Sorting;
	IStore Storetype;

	public void performSortAlg(){
		Sorting.sort();
	}
public void performStore(){
	Storetype.store();
}

}
