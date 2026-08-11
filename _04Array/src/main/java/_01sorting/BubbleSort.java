package _01sorting;

public class BubbleSort {


    public static void print(int[] nums){
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
    public static void bubbleSort(int[] nums){
        int n=nums.length;
        boolean swapped;
        for(int i=0;i<nums.length-1;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)break;
        }
    }

    public static void main(String[] args) {
       int[] nums={5,6,4,3,4,5,8,89,64,3,4};
       bubbleSort(nums);
       print(nums);
    }





}
