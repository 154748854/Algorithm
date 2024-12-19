public class Test {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int left = 0,right = height.length - 1,ret = 0;
        while(left < right) {
            int v =Math.min(height[left],height[right]) * (right - left);
            ret = Math.max(ret,v);
            if(height[left] < height[right]) left++;
            else right--;
        }
        System.out.println(ret);
    }
}
