/*
 * 1. for 3��ø
 * 2. scanner�� ����� \n���� �����ϱ� ������ 
 * "3 ABC"�� �Է��ϰ��� �Ѵٸ� 2���� scanner��
 * 3�� ������ ABC�� ���ڿ��� �Է��� ���� �� �ִ�.
 */

package Baekjoon.Chap07;

import java.util.Scanner;

public class chap07_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < max; i++) {
			int ffor = sc.nextInt();
			String str = sc.nextLine();

			str = str.replaceAll(" ", "");

			for (int j = 0; j < str.length(); j++) {
				for (int z = 0; z < ffor; z++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
