package _02Medium;

public class _02KadanesAlgoMaxSumSubarray {

    public static int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int overallSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(currentSum>=0){
                currentSum+=nums[i];
            }
            else{
                currentSum=nums[i];
            }
            if(currentSum>overallSum){
                overallSum=currentSum;
            }
        }
        return overallSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int num = maxSubArray(nums);
        System.out.println(num);
    }

}
