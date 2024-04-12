import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= numbers[i])  stack.pop();

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(numbers[i]);
            
        }
        
        return result;
    }
}