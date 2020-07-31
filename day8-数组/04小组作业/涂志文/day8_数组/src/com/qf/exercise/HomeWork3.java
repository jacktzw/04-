package com.qf.exercise;

import java.util.Arrays;

public class HomeWork3 {
	public static void main(String[] args) {
//		3、定义一个数组，随机生成100以内的10个数字，使用Arrays类排序，打印出排序后的数组。
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = HomeWork1.getRandom();
		}
		System.out.println("随机生成的数据为:" + Arrays.toString(arr));
		//使用jdk内置方法排序
//        Arrays.sort(arr);
		  Arrays.parallelSort(arr);
	    System.out.println("排序后的数组为:"+Arrays.toString(arr));
	}
}
