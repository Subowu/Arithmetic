package eazy;
import java.util.Arrays;

public class IsAnagram {
	static boolean isAnagram(String s, String t) {
//		if (s.length() != t.length()) {
//			return false;
//		}
//		char[] schar = s.toCharArray();
//		char[] tchar = t.toCharArray();
//		Arrays.sort(schar);
//		Arrays.sort(tchar);
//		return Arrays.equals(schar, tchar);
		if (s.length() != t.length()) {
			return false;
		}
		int[] count =new int [26];//计数器对应26个字母
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;//累积加
			count[t.charAt(i) - 'a']--;//累积减
		}
		for (int cont : count) {//如果 t 是 s 的字母异位词。
			if (cont != 0) {//则计数器每个位置都应该为0
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s ="adsafacc" , t = "ccdgfgnac";
		System.out.println("字符串s为" + s.toString());
		System.out.println("字符串t为" + t.toString());
		boolean bool = isAnagram(s, t);
		System.out.println(bool);
		
		String ss ="adsaf" , tt = "fdaas";
		System.out.println("字符串ss为" + ss.toString());
		System.out.println("字符串tt为" + tt.toString());
		boolean booll = isAnagram(ss, tt);
		System.out.println(booll);
	}

}
