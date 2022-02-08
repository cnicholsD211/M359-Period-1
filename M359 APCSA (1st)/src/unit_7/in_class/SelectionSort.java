package unit_7.in_class;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsorted = {5, 3, 4, 10, 12, 9};
        for (int i = 0; i < unsorted.length; i++){
            System.out.print(unsorted[i] + " ");
        }
        System.out.println();
        int[] sorted = selectionSort(unsorted);
        for (int i = 0; i < sorted.length; i++){
            System.out.print(sorted[i] + " ");
        }
    }

    public static int[] selectionSort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
