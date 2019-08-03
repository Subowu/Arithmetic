package eazy;

public class Palindrome {
	static boolean isPalindrome(int x) {
//		boolean bool = true;//转字符串方法
//		String X = " " + x;
//		int len = X.length();
//        if (x >= 0) {
//        	for (int i = 0; i < len/2; i++) {
//        		if (!X.substring(i+1, i+2).equalsIgnoreCase(X.substring(len-i-1, len-i)) ) {
//					bool = false;
//				}
//			}
//        }else
//        	bool = false;
//        return bool;
		boolean bool = true;
		if (x < 0) {
			bool = false;
		}else if (x==0) {
			return bool;
		}
		else {
			int a = Math.abs(x);
		    double re = 0 ,b = 1;
		    int iter = (int)Math.floor(Math.log10(Math.abs(x))+1);
		    int[] result = new int[iter];
		    for (int i = iter-1; i >= 0; i--) {
				result[i] = a%10;
				a = a/10;
			}
		    for (int i = 0; i < iter; i++) {
				re = result[i] * b + re;
				System.out.println(re + "\t");
				b = b * 10.0;
			}
		    if (re - x != 0) 
		    	bool = false;
		}
		return bool;
    }
	public static void main(String[] args) {
		int b = 121;
		boolean a = isPalindrome(b);
		System.out.println(a);
	}
}
