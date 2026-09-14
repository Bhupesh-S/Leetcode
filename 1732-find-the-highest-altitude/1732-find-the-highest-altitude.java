class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int prev=0;
        for(int i=0;i<gain.length;i++){
            highest=Math.max(highest,prev+gain[i]);
            prev=prev+gain[i];
        }
        return highest;   
    }
}