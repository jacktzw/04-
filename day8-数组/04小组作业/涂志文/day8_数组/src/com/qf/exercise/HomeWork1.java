package com.qf.exercise;

import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {
	public static void main(String[] args) {
//		1������һ�����飬�������100���ڵ�10�����֣�������ð�����򣬴�ӡ�����������顣
		int [] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=getRandom();
		}
       System.out.println("������ɵ�����Ϊ:"+Arrays.toString(arr));
       //���������ݽ���ð������
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if(arr[j]>arr[j+1]) {
				arr[j]=arr[j]^arr[j+1];
				arr[j+1]=arr[j]^arr[j+1];
				arr[j]=arr[j]^arr[j+1];
				
			}
		}
	}
       System.out.println("����������Ϊ:"+Arrays.toString(arr));

	}
	public static int  getRandom() {
		int num=0;
		Random random=new Random();
		num=random.nextInt(100);
		return num;
	}
	
}
