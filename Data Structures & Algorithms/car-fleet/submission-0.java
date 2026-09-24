class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int n = position.length;
       if(n == 0) return 0;

       //Storing position and time to reach target as pairs
       double[][] cars = new double[n][2];
       for(int i = 0; i < n; i++){
        cars[i][0] = position[i]; // car position
        cars[i][1] = (double)(target - position[i]) / speed[i]; // time to reach target
       }

       Arrays.sort(cars,(a,b) -> Double.compare(b[0],a[0]));

       //count fleets
       int fleets = 0;
       double lastTime = 0;

       for(int i = 0; i< n; i++){
        double currentTime = cars[i][1];
        if(currentTime > lastTime){
            fleets++;
            lastTime = currentTime;
        }
       }
       return fleets;
    }
}
