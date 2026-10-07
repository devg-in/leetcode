class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo = 0, hi = arr.length -1;
        while(lo<=hi){
            int mid = lo + (hi -  lo)/2;
            int correctNo = mid+1;
            int missingNo = arr[mid]- correctNo;
            if(missingNo >= k) hi = mid-1;
            else lo = mid+1;
        }
        return (lo+k);
    }
}