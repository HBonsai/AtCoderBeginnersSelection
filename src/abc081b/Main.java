package abc081b;

import java.util.Scanner;
/** かかった時間:28m8.376s  */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// ググった:「int 配列 java」 配列の宣言があやふや
		// https://www.javadrive.jp/start/array/index2.html
		int a[] = new int[n];

		// nextIntは半角スペースで受け取っても普通によしなにしてくれるらしい
		// （sysoutで実験して確かめた)
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		// 奇数が出るまで割る
		int count = 0;

		// ググった:「for文 抜ける java」
		// breakのラベリング https://www.javadrive.jp/start/break/index3.html
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
