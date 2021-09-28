package com.white;

public class caculate {
	boolean check = true;

	public caculate(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				check = false;
			}
		}
	}
}
