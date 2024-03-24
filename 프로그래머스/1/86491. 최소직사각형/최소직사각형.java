class Solution {
    public int solution(int[][] sizes) {
        int w = 0, h = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                swap(sizes[i]);
            }
            
            w = Math.max(w, sizes[i][0]);
            h = Math.max(h, sizes[i][1]);
        }
        
        return w * h;
    }
    
    public void swap(int[] size){
        int temp = size[0];
        size[0] = size[1];
        size[1] = temp;
    }
}