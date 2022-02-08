package unit_7.in_class;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] unsorted = {8247, 47, 100, -5, 82, 17, 22};
        for (int tempNum: unsorted){
            System.out.print(tempNum + " ");
        }
        System.out.println();
        int[] sorted = selectionSortLH(unsorted);
        for (int tempNum: sorted){
            System.out.print(tempNum + " ");
        }
    }

    public static int[] selectionSortLH(int[] nums){
        for (int i = 0; i < nums.length - 1; i++){  // controls the index to insert the next smallest value
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++){ // iterates over all remaining indices after i
                if (nums[j] < nums[minIndex]){ // test if you have found a smaller value
                    minIndex = j;
                }
            }
            // need to swap index i and index minIndex
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
