class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr= new int[number];
        
        for(int i=1; i <=number; i++){
            int count=0;
            for(int j=1; j*j<=i; j++){
                if(j*j==i){
                    count+=1;
                } else if(i%j==0){
                    count+=2;
                }
            }
            arr[i-1]=count;
            if(limit<arr[i-1]){
                answer+=power;
            }else{
                answer+=arr[i-1];
            }
        }
        return answer;
    }
}