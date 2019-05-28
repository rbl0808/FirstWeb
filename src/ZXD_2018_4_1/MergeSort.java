package ZXD_2018_4_1;

import java.util.Arrays;

public class MergeSort {
    /**
     * 将两个有序数组合并到目标数组中
     * @param a 目标数组
     * @param start 目标数组起始位置，从起始位置开始填入元素
     * @param one
     * @param two
     */
    private void mergeArray(int[] a, int start, int[] one, int[] two) {
        int oneLen = one.length;
        int twoLen = two.length;
        // m 指针指向 one数组, n 指针指向two数组
        int m = 0, n = 0;
        // i 指针指向 a数组
        int i = start;
        while (m < oneLen && n < twoLen) {
            if (one[m] < two[n]) {
                a[i] = one[m];
                m++;
            } else {
                a[i] = two[n];
                n++;
            }
            i++;
        }
        while (m < oneLen) {
            a[i] = one[m];
            i++;
            m++;
        }
        while (n < twoLen) {
            a[i] = two[n];
            i++;
            n++;
        }
    }

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();
        int a[] = new int[12];
        int[] one = new int[]{1, 16, 80, 200, 201};
        int[] two = new int[]{10, 32, 45, 79, 90, 100, 101};
        mergeSort.mergeArray(a, 0, one, two);
        System.out.println(Arrays.toString(a));

    }
}
