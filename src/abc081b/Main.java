package abc081b;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		// nextIntは半角スペースで受け取っても普通によしなにしてくれるらしい
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// 奇数が出るまで割る
		int count = 0;
		loop: while (true) {
			for (int i = 0; i < a.length; i++) {
				if (a[i]%2 ==1) {
					break loop; // 奇数にぶち当たったら抜ける
				}
				a[i] = a[i]/2; // 再格納
			}
			count++;
		}
		System.out.println(count);
	}
}
