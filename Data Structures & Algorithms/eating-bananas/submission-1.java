class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = piles[0];
        

        for(int i=0;i<piles.length;i++){
            k = Math.max(k, piles[i]);
        }

        if(h == piles.length){
            return k;
        }

        int l = 0, r=k;
        while(l<=r){
            int mid = l+(r-l)/2;
            int req_time = search(piles, mid);
            if(req_time > h){
                l = mid+1; 
            }
            if(req_time <= h){
                r = mid-1;
                k = Math.min(k,mid);

            }
        }
        return k;
        
    }

    public int search(int[] piles, int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+= Math.ceil((double)piles[i]/mid);
        }
        return sum;
    }
}
