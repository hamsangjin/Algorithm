class Solution {
    public int solution(String[] order) {
        
        int answer = 0;
        
        for(String drink : order){
            if(drink.equals("icecafelatte") || drink.equals("cafelatteice") || drink.equals("hotcafelatte") || drink.equals("cafelattehot") || drink.equals("cafelatte")){
                answer += 5000;
            } else{
                answer += 4500;
            }
        }
        
        return answer;
    }
}