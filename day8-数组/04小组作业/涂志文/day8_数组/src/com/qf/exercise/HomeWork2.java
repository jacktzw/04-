package com.qf.exercise;

import java.util.Arrays;

public class HomeWork2 {
	public static void main(String[] args) {
//		2、定义一个数组，随机生成100以内的10个数字，并进行选择排序，打印出排序后的数组。
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = HomeWork1.getRandom();
		}
		System.out.println("随机生成的数据为:" + Arrays.toString(arr));
		chooseSwap(arr);//引用类型传递的话值会改变
	    System.out.println("排序后的数组为:"+Arrays.toString(arr));


	}
	public static void chooseSwap(int...arr) {
		for (int i = 0; i < arr.length; i++) {
			int index=-1;
			int min=arr[i]; //定义起始位置
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<min) {
					min=arr[j]; //获取最小值
					index=j; //获得最小值的下标
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
