package sbw.sort;
/*
  *  插入排序
 * 1、从第一个元素开始，该元素可以认为已经被排序；
 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 5、将新元素插入到该位置后;
  *  重复步骤2~5。
 */
public class Insertion {
	static int[] InsertionSort(int[] array) {
		int[] result = array;
		int temp = 0;
		for (int i = 0; i < result.length - 1; i++) {//前i个元素为有序部分
			temp = result[i+1];
			System.out.print("temp = " + temp);
			System.out.println();
			System.out.println("**********************************************");
			int preindex = i;
			while (preindex >= 0 && result[preindex] >= temp) {
				result[preindex+1] = result[preindex];
				preindex --;
				for (int a = 0; a < result.length; a++) {
					System.out.print(result[a] + "    ");
				}
				System.out.println();
				System.out.println("**********************************************");
			}
			result[preindex + 1] = temp;
			for (int a = 0; a < result.length; a++) {
				System.out.print(result[a] + "    ");
			}
			System.out.println();
			System.out.println("********************************************************************");
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array = {5,2,4,7,0,6,8,9,3,1};
		System.out.println("temp为无序部分第一个值");
		System.out.println("初始数据：");
		for (int a = 0; a < array.length; a++) {
			System.out.print(array[a] + "    ");
		}
		System.out.println();
		System.out.println("**********************************************************************");
		int[] result = InsertionSort(array);
		System.out.println("结果");
		for (int a = 0; a < result.length; a++) {
			System.out.print(result[a] + "    ");
		}
	}
}
