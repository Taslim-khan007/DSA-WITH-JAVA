
import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String args[]) {

        // 1. Sort the complete array in ascending order
        int arr1[] = { 2, 5, 1, 9, 4, 0 };
        Arrays.sort(arr1);
        System.out.println("1. Ascending Order: "
                + Arrays.toString(arr1));

        // 2. Sort a specific range in ascending order
        // Starting index is included, ending index is excluded
        int arr2[] = { 2, 5, 1, 9, 4, 0 };
        Arrays.sort(arr2, 0, 3);
        System.out.println("2. Range Ascending Order: "
                + Arrays.toString(arr2));

        // 3. Sort the complete array in descending order
        // Use Integer[] instead of int[]
        Integer arr3[] = { 2, 5, 1, 9, 4, 7 };
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println("3. Descending Order: "
                + Arrays.toString(arr3));

        // 4. Sort a specific range in descending order
        // Starting index is included, ending index is excluded
        Integer arr4[] = { 2, 5, 1, 9, 4, 7 };
        Arrays.sort(arr4, 0, 3, Collections.reverseOrder());
        System.out.println("4. Range Descending Order: "
                + Arrays.toString(arr4));
    }
}
