package practice;

public class Test {
    // selection sort


    public static void main(String[] args) {
        int[] nums={3,4,5,2,3,8,9,12,223,34,43,32,2,1};
        print(nums);
        System.out.println("======================================");
        selectionSort(nums);
        print(nums);
    }
//    min index dekho and swap kro .
    public static void selectionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int minindex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minindex]){
                    minindex=j;
                }
            }
            // swap with min index
            int temp=nums[i];
            nums[i]=nums[minindex];
            nums[minindex]=temp;
        }
    }

    public static void  print(int[] nums){
        for(int n:nums){
            System.out.print(n+" ");
        }

    }



}
