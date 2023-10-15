package mission.Week1_Day4;

import java.util.Arrays;

public class DAY4_1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,};
        int[] array2 = {58,172,746,89};
        int[] array3 = {9,8,7};
        int[] array4 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 1111, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444};

        method(array1);
        method(array2);
        method(array3);
        method(array4);
    }
    public static void method(int[] arr){
        int length = arr.length;
        int test = 1;

        for (int i = 1; i <= length; i++) {
            test *= 2;

            if (length <= test) {
                System.out.println(Arrays.toString(Arrays.copyOf(arr, test)));
                break;
            }

        }
    }
}