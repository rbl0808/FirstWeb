package ZXD_2018_11_28;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int waitsort[] = {2,3,7,1,6,8,3,9,2,8,8,7};
        Sort s = new Sort();
        System.out.println(Arrays.toString(waitsort));
        s.QuickSort(waitsort,0,waitsort.length-1);
        System.out.println(Arrays.toString(waitsort));

    }

    void  QuickSort(int a[],int left,int right){
        int center;
        if(left < right){
            center = partition(a,left,right);
            //左半部分
            QuickSort(a,left,center-1);
            //右半部分
            QuickSort(a,center + 1,right);
        }
    }

    //2,3,7,1,6,8,3,9
    int partition(int[] arr,int left,int right){
        int pivot = arr[left];
        int i = left;
        int j = right;
        while(true){
            //向左遍历扫描
            while (i < j && pivot <= arr[j])
                j--;
            //向右遍历扫描
            while (i < j && pivot >= arr[i])
                i++;
            if(i >= j)
                break;
            //交换
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //把arr[j]和主元交换
        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }

    //2,3,7,1,6,8,3,9
    int partitionZhou2(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (i < j) {
            //向左遍历扫描
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            arr[i] = arr[j];
            //向右遍历扫描
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            arr[j] = arr[i];

        }
        //把arr[j]和主元交换
        arr[i] = pivot;
        return i;
    }

    //2,3,7,1,6,8,3,9
    int partitionZhou1(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (i < j) {

            //向右遍历扫描
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            arr[j] = arr[i];
            //向左遍历扫描
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            arr[i] = arr[j];
        }
        //把arr[j]和主元交换
        arr[i] = pivot;
        return i;
    }
}
