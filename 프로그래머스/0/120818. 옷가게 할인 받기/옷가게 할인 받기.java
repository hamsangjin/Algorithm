class Solution {
    public int solution(int price) {
        return (price >= 500000) ? (int)((double)price * 0.8) : (price >= 300000) ? (int)((double)price * 0.9) : (price >= 100000) ? (int)((double)price * 0.95) : price;
    }
}