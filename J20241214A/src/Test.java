public class Test {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int cur = 0,dest = -1,n = arr.length;
        //1.先找到最后一个需要复写的数字
        while(cur < n) {
            if(arr[cur] == 0) dest += 2;
            else dest += 1;
            if(dest >= n-1) break;
            cur++;
        }
        //2.处理一下边界情况
        if(dest == n) {//说明已经越界了
            arr[n-1] = 0;
            cur--;
            dest -= 2;
        }
        //3.从后向前完成复写操作
        while(cur >= 0) {
            if(arr[cur] != 0) arr[dest--] = arr[cur--];//抄完后都向左移动一位
            else {
                arr[dest--] = 0;//先抄后移
                arr[dest--] = 0;//抄两遍
                cur--;//完成后cur继续往左遍历
            }

        }
    }
}
