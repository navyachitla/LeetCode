class Solution {
    public int mirrorDistance(int n) {
        int original=n;
        int m=0;
        while(n>0)
            {
                int digit=n%10;
                m=m*10+digit;
                n=n/10;
            }
        return Math.abs(original-m);
    }
}