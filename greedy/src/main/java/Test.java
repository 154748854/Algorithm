public class Test {
    public boolean lemonadeChange(int[] bills) {
        int a = 0;
        int b = 0;
        for (int i = 1; i < bills.length; i++) {
            if (bills[i]==5) {
                a++;
            }
            if (bills[i]==10) {
                if (a==0) return false;
                a--;
                b++;

            }
            if(bills[i]==20) {
                if(a>=1 && b>=1) {
                    a--;
                    b--;
                }else if (a>=3) {
                    a-=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
