package eazy;
/**
 * 2019-08-03
 * @author 11251
 *	在一个给定的数组nums中，总是存在一个最大元素 。
	查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
	如果是，则返回最大元素的索引，否则返回-1。
	nums 的长度范围在[1, 50].
	每个 nums[i] 的整数范围在 [0, 99]
	
	示例 1:
	输入: nums = [3, 6, 1, 0]
	输出: 1
	解释: 6是最大的整数, 对于数组中的其他整数,
	6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1
 */
public class DominantIndex {
	public static void main(String[] args) {
		int[] nums = new int[] {0,2,0,3};
		
		SolutionDominant solution = new SolutionDominant();
		int index = solution.dominantIndex(nums);
		System.out.println("index = " + index);
	}
}

class SolutionDominant {
    public int dominantIndex(int[] nums) {
    	int maxIndex = 0;
    	if (nums.length == 0) {//如果nums为空
			return -1;
		}
    	if (nums.length == 1) {//如何nums只有一个值
			return 0;
		}
        int max = nums[0], min = nums[0], scoMax = nums[0];
        //为了比较最大值和第二大值，需要找到，第二大的值
        //为了找到第二大的值，需要找到最大值和最小值
    	for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max ) {
				max = nums[i];
				maxIndex = i;
			}
			if (nums[i] < min) {
				min = nums [i];
			}
		}
//    	System.out.println("min = " + min);
//    	System.out.println("maxIndex = " + maxIndex);
//    	System.out.println("max = " + max);
    	
    	//找第二大的值
    	scoMax = min;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i] > scoMax && nums[i] < max) {
				scoMax = nums[i];
			}
		}
//    	System.out.println("scoMax = " + scoMax);
    	
    	//排除被除数为0的情况
    	if (scoMax == 0) {
			return maxIndex;
		}else {
			if (((double)max/(double)scoMax) >= 2.0) {
				return maxIndex;
			}
		}
        return -1;
    }
}