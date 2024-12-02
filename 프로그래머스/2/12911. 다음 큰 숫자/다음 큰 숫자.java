class Solution {
    public int solution(int n) {
        int cnt1 = Integer.bitCount(n);

        for (int i = n + 1; i <= 1000000; i++) {
            if (Integer.bitCount(i) == cnt1)    return i;
        }
        return 0;
    }
}