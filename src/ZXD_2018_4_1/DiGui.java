package ZXD_2018_4_1;

import java.util.Scanner;

//一共n阶台阶 每次上1阶或者2阶 一共有多少种上法
public class DiGui {
    int f(int n){
        if(n > 0){
            if(n == 1) return 1;
            if(n == 2) return 2;
            else return f(n-1)+f(n-2);
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入总共的台阶数");
        int n =sc.nextInt();
        sc.close();
       // int n = 4;
        DiGui D = new DiGui();
        int a = D.f(n);
        System.out.println("一共有" + a + "种上法");
    }
}
