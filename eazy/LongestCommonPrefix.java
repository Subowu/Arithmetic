package eazy;
/**
 * 2019-7-31
 * @author 11251
 *	编写一个函数来查找字符串数组中的最长公共前缀。
	如果不存在公共前缀，返回空字符串 ""。
	所有输入只包含小写字母 a-z 。
	示例 1:
	输入: ["flower","flow","flight"]
	输出: "fl"

	示例 2:
	输入: ["dog","racecar","car"]
	输出: ""
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
//		String[] strs = {"flower","flow","flight","fleet"};
//		String[] strs = {"aggregate","ghost","withdraw"};
		String[] strs = {"aa","ab"};
		System.out.print("输入的字符串数组为:");
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i] + "\t");
		}
		String re = Solution.longestCommonPrefix(strs);
		System.out.println();
		System.out.println("公共前缀为:" + re);
	}
}
class Solution {
    static String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0) {
			return "";
		}
    	if (strs.length == 1) {
			return strs[0];
		}
    	String min = strs[0] ;
        for (int i = 0; i < strs.length; i++) {
        	if (strs[i].isEmpty()) {
				return "";
			}
        	if (strs[0].charAt(0) != strs[i].charAt(0)) {
				return "";
			}
        	if (strs[i].length() <= min.length()) {
				min = strs[i];
        	}
        }
        for (int i = 0; i < strs.length; i++) {
        	if (min.equals(strs[i])) {
				continue;
			}
	        for (int j = min.length()-1; j > 0 ; j--) {
				if (min.charAt(j) != strs[i].charAt(j)) {
					min = min.substring(0, j);
				}
			}
		}
        return min;
    }
}