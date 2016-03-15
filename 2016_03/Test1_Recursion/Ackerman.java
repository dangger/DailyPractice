package Test1_Recursion;

import java.util.Scanner;

/**
 * Created by dangge on 2016/3/13.
 * solve Ackerman problem by using recursion.
 */
public class Test3 {
	public static int judge(int n, int m) {
		if (n == 1 && m == 0) {
			return 2;
		} else if (n == 0) {
			return 1;
		} else if (m == 0) {
			return n + 2;
		} else
			return judge(judge(n - 1, m), m - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input n");
		int n = scanner.nextInt();
		System.out.println("please input m");
		int m = scanner.nextInt();
		if (n < 0 || m < 0 || m >= 4) {
			System.out.println("input error!");
		} 
		else {
			int result = judge(n, m);
			System.out.println("the result is " + result);
		}
	}

}

