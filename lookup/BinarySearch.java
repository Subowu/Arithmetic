package sbw.lookup;

import java.util.Scanner;

/**
 * 2019-7-29
  * 二分查找/折半查找
 * @author 11251
  * 参数times为查找次数
 * mid = (high+low)/2
 */
public class BinarySearch {
	public static void main(String[] args) {
		//                       0 1 2 3   4  5  6 7  8  9  10 
//		int[] array = new int[] {0,4,9,11,15,18,20,22,24,27,32};
//		int[] array = new int[] {1,2,2,3,3,4,4,4,5,5,6,6,7};
		//                       0 1 2 3  4  5  6  7  8  9
		int[] array = new int[] {0,4,9,11,15,18,22,24,27,32};
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
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("输入要查找的值:");
		int value = inputScanner.nextInt();
		int index = search.Binary1(array, value, 0);
//		int index = search.Binary2(array, value, 0, array.length, 0);
		if (index >=0 )
			System.out.println("所查找值的下标为:" + index);
		else 
			System.out.println("没有找到！！！");
		inputScanner.close();
	}
}
class search {
	//循环版本
	static int Binary1(int[] array, int value, int times) {
		int head = 0 ,end = array.length-1;
		int index = (head + end)/2;
		int iter = (int) Math.ceil(Math.log(array.length)/Math.log(2));
		for (int i = 0; i < iter; i++) {
			System.out.println("查找中......" + times++);
			if (value == array[index]) {
				return index;
			}
			if (value > array[index]) {
				head = index + 1;
				index = (head + end)/2;
			}else {
				end = index - 1;
				index = (head + end)/2;
			}
		}
		return -1;
	}
	//递归版本,存在bug，找不到时会进入死循环
	static int Binary2(int a[], int value, int low, int high, int times){
	    int mid = low+(high-low)/2;
	    System.out.println("查找中......" + times++);
	    if(a[mid]==value)
	        return mid;
	    if(a[mid]>value)
	        return Binary2(a, value, low, mid-1, times);
	    if(a[mid]<value)
	        return Binary2(a, value, mid+1, high, times);
	    return -1;
	}
}
