package Test1_Recursion;

import java.util.Scanner;

/**
 * Created by dangge on 2016/3/13.
 * solve Ackerman problem by using recursion.
 */
public class Ackerman {
    public static int judge(int n,int m){
        int r,g;
        if(n == 1&&m == 0)
            r = 2;
        else if(n == 0&&m >=0)
            r = 1;
        else if(m == 1)
            r = n * 2;
        else if(m == 2)
            r = (int)Math.pow(2,n);

        else if(m == 0&& n >=2)
            r=n + 2;
        else {
            g = judge(n-1,m);
            r = judge(g,m-1);
        }
        return r;
    }
    public static void main(String args[]){
        System.out.println("请输入n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("请输入m");
        int m = scanner.nextInt();
        System.out.println(judge(n,m));
    }
}
