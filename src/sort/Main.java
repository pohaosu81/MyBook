package sort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numArr = {4, 3, 1, 5, 2, 4, 3, 1, 5, 2};
		
		Sort sort = SortFactory.getSort(SortEnum.BUBBLE_SORT);
		
		sort.sort(numArr);
		
		for (int num: numArr) {
			System.out.println(num);
		}
	}

}
