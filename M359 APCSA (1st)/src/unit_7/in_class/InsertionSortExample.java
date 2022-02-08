package unit_7.in_class;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] unsorted = {-5, 10, -100, 8000, 47, 0, 22};
        for(int tempInt: unsorted){
            System.out.print(tempInt + " ");
        }
        System.out.println();
        int[] sorted = insertionSort(unsorted);
        for(int tempInt: sorted){
            System.out.print(tempInt + " ");
        }
    }

    public static int[] insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++){ // grabs the i'th index to insert in sub array
            int valueToInsert = nums[i];
            int position = i;
            while (position > 0 && valueToInsert < nums[position - 1]){
                nums[position] = nums[position - 1]; // "scooting" down (copying to the right)
                position--;
            }
            nums[position] = valueToInsert;
        }
        return nums;
    }

    public static String[] insertionSort(String[] names){
        for (int i = 1; i < names.length; i++){
            String valueToInsert = names[i];
            int position = i;
            while (position > 0 && valueToInsert.compareTo(names[position - 1]))
        }
    }
}
