package com.qf.exercise;

import java.util.Arrays;

public class HomeWork2 {
	public static void main(String[] args) {
//		2������һ�����飬�������100���ڵ�10�����֣�������ѡ�����򣬴�ӡ�����������顣
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = HomeWork1.getRandom();
		}
		System.out.println("������ɵ�����Ϊ:" + Arrays.toString(arr));
		chooseSwap(arr);//�������ʹ��ݵĻ�ֵ��ı�
	    System.out.println("����������Ϊ:"+Arrays.toString(arr));


	}
	public static void chooseSwap(int...arr) {
		for (int i = 0; i < arr.length; i++) {
			int index=-1;
			int min=arr[i]; //������ʼλ��
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<min) {
					min=arr[j]; //��ȡ��Сֵ
					index=j; //�����Сֵ���±�
				}
			}
			if(index!=-1) {
				arr[i]=arr[i]^arr[index];
				arr[index]=arr[i]^arr[index];
				arr[i]=arr[i]^arr[index];
			}
		}
	}
}
