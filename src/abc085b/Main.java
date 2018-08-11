package abc085b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/* かかった時間:7m55.059s */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/* 大きい順に鏡餅を積み重ねたときの高さ = 重複を除いたときの要素の数
		 * かなり単純化できた。
		 * HashSetでは重複する値をaddしようとしても無視されるので
		 * for文でaddを回したあとにsizeを調べれば良い */
		Set<Integer> d = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			d.add(sc.nextInt());
		}
		System.out.println(d.size());
	}
}