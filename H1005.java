package HDUOJ;

import java.util.Scanner;

// f(1) = 1, f(2) = 1, f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7.
public class H1005 {
	static int a, b ,n, ans;
	static int[] rec = new int[1000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rec[1] = 1;
		rec[2] = 1;
		while ((a = sc.nextInt()) != 0 && (b = sc.nextInt()) != 0 && (n = sc.nextInt()) != 0) {
			for (int i = 3; i < 49; i++) {
				rec[i] = (a * rec[i - 1]  + b * rec[i - 2] ) % 7;
			}
			System.out.println(rec[n % 49]);
        }
        sc.close();
	}
}

