package abc086a;

import java.util.Scanner;

/** かかった時間 real	1m30.060s */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a b 整数を受け付ける 1≤ a,b ≤ 10000
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a * b;
		String result = "";
		if (c%2 == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}
		System.out.println(result);
	}
}
