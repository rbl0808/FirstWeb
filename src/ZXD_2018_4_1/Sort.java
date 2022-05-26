package ZXD_2018_4_1;

import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] waitSort = {1, 2, 63, 7, 2, 2, 2, 235, 77, 22, 53, 64, 13, 73};
        sort.shuffle(waitSort);
        System.out.println("排序前:" + Arrays.toString(waitSort));
        //sort.insertionSort(waitSort,"asc");
        //sort.shellSort(waitSort);
        sort.quickSort(waitSort, 0, waitSort.length - 1);
        //sort.bubbleSort(waitSort);
        //sort.heapSort(waitSort);
        //sort.mergeSort(waitSort);
        System.out.println("排序后:" + Arrays.toString(waitSort));
    }


    //乱序数组
    void shuffle(int[] arr) {
        //临时数组
        int[] tmp = new int[arr.length];
        int count = arr.length;
        //移除数据的数量
        int randCount = 0;
        //随机数下标
        int position = 0;
        int k = 0;
        while (randCount < count) {
            Random rand = new Random();
            //改变后的数组长度
            int r = count - randCount;
            position = rand.nextInt(r);
            tmp[k++] = arr[position];
            randCount++;
            arr[position] = arr[r - 1];
        }
        for (int i = 0; i < count; i++)
            arr[i] = tmp[i];
    }

    /**
     * 1.选择排序 时间复杂度 O(N^2)  不稳定
     */
    void insertionSort(int[] arr, String flag) {
        int tmp;
        if ("asc".equals(flag)) {
            for (int i = 1; i < arr.length; i++) {
                boolean isSourted = true;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        isSourted = false;
                    }
                    if (isSourted) {
                        continue;
                    }
                }
            }
        } else if ("desc".equals(flag)) {
            for (int i = 1; i < arr.length; i++) {
                boolean isSourted = true;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        isSourted = false;
                    }
                    if (isSourted) {
                        continue;
                    }
                }
            }
        }
    }


    /**
     * 2.快速排序 时间复杂度 O(NlogN)～O(N^2); 用到递归，使用主元来比较，分治思想 不稳定
     */
    void quickSort(int[] arr, int left, int right) {
        int center;
        if (left < right) {
            center = partition(arr, left, right);
            //左半部分
            quickSort(arr, left, center - 1);
            //右半部分
            quickSort(arr, center + 1, right);
        }
    }

    //返回主元的位置 必须先从左边开始遍历
    int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (true) {
            //向左遍历扫描
            while (i < j && pivot <= arr[j])
                j--;
            //向右遍历扫描
            while (i < j && pivot >= arr[i])
                i++;
            if (i >= j)
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

    /**
     * 3.希尔排序 时间复杂度 使用希尔增量时最坏为O(N^2); 希尔增量 arr.length/2
     * 使用Hibbard增量时最坏为O(N^3/2)       Hibbard增量 2^k - 1    缩减增量排序  不稳定
     */
    void shellSort(int[] arr) {
        int j;
        for (int gap = arr.length / 2; gap > 0; gap /= 2)//gap 增量值
            for (int i = gap; i < arr.length; i++) {
                int tmp = arr[i];
                for (j = i; j >= gap && tmp < arr[j - gap]; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = tmp;
            }
    }

    /**
     * 4.堆排序 时间复杂度O(nlogn)  不稳定
     */
    void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            //buildHeap
            perDown(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i > 0; i--) {   //deleteMax
            swapReferences(arr, 0, i);
            perDown(arr, 0, i);
        }
    }

    //移除堆顶元素
    void swapReferences(int[] arr, int i, int n) {
        int tmp;
        tmp = arr[n];
        arr[n] = arr[i];
        arr[i] = tmp;
    }

    //建造堆
    void perDown(int[] arr, int i, int n) {
        int child;
        int tmp;
        for (tmp = arr[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && arr[child] < arr[child + 1]) {
                child++;
            }
            if (tmp < arr[child]) {
                arr[i] = arr[child];
            } else break;
        }
        arr[i] = tmp;
    }

    int leftChild(int i) {
        return 2 * i + 1;
    }

    /**
     * 5.冒泡排序 最大时间复杂度 O(N^2) 稳定排序
     */
    void bubbleSort(int[] arr) {
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

    /**
     * 6.归并排序 时间复杂度 O(NlogN)
     * T(N) = 2T(N/2) + N
     * 分治思想 将大数组分解成N个小数组(直到每个数组中只有1个元素)，分别对N个数组进行排序再合并
     * 稳定排序
     */
    void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        splitArray(arr, tmp, 0, arr.length - 1);
    }

    //分割数组 原数组 临时数组 左指针 右指针
    void splitArray(int[] arr, int[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            splitArray(arr, tmp, left, center);
            splitArray(arr, tmp, center + 1, right);
            merge(arr, tmp, left, center + 1, right);
        }
    }

    //合并数组 原数组 临时数组 左指针 右指针 右边界
    void merge(int[] arr, int[] tmp, int leftPos, int rightPos, int rightEnd) {

        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (arr[leftPos] < arr[rightPos])
                tmp[tmpPos++] = arr[leftPos++];
            else
                tmp[tmpPos++] = arr[rightPos++];
        }

        while (leftPos <= leftEnd)
            tmp[tmpPos++] = arr[leftPos++];

        while (rightPos <= rightEnd)
            tmp[tmpPos++] = arr[rightPos++];

        for (int i = 0; i < numElements; i++, rightEnd--)
            arr[rightEnd] = tmp[rightEnd];
    }

    /**
     * 7.基数排序 使用ArrayList
     */


}
