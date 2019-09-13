package ZXD_2018_4_1;

import java.util.Scanner;
public class JiMu {
    public static void main(String[] args){
        /**
         * 小明要移动n堆积木,初始每堆积木数量不一致,移动完后要使每堆的积木数量变成一样,要移动几块积木才行
         * @param n 积木的堆数
         * @param b[] 每堆的积木数量
         * @param avg 平均每堆的积木数量
         * @param move 移动的积木数量
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入积木的堆数");
        int n = sc.nextInt();
        int[] b =new int[n];
        int move = 0,avg = 0,i = 0,num = 0,a = 0;
        System.out.println("输入每堆的积木数");
        while (sc.hasNext()){
            b[i++] = sc.nextInt();
            if(i == n) break;
        }
        for(int l = 0;l<b.length;l++){
            num += b[l];
        }
        avg = num / n;
        if(num % n != 0) System.out.println("积木数量不对,请重新输入,积木总数应为" + n +"的整数倍");
        for(int l = 0;l<b.length;l++){
            if(b[l] > avg)
            {a = b[l] - avg;
            move = move + a;}
        }
        System.out.println("总用需要移动的积木数量" + move);
        sc.close();
    }
}
