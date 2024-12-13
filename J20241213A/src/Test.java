public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        for (int cur = 0,dest = -1;cur < nums.length;cur++) {
            //因为遇到零cur++，所以这里不需要处理该情况，只需处理遇到非零
            if(nums[cur] != 0) {
                dest++;
                int tmp = nums[cur];
                nums[cur] = nums[dest];
                nums[dest] = tmp;
            }
        }
    }
}
