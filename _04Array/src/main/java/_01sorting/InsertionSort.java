package _01sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = { 43, 45, 23, 45, 2, 4, 56, 8 };
        print(nums);
        System.out.println("===============");
        insertionSort(nums);
        print(nums);
    }

    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
    }

    public static void print(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
