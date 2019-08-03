package normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
/**
 * 2019-08-02
 * @author 11251
 *	给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
	你的算法时间复杂度必须是 O(log n) 级别。
	如果数组中不存在目标值，返回 [-1, -1]。
	示例 1:
	输入: nums = [5,7,7,8,8,10], target = 8
	输出: [3,4]

	示例 2:
	输入: nums = [5,7,7,8,8,10], target = 6
	输出: [-1,-1]
 */
public class SearchRange {

	static int[] searchRange(int[] nums, int target) {
        int[] result =new int[] {-1,-1};
    	//从第一个位置检索
        int i;//先找到nums中最左边的target下标值
        for (i = 0; i < nums.length; i++) {
    		if (target == nums[i]) {
    			result[0] = i;
    			break;
    		}
    	}
        //如果没有找到nums中最左边的target下标值，直接返回
        if (result[0] == -1) {
			return result;
		}
        //如果找到了nums最左边的target下标值，则从这个位置
        //开始往左边找到nums最右边的target下标值
        //循环条件:当发现num[i]!=target，跳出循环
        while (nums[i] == target) {
			i ++;
			//如果在nums中只有一个target则直接返回一组下标
        	if (i > nums.length - 1) {
				result[1] = i;
				break;
			}
		}
        //这里已经发现nums[i]!=target,但是nums[i-1]==target
        result[1] = i - 1;
        return result;
    }
	public static void main(String[] args) {
		int[] nums = new int[] {0,0,1,1,1,4,5,5};
//		int[] nums = new int[] {1};
		int target = 1;
		int[] result = searchRange(nums, target);
		System.out.println("result[0] = " + result[0]);
		System.out.println("result[1] = " + result[1]);
	}
}
    