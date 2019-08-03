package sbw.lookup;

import java.util.Scanner;

/**
 * 2019-7-29
 * 顺序查找
 * @author 11251
 *
 */
public class SequentialSearch {
	static int Sequential(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = new int[]{1,6,8,3,8,0,2,7,4,5};
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int index = Sequential(array,value);
		input.close();
		if (index >= 0)
			System.out.println("所查找值的下标为:" + index);
		else 
			System.out.println("没有找到！！！");
	}
}
