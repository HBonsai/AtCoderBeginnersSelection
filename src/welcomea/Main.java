package welcomea;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		// どうやらスペース区切りの入力でもきちんと判定されるらしい
		int b = sc.nextInt();
		int c = sc.nextInt();

		String s = sc.next();
		// 回答例では(a+b+c)
		System.out.println(a + b + c + " " + s);
	}
}
