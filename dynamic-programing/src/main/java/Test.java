public class Test {
    public int tribonacci(int n) {
        // 1137. 第 N 个泰波那契数
        // 处理边界情况
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        // 1. 创建dp表
        int[] dp = new int[n+1];
        // 2. 初始化
        dp[0] = 0;
        dp[1] = dp[2] = 1;
        // 3.填表
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        // 4. 确定返回值
        return dp[n];
    }
}
