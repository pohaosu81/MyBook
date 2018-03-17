package sort;

public enum SortEnum {
	
	BUBBLE_SORT("bubbleSort");
	
	protected final String name;
	
	private SortEnum(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
