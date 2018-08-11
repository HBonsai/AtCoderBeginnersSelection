package abc085c;

import java.util.Scanner;

/* かかった時間:22m2.325s TLE */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt(); // お札の数
		final int Y = sc.nextInt(); // 合計金額

		for (int x = 0; x <= Y/10000; x++) {
			for (int y = 0; y <= (Y - 10000 * x)/5000; y++) {
				for (int z = 0; z <= (Y - 10000 * x - 5000 * y)/1000 ; z++) {
					if ((10000*x + 5000*y + 1000*z) == Y && (x+y+z) == N) {
						System.out.println(x + " " + y + " " + z);
						return;
					};
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}
