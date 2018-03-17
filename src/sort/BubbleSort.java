package sort;

public class BubbleSort implements Sort {
	
	public BubbleSort() {
		
	}
	
	@Override
	public <V extends Comparable<V>> void sort(V[] valueArr) {
		for (int i = 0; i < valueArr.length; i++) {
			for (int j = 0; j < valueArr.length - i - 1; j++) {
				if (valueArr[j].compareTo(valueArr[j + 1]) > 0) {
					V tempValue = valueArr[j];
					valueArr[j] = valueArr[j + 1];
					valueArr[j + 1] = tempValue;
				}
			}
		}
	}
	
}
