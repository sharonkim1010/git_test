package main;

import java.util.Scanner;

import login.Login;
import member.Member;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("main ����");
		// kim - �α��� ���� ��� ���弼��
		// cho - ȸ�� ���� ��� ���弼��
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. �α��� 2. ȸ������");
			num = sc.nextInt();
			switch(num) {
				case 1:
					Login lo = new Login();
					lo.login();
					break;
				case 2:
					Member m = new Member();
					m.member();
					break;
			}
		}
	}
}
