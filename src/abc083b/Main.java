package abc083b;

import java.util.Scanner;

/** かかった時間:おおよそ30分 */

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		/* ググった:桁数の取り出し方　http://tech.pjin.jp/blog/2015/10/27/%E7%B6%9A%E3%83%BB%E3%81%A8%E3%81%A3%E3%81%A6%E3%82%82%E3%82%8F%E3%81%8B%E3%82%8A%E3%82%84%E3%81%99%E3%81%84java%E3%80%80%E3%80%90%E7%AC%AC%EF%BC%92%EF%BC%92%E5%9B%9E%E3%80%80%E5%9E%8B%E5%A4%89/ */
		int total_sums = 0;
		for (int i = 1; i <= n; i++) {
			int fifth = i/10000;
			int forth = (i%10000)/1000;
			int third = (i%1000)/100;
			int second = (i%100)/10;
			int first = i%10;
			int total_digits = fifth + forth + third + second + first;
			if (total_digits >= a && total_digits <= b) {
				total_sums += i;
			}
		}
		System.out.println(total_sums);
	}
}
