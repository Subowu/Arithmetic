package eazy;
/*
  * 一：先声明一个规则库，
 *二：从一个字符串型罗马数字末尾开始，取2位字符与规则库中的每个元素比对，
 *	  若找到匹配的，计算这2位罗马数字表示的数字
 *	  若没有，则是从末尾取一位出来，再在规则库中寻找，因为一位必可以找得到
 *三; 若干次寻找后可得罗马数字的Integer 
 */
public class RomanToInt {
	static int romanToInt(String s) {
		String temp = "";
		StringBuffer stri = new StringBuffer();
		stri.append(s);  //把字符串转化为StringBuffer类型，方便删除特定位置的值，便于循环
		System.out.println("输入为： " + stri);
		int ans = 0 , index = 13 ;
		//规则库
		String[] rulebase={"0|0","IV|4","IX|9","XL|40","XC|90","CD|400","CM|900","I|1","V|5","X|10","L|50","C|100","M|1000","0|0"};
		while (stri.length() != 0) {//每次循环删除最后一位或者两位值
			if (stri.length() >= 2) {
				if (index == 0)
					temp = stri.substring(stri.length()-1, stri.length());
				else
					temp = stri.substring(stri.length()-2, stri.length());
			}else
				temp = stri.substring(stri.length()-1, stri.length());
			for (int j = 0; j < rulebase.length; j++) {
				String[] strArr = rulebase[j].split("\\|");
				if (temp.equals(strArr[0])) {  //找到了匹配的元素
					index = j;
					ans += Integer.valueOf(strArr[1]);//计算
					if (strArr[0].length() == 2) {//如果是2位匹配则删除最后2位
						stri.replace(stri.length()-2, stri.length(), "");
					}else {     //如果是1位匹配则删除最后1位
						stri.replace(stri.length()-1, stri.length(), "");
					}
					break;
				}else {
					index = 0;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int ans = 0;
		String s = "MMMCDXCIII";
		ans = romanToInt(s);
		System.out.println("转换结果为" + ans);
	}
}
