package com.qf.exercise;

import java.util.Arrays;

public class HomeWork3 {
	public static void main(String[] args) {
//		3������һ�����飬�������100���ڵ�10�����֣�ʹ��Arrays�����򣬴�ӡ�����������顣
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = HomeWork1.getRandom();
		}
		System.out.println("������ɵ�����Ϊ:" + Arrays.toString(arr));
		//ʹ��jdk���÷�������
//        Arrays.sort(arr);
		  Arrays.parallelSort(arr);
	    System.out.println("����������Ϊ:"+Arrays.toString(arr));
	}
}
