package practice;

public class Test {


    public static void main(String[] args) {

        int[] nums={2,3,5,76,8,4,3,2};
        print(nums);
        System.out.println("========================");
        bubbleSort(nums);
        print(nums);
    }


    public static void bubbleSort(int[] nums){
        int n=nums.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)break;
        }
    }

    public static void print(int[] nums){
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
