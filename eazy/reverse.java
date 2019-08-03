package eazy;

import java.util.Scanner;

/*
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。-2,147,483,648 =< num <= 2,147,483,647
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class reverse {
	static int reverse(int x) {
//		 int rev = 0;
//	        while (x != 0) {
//	            int pop = x % 10;
//	            System.out.print(pop + "\t");
//	            x /= 10;
//	            System.out.print(x + "\t" + "\t");
//	            if (rev > Integer.MAX_VALUE/10 || (rev ==Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//	            rev = rev * 10 + pop;
//	            System.out.print(rev);
//	            System.out.println();
//	        }
//	        return rev;
		if (x == 0) {
			return x;
		}
	    int a = Math.abs(x);
	    double re = 0 ,b = 1.0;
	    int iter = (int)Math.floor(Math.log10(Math.abs(x))+1);
	    int[] result = new int[iter];
	    for (int i = iter-1; i >= 0; i--) {
			result[i] = a%10;
			a = a/10;
		}
	    for (int i = 0; i < iter; i++) {
			re = result[i] * b + re;
			b = b * 10.0;
		}
	    if (x >= 0) {
			if (re > (double)Integer.MAX_VALUE)
				re = 0.0;
		}else {
			if ((0-re) < (double)Integer.MIN_VALUE)
				re = 0.0;
			else
				return (int)(0.0-re);
		}
	    return (int)re;
	}
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("输入一个Integer类型的值:");
//		int b = in.nextInt();
		int b = -1234567891;
		System.out.println(b);
		int a = reverse(b);
		
		System.out.println(a);
//		in.close();
//		System.out.println(Math.floor(Math.log10(1))+1);
	}
}
