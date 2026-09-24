class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right= Arrays.stream(piles).max().orElse(0);

        while(left<right){
            int mid = left+(right-left)/2;
            
            if(canEatAll(piles,h,mid)){
                right = mid;
            }
            else{
                left = mid +1;
            }
        }
        return left;
    }

    private boolean canEatAll(int[] piles, int h, int mid){
        int hours = 0;

        for(int pile :piles){
            hours+= (pile +mid-1)/mid;
            if(hours>h){
                return false;
            }
            
        }
        return true;
    }
}
