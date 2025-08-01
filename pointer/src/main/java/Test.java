import javax.swing.text.html.parser.TagElement;

public class Test {
    public int[] twoSum(int[] price, int target) {
        int left = 0;
        int right = price.length-1;
        while (left < right) {
            int sum = price[left] + price[right];
            if (sum < target) {
                left++;
            }
            else if (sum > target) {
                right--;
            }else if (sum == target) {
                return new int[]{price[left],price[right]};
            }else {
                return null;
            }
        }
        return null;
    }
}
