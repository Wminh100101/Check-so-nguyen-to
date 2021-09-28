package com.white;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Xin mời nhập số cần kiểm tra:");
		int a = sc.nextInt();
		caculate ca = new caculate(a);
		if (ca.check) {
			System.out.print(a + " là số nguyên tố");
		} else {
			System.out.print(a + " không phải là số nguyên tố");
		}
	}

}
