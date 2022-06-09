package collections;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        sorter();


        int [] arr = {4,11,2,8,2};

        int i;
        for (i=0; i< arr.length ; i++){
            System.out.println("Initial Arr : " + arr[i]);

        }

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int a = 0; a < arr.length - 1; a++) {


                //System.out.println(arr[a]);
                if (arr[a] > arr[a + 1]) {
                    swapped = true;
                    int temp = arr[a];
                    arr[a] = arr[a + 1];
                    arr[a + 1] = temp;
//                    System.out.println("After :" + arr[a]);

                }
                System.out.println("New"+Arrays.toString(arr));



            }







        }


    }

    static void sorter(){

        int[] numbers = {12, 5, 18, 2, 7};
        for (int x = 0; numbers.length < x; x++) {
            for (int y = 1; numbers.length < y; y++) {
                if (numbers[y] > numbers[y - 1]) {
                    int temp = numbers[y];
                    numbers[y] = numbers[y - 1];
                    numbers[y - 1] = temp;
                }
                System.out.printf("first" + Arrays.toString(numbers));
            }

        }

    }
}



