package sbw.sort;
import java.util.Random;
import java.util.Scanner;
/*
 * 冒泡排序
 */
public class Bubble {
	public static int[] Sortzheng(int[] array) {
		if (array.length == 0)
		return array;
		for(int i = 0 ; i <= array.length-1 ; i ++) {
			System.out.println();
			System.out.println("第" + (i+1) + "轮");
			System.out.println("*******************************************************************************************************");
			for (int j2 = 0; j2 <= array.length - 1; j2++) {
				System.out.print(array[j2] + "\t");
			}
			System.out.println();
			System.out.println("**********************************************************************************");
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j+1] < array[j]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp; 
				}
				for (int j2 = 0; j2 <= array.length - 1; j2++) {
					System.out.print(array[j2] + "\t");
				}
				System.out.println();
				System.out.println("**********************************************************************************");
			}
		}
		return array;
	}
	public static int[] Sortfan(int[] array) {
		if (array.length == 0)
		return array;
		for(int i = 0 ; i <= array.length-1 ; i++) {
			System.out.println();
			System.out.println("第" + (i+1) + "轮");
			System.out.println("*******************************************************************************************************");
			for (int j2 = 0; j2 <= array.length - 1; j2++) {
				System.out.print(array[j2] + "\t");
			}
			System.out.println();
			System.out.println("**********************************************************************************");
			for (int j = array.length-2; j >= i; j--) {
				if(array[j] >= array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp; 
				}
				for (int j2 = 0; j2 <= array.length - 1; j2++) {
					System.out.print(array[j2] + "\t");
				}
				System.out.println();
				System.out.println("**********************************************************************************");
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int a = 11;
//		int test[] = {5,2,4,7,8,1,2,8,9,3,1};
		int array[] = new int[a];
		int[] result = new int[a];
		int flag = 0;
		System.out.println("flag为‘1’表示正着排，flag为‘2’表示反着排输入flag值：");
		Scanner in = new Scanner(System.in);
		flag = in.nextInt();
//		for (int i = 0; i < test.length; i++) {
//			System.out.print(test[i] + "\t");
//		}
		System.out.println();
		if(flag != 1&&flag != 2) {
			System.out.println("请输入‘1’或者‘2’");
		}else {
			Random random = new Random();
			System.out.println("随机输入数据的为");
			for (int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(a) + 1; 
				System.out.print(array[i] + "\t");
			}
			if(flag == 1)
				result = Sortzheng(array);
			else if(flag == 2)
				result = Sortfan(array);
			System.out.println();
			System.out.println("最终结果为：");
			for (int j = 0; j <= result.length-1; j++) {
				System.out.print(result[j] + "\t");
			}
		}
		in.close();
	}
}
