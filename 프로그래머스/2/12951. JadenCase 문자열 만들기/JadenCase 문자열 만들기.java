class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;

        // 전부 소문자로 바꾸고 하나씩 확인
        for(String str : s.toLowerCase().split("")) {
            // flag가 true면 대문자로 저장하고, 아니라면 그냥 저장
            // 공백은 어차피 대문자로 하든 소문자로 하든 공백이라 상관 X
            // 숫자도 그대로기 때문에 대문자 변환해도 상관 X
            answer += flag ? str.toUpperCase() : str;

            // 만약 str이 공백이라면 flag를 true로 바꿔줌으로써,
            // 다음 문자로 공백이 아닌 문자가 나오면, 대문자로 저장할 수 있게 해준다.
            // 만약 공백이 아니라면 false로 바꿔줌으로써,
            // 다음 문자로 공백이 아닌 문자가 나오면, 소문자로 저장할 수 있게 해준다.
            flag = str.equals(" ") ? true : false;
        }

        return answer;
    }
}
