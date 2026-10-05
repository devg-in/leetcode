class Solution {
     public int maximumCount(int[] arr) {
        int n = arr.length;
        int lo = 0, hi = n-1;
        int idx = -1;
        int negCount = 0, posCount = 0;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (arr[mid]>=0){
                idx = mid;
                hi = mid-1;
            }
            else{
                idx = mid;
                lo = mid+1;
            }
        }
        negCount = lo;

        lo = 0;
        hi =n-1;
        while(lo<=hi){
        int mid = lo + (hi-lo)/2;
            if (arr[mid]<=0){
                idx = mid;
                lo = mid+1;
            }
            else{
                idx = mid;
                hi = mid-1;
            }
        }
        posCount = n-lo;

        if(posCount>negCount) return posCount;
        else return negCount;
    }
}
   