package com.qf.edu;

import java.util.Arrays;

/**
 * 
 * @author tzw
 * @date 2020��7��29��
 *       <p>
 *       Description:
 *       </p>
 */
public class MyDemo3 {

	public static void main(String[] args) {
		// ѡ������

		int[] arr = { 44, 23, 88, 56, 64, 98 };
		// ������Сֵ
		for (int i = 0; i < arr.length; i++) { //��ѡ����
			int min = arr[i]; //��ָ����ǰ�ֵ�һ����Сֵ
			int index = -1;  //ָ��һ�������ڵ��±�
			for (int j = i+1;  j< arr.length; j++) {
				//�����˵�ǰ�ֵĵ�һ�������������������ѭ��������һ�����ִ���̨����ʽѡ����Сֵ
				if (arr[j] < min) {
					min = arr[j];//���浱ǰ��Сֵ
					index = j;
				}
			}
			if (index != -1) {
				arr[i] = arr[i] ^ arr[index];
				arr[index] = arr[i] ^ arr[index];
				arr[i] = arr[i] ^ arr[index];
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
