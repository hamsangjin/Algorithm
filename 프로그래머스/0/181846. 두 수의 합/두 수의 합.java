import java.util.*;
import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        BigInteger answer = A.add(B);
        
        return answer.toString();
    }
}