package eazy;

import java.util.HashMap;
import java.util.Map;
/*
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
	static int[] Twosum(int[] nums, int target) {
		//我的方法
//		int[] array = nums, index = {-1,-1};
//		int tar , get;
//		for (int i = 0; i < array.length; i++) {
//			tar = nums[i];
//			for (int j = i + 1; j < array.length; j++) {
//				get = nums[j];
//				if (target == (tar + get)) {
//					index[0] = i;
//					index[1] = j;
//				}else {
//					continue;
//				}
//			}
//		}
//		return index;
		//官方
		int tar = 0 , a = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			tar = target - nums[i];
			if (map.containsKey(tar) && map.get(tar) != i) {
//				return new int[] {i,map.get(tar)};
				a=i;
				break;
			};
			throw new IllegalArgumentException("not find!");
		}
		return new int[] {a,map.get(tar)};
	}
	public static void main(String[] args) {
		int[] index = new int[2];
//		int[] nums = {3,1,6,8,3,5,9,7,2,4,16,24,15,23,11};
		int[] nums = {-3,4,3,90};
		int target = 0;
//		int target = 18;
		index = Twosum(nums,target);
			int a = index[0];
			int b = index[1];
			System.out.println("target:" + target + " 为nums[" + a + "]=" + nums[a]+
					"  与  nums[" + b + "]=" + nums[b]+"的和");
		
	}

}
