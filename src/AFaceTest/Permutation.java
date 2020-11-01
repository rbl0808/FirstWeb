package AFaceTest;

public class Permutation {
    //递归
    public void arrange(char[] a, int begin, int end) {
        if (end <= 1) return;
        else if (begin == end) {
            for (int i = 0; i < a.length; i++)
                System.out.print(a[i]);
            System.out.println();
        } else if (begin < end) {
            for (int i = begin; i <= end; i++) {
                //去重
                if (isAgain(a, i)) {
                    //交换
                    swap(a, i, begin);
                    arrange(a, begin + 1, end);
                    swap(a, i, begin);
                }
            }
        }
    }

    //交换数组m位置和n位置上的值
    public void swap(char[] a, int m, int n) {
        char temp = a[m];
        a[m] = a[n];
        a[n] = temp;

    }

    //查重
    public Boolean isAgain(char[] a, int m) {
        for (int i = m; i < a.length - 1; i++) {
            if (a[m] == a[++i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        String a = "234g";
        char[] arraya = a.toCharArray();
        permutation.arrange(arraya, 0, arraya.length - 1);

    }
}