package abc081a;

import java.util.Scanner;

/** かかった時間:22m15.922s */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		// わからなかったのでググった
		// https://blanktar.jp/blog/2015/11/java-charactor-count.html
		char[] chars = str.toCharArray();

		int marble = 0;
		for (char c : chars) {
			if (c == '1') {
				marble++;
			}
		}
		System.out.println(marble);
	}
}
