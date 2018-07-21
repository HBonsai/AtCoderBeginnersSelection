package abc087b;

import java.util.Scanner;
/** 解くのにかかった時間:約30分（コミット履歴より） */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 500円玉
		int b = sc.nextInt(); // 100円玉
		int c = sc.nextInt(); // 50円玉
		int x = sc.nextInt(); // 合計金額 50-20000

		// 答え:合計金額がXになる方法はresult通り
		// 500A + 100B + 50C = X
		// 解くべき問題が間違っていた。まずすべての通りの合計金額を出し、それからXで絞り込めばいい。
		int count = 0;
		for (int ai = 0; ai <= a; ai++) {
			for (int bi = 0; bi <= b; bi++) {
				for (int ci = 0; ci <= c; ci++) {
					int sum = ai * 500 + bi * 100 + ci * 50;
					if (sum == x) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
