/**
 * Created by dangge on 2016/3/13.
 * ASCII排序问题
 */

import java.util.Scanner;

public class ASCIIsort {
    public static void main(String args[]){
        char[] order = new char[3];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数 N ");
        int N = input.nextInt();
        String[] st = new String[N];
        for (int index = 0;index < N;index++){
            System.out.println("请输入" + index +"行");
            st[index] = input.next();
        }
        for(int index = 0; index < N; index++){
            char[] out = new char[3];
            out = order(st[index]);
            for (int i = 0;i <3; i++){
                System.out.println(out[i]+" ");
            }
            System.out.print('\n');

        }
    }
    public static char[] order(String str){
        char[] ch = str.toCharArray();
        return ch;
    }
}
