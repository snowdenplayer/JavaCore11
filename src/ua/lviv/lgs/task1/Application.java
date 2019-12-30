package ua.lviv.lgs.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Integer [] arr = new Integer[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(arr.length);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
