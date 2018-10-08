package com.Sort;

public class BubbleSort {

    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 9, 11, 65, 99};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }

    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }

            }
        }
        return list;
    }

}
