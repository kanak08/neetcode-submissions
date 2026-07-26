class Solution {
    public int maxProfit(int[] prices) {
        // int result= 0;
        // int min_price=prices[0];
        // int m=0;
        // while(m<prices.length-1 && (prices[m]>prices[m+1] || prices[m]>min_price) ){m++;}
        // if(m==prices.length-1){return result;}
        // for(int i=m;i<prices.length;i++){
        //     // while(i<prices.length-1 && (prices[i]>prices[i+1] || prices[i]>=min_price) ){i++; }
        //     min_price= Math.min(prices[i],min_price);
        //     int j=i+1;
        //     int maxi= 0;
            
        //     while(j<prices.length){
        //         maxi= Math.max(maxi,prices[j]);
        //         j++;
        //     }
        //     result= Math.max(maxi, result);
        // }
        // return (result-min_price);


        int result=0;
        // int i=0;
        int min= prices[0];
        int max= prices[0];
        // if(prices.length==2 && prices[1]>prices[0]){return prices[1]-prices[0];}
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=min){
                min=prices[i];
                int j=i;
                while(j<prices.length){
                    result = Math.max(result, prices[j]-min);
                    j++;
                }
            }
            // if(prices[i])
        }
        return result;
    }
}
