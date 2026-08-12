package _01sorting;

public class SelectionSort {

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minindex] > nums[j]) {
                    minindex = j;

                }
            }
            int temp = nums[minindex];
            nums[minindex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void print(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 64, 34, 45, 23, 12, 9 };
        print(nums);
        selectionSort(nums);
        System.out.println("=====================");
        print(nums);
    }

}
