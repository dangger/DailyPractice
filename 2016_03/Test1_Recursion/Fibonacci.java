/**
 * Created by dangge on 2016/3/13.
 * Solve Fibonacci problem by using recursion.
 */
package Test1_Recursion;
import java.util.Scanner;

public class Test2 {
	public static int judge(int n) {
		int result = 1;
		if (n <= 1) {
			return result;
		} else {
			return judge(n - 1) + judge(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input n");
		int n = scanner.nextInt();
		if (n < 0) {
			System.out.println("input error!");
		} else {
			int result = judge(n);
			System.out.println("the result is " + result);
		}

	}
}
