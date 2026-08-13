package practice;

public class Test {
    // Insertion sort


    public static void main(String[] args) {
        int[] nums={5,6,4,3,5,87,9,7,5,3,2};
        print(nums);
        System.out.println("=============================");
        insertionSort(nums);
        print(nums);


    }
        public static void insertionSort(int[] nums){

            for(int i=1;i<nums.length;i++){

                int j=i;
                while(j>0 && nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    j--;
                }
            }
        }

        public static void print(int[] nums){
        for(int n:nums){
            System.out.print(n+" ");
        }
        }
}
