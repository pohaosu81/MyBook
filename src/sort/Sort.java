package sort;

public interface Sort {
	
	public <V extends Comparable<V>> void sort(V[] valueArr);

}
