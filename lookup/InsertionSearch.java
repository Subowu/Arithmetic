package sbw.lookup;

import java.util.Scanner;
/**
 * 2019-7-30
  * 插值查找
 * @author 11251
  * 参数times为查找次数 
 * mid = low + ((value-array[low])*(high-low))/(array[high]-array[low])
 */
public class InsertionSearch {
	//递归
	static int Insertion1(int[] array, int value, int high, int low, int times) {
		if (array.length == 1) {
			return 0;
		}
		int mid = low + ((value-array[low])*(high-low))/(array[high]-array[low]);
		System.out.println("查找中......第" + times++ + "次   mid = " + mid);
		if (value == array[mid]) {
			return mid;
		}
		if (value > array[mid]) {
			return Insertion1(array, value, high, mid + 1 ,times);
		}
		if (value < array[mid]) {
			return Insertion1(array, value, mid - 1, low, times);
		}
		return -1;
	}
	//循环
	static int Insertion2(int[] array, int value, int high, int low, int times) {
		if (array.length == 1) {
			return 0;
		}
		int mid;
		while (low < high) {
				mid = low + ((value-array[low])*(high-low))/(array[high]-array[low]);
				System.out.println("查找中......" + "第" + times++ + "次    mid = " + mid);
				if (value > array[mid]) {
					low = mid +1;
				}
				if (value < array[mid]) {
					high = mid - 1;
				}
				if (value == array[mid]) {
					return mid;
				}
		}
		return -1;
	}
	public static void main(String[] args) {
		//                       0  1  2  3  4  5  6   7   8   9  10  11  12  13  14  15  16  17  18
		int[] array = new int[] {3,16,34,58,60,88,128,137,189,277,333,356,444,492,555,583,666,693,777};
//		int[] array = new int[] {0,0,1,1,1,4,5,5};
		//                       0 1 2 3   4  5  6 7  8  9  10 
//		int[] array = new int[] {2,4,9,11,15,18,20,22,24,27,32};
		//                       0 1 2 3  4  5  6  7  8  9
		//int[] array = new int[] {0,4,9,11,15,18,22,24,27,32};
		System.out.print("下标:  "+ "\t");
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.print("数据:" + "\t");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("输入要查找的值:");
		int value = input.nextInt();
		int high = array.length - 1;
//		int index = Insertion1(array, value, high, 0 ,0);
		int index = Insertion2(array, value, high, 0 ,0);
		
		if (index >= 0) {
			System.out.println("所查找值的下标为" + index);
		}else {
			System.out.println("要查找的值不在数据中!!!");
		}
		input.close();
	}
}
