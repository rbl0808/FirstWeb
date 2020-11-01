package ZXD_2018_4_1;
//二分查找

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {4, 5, 13, 15, 17, 23, 25, 54, 55, 56, 62, 64, 65, 76, 78, 97, 98, 99};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入你查找的数字");
//        int search = sc.nextInt();
//        sc.close();
//        System.out.println(search + "的位置在" + binarySearch(a, search));
        System.out.println(binarySearch(a, 16));

    }

    public static int binarySearch(int[] a, int search) {
        int left = 0;
        int right = a.length - 1;
        int mid = a.length / 2;
        if (search == a[mid])
            return mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (search < a[mid]) {
                right = mid - 1;
            }
            if (search > a[mid]) {
                left = mid + 1;
            }
            if (search == a[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
