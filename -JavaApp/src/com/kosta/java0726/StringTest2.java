package com.kosta.java0726;

public class StringTest2 {
	public static void main(String[] args) {
		// ����1 ) str�ȿ� ���� ������ ������ ����Ͻÿ�
		String str = "09JavaPro8grammi5ng";
		// 0~9 = 48 ~ 57 = �ƽ�Ű�ڵ�

		byte b[] = str.getBytes();

		int count = 0;

		for (int i = 0; i < b.length; i++) {
			if ((b[i] >= 48) && (b[i] <= 57)) {
				count++;
			}
		}
		System.out.println("���� : " + count);

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) // str.length(��ü ���ڿ��� ���̸�ŭ �ݺ�)
		{
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				cnt++;
			}
		}
		System.out.println("���� : " + cnt);

		// ����2 ) tel1 = "010"; , tel2 = "1234"; , tel3 = "4567";
		// - =77
		// subString, indexof, charat
		String tel = "010-1234-4567";
		// �ε��� 0123456789012
		// ����2 ) tel1 = "010"; , tel2 = "1234"; , tel3 = "4567";
		// 012 4567 9012

		String tel1 = tel.substring(0, tel.indexOf('-'));
		String tel2 = tel.substring(tel.indexOf('-') + 1, tel.indexOf('-', tel.indexOf('-') + 1));
		String tel3 = tel.substring(tel.lastIndexOf('-') + 1);

		System.out.println("tel1 :" + tel1);
		System.out.println("tel2 :" + tel2);
		System.out.println("tel3 :" + tel3);

		// Ǯ��))
		String telNum = "010-1234-4567";

		int idx1 = tel.indexOf('-');
		int idx2 = tel.lastIndexOf('-');

		String tel4 = tel.substring(0, idx1);
		String tel5 = tel.substring(idx1 + 1, tel.indexOf('-', idx1 + 1));
		String tel6 = tel.substring(idx2 + 1);

		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);

		System.out.println(tel4 + tel5 + tel6);

	}

}
