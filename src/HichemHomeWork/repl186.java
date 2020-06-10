package HichemHomeWork;

import java.util.*;

public class repl186 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		
		
		
		for (int i = 2; i < 100; i++) {
			if (isPrime(i)) {
				list.add(i);
			}

		}
		System.out.println(list);
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
}
