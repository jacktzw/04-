package com.qf.exercise;

import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {
	public static void main(String[] args) {
//		1、定义一个数组，随机生成100以内的10个数字，并进行冒泡排序，打印出排序后的数组。
		int [] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=getRandom();
		}
       System.out.println("随机生成的数据为:"+Arrays.toString(arr));
       //对数组数据进行冒泡排序
       for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if(arr[j]>arr[j+1]) {
				arr[j]=arr[j]^arr[j+1];
				arr[j+1]=arr[j]^arr[j+1];
				arr[j]=arr[j]^arr[j+1];
				
			}
		}
	}
       System.out.println("排序后的数组为:"+Arrays.toString(arr));

	}
	public static int  getRandom() {
		int num=0;
		Random random=new Random();
		num=random.nextInt(100);
		return num;
	}
	
}
