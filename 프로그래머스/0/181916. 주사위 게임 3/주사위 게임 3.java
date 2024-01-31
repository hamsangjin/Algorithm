class Solution {
    public int solution(int a, int b, int c, int d) {
        // 네 주사위 모두 같은 숫자
        if (a == b && b == c && c == d){
                return 1111 * a;
        }

        // 세 주사위 같은 숫자, 하나 다름
        if (((a == b && b == c) && c != d)){
                return (10 * a + d) * (10 * a + d);
        } else if (((b == c && c == d) && d != a)){
                return (10 * b + a) * (10 * b + a);
        } else if (((a == c && c == d) && d != b)){
                return (10 * a + b) * (10 * a + b);
        } else if (((a == b && b == d) && d != c)){
                return (10 * a + c) * (10 * a + c);
        }

        // 두 주사위끼리 서로 다른 쌍
        if ((a == b && c == d) && a != d){
                return (a + d) * Math.abs(a - d);
        } else if ((a == c && b == d) && a != d){
                return (a + d) * Math.abs(a - d);
        } else if ((a == d && b == c) && a != c){
                return (a + c) * Math.abs(a - c);
        }

        // 두 주사위는 같으면서, 나머지 두 주사위끼리는 같지 않을 때
        if (a == b && b != c && c != d){
                return c * d;
        } else if (a == c && b != c && b != d){
                return b * d;
        } else if (a == d && b != d && b != c){
                return b * c;
        } else if (b == c && a != b && a != d){
                return a * d;
        } else if (b == d && a != b && a != c){
                return a * c;
        } else if (c == d && a != c && a != b){
                return a * b;
        }


        // 네 주사위가 다른 경우
        if (a != b && a != c && a != d && b != c && b != d && c != d){
                return Math.min(Math.min(a, b), Math.min(c, d));
        }
        
        return 0;
    }
}