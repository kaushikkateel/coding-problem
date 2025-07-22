import java.util.Arrays;
import java.util.HashSet;

public class leetcode_1695 {

    public int maximumUniqueSubarray(int[] nums) {
        int r=0;
        int l=0;
        int s=0;
        int res=0;
        HashSet<Integer> hs = new HashSet<Integer>();
          while(r<nums.length){
            if(!hs.contains(nums[r])){
                hs.add(nums[r]);
                s=s+nums[r];
                r++;

            }
            else{
                hs.remove(nums[l]);
                s=s-nums[l];
                l++;
            }
          res=res>s?res:s;
        }

        return  res;
    }
}
