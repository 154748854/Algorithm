public class Test {
    public static int Sum(int n) {//返回n这个数每一位的平方和
        int sum = 0;
        while(n != 0) {
            int t = n%10;
            sum += t*t;
            n /= 10;
        }
    }
    public static void main(String[] args) {
        int n = 123;
        int slow = n, fast = Sum(n);//让fast指向执行过一次操作后的数才能进while循环
        while(slow != fast) {
            slow = Sum(slow);//slow每次处理一遍
            fast = Sum(Sum(fast));//fast每次处理两次
        }
        return slow == 1;//写错了
    }
}
