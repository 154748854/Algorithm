import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        FourSum test = new FourSum();
        System.out.println(test.fourSum(new int[]{1,0,-1,0,-2,2}));
    }

}
// 四数字之和
class FourSum {
    public List<List<Integer>> fourSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        // 1. 排序
        Arrays.sort(nums);

        // 寻找四数之和
        int n = nums.length;
        for (int i = 0; i < n; ) {
            for (int j = i+1; j < n-1; ) {
                int left = j+1, right = n-1, target = -nums[i]-nums[j];
                while(left < right) {
                    // 常数级优化
                    if (nums[i] + nums[j] > 0) break;
                    // 双指针寻找target
                    if (nums[left] + nums[right] > target) {
                        right--;
                    } else if (nums[left] +nums[right] < target) {
                        left++;
                    } else {
                        // 两数之和等于target
                        ret.add(new ArrayList<Integer>(Arrays.asList(nums[left],nums[right],nums[j],nums[i])));
                        left++;
                        right--;
                        // 去重 要使用while循环, 因为可能不止一次去重
                        while (left < right && nums[left] == nums[left-1]) left++;
                        while (left < right && nums[right] == nums[right+1]) right--;
                    }
                }
                j++;
                // 去重
                while (j < n && nums[j] == nums[j-1]) j++;
            }
            i++;
            // 去重
            while (i < n && nums[i-1] == nums[i]) i++;
        }
        return ret;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, sum = 0, len = Integer.MAX_VALUE;
        for (int left = 0, right = 0; right < n; right++) {
            // 进窗口
            sum += nums[right];
            // 等right走到一个好位置,根据题意判断
            while (sum >= target) {
                // 更新结果
                len = Math.min(len,right-left+1);
                sum -= nums[left++];
                // 出窗口
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}





