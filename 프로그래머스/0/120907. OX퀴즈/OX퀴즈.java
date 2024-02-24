class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] list = quiz[i].split(" ");

            if(list[1].equals("+")){
                if(Integer.parseInt(list[0]) + Integer.parseInt(list[2]) == Integer.parseInt(list[4])){
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            } else{
                if(Integer.parseInt(list[0]) - Integer.parseInt(list[2]) == Integer.parseInt(list[4])){
                    answer[i] = "O";
                } else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}