package ZXD_2018_4_1;

import java.util.Arrays;

/**
 *  asc 升序
 *  desc 降序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 1, 43, 44, 2, 21, 44, 55, 77, 88, 33};
//        BubbleSort(a,"asc");
//        for (int i =0 ;i<a.length;i++)
//            System.out.print(a[i] + " ");

        bubbleSort(a);
        Arrays.toString(a);

    }

    //插入排序
    public static int[] insertionSort(int[] a,String c){
        int b;
        if("asc".equals(c)) {
            for (int i = 0 ;i < a.length;i++)
            for (int l = 0;l < a.length;l++)
                if(a[i] < a[l]) {
                    b = a[i];
                    a[i] = a[l];
                    a[l] = b;
                }
        } else if("desc".equals(c)){
            for (int i = 0 ;i < a.length;i++)
                for (int l = 0;l < a.length;l++)
                    if(a[i] > a[l]) {
                        b = a[i];
                        a[i] = a[l];
                        a[l] = b;
                    }
        }
        return a;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        //最后一次交换位置
        int lastExchangeIndex = 0;
        //数组有序边界
        int soutborder = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            boolean isSourted = true;
            for (int j = 0; j < soutborder; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSourted = false;
                    lastExchangeIndex = j;
                }
            }
            soutborder = lastExchangeIndex;
            if (isSourted) {
                break;
            }
        }
    }
}
