package sort;

public final class SortFactory {
	
	private SortFactory() {
		
	}
	
	public static Sort getSort(final SortEnum sortName) {
		Sort sort = null;
		if (sortName.equals(SortEnum.BUBBLE_SORT)) {
			sort = new BubbleSort();
		}
		return sort;
	}

}
