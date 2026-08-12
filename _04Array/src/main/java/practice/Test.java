package practice;

public class Test {

    public static void main(String[] args) {
        int[] nums = { 5, 6, 4, 3, 4, 5, 6, 7, 7, 6, 5, 5, 4, 4, 5, 6, 7 };
        print(nums);
        bubbleSort(nums);
        System.out.println("====================");
        print(nums);
    }

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped = false) {
                break;
            }
        }

    }

    public static void print(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

}
