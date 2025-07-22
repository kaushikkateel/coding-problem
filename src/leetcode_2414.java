public class leetcode_2414 {
    public int longestContinuousSubstring(String s) {
        int res = 0;
        int left = 0;
        int  right =1;


        char[] arr = s.toCharArray();

        for(int i = 0; i<arr.length-1;i++){
            if( arr[right] - arr[i] ==1){
                right++;
            }
            else{
                if(res<right-left){
                    res = right-left;
                }
                left=right;
                right++;
            }
        }
        if(res<right-left){
            res = right-left;

        }
        return res;
    }
}
