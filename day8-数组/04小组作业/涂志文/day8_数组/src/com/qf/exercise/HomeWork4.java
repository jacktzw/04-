package com.qf.exercise;

import java.util.Arrays;

public class HomeWork4 {
	public static void main(String[] args) {
//		4、定义一个数组，反序（不是排序）后输出。（一个数组完成）
		int [] arr= {1,2,3,4,5};   //0  4   1  3
		System.out.println(Arrays.toString(arr));  //异或运算 相同为0 不同为1 10 10 ---00
		for (int i = 0; i < arr.length; i++) {
					arr[i]=arr[i]^arr[arr.length-(i+1)];
					arr[arr.length-(i+1)]=arr[i]^arr[arr.length-(i+1)];
					arr[i]=arr[i]^arr[arr.length-(i+1)];
			
		}
		System.out.println(Arrays.toString(arr));
       
	}
}
