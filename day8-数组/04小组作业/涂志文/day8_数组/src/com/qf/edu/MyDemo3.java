package com.qf.edu;

import java.util.Arrays;

/**
 * 
 * @author tzw
 * @date 2020年7月29日
 *       <p>
 *       Description:
 *       </p>
 */
public class MyDemo3 {

	public static void main(String[] args) {
		// 选择排序

		int[] arr = { 44, 23, 88, 56, 64, 98 };
		// 保存最小值
		for (int i = 0; i < arr.length; i++) { //挑选几轮
			int min = arr[i]; //先指定当前轮的一个最小值
			int index = -1;  //指定一个不存在的下标
			for (int j = i+1;  j< arr.length; j++) {
				//将除了当前轮的第一个数字以外的其他数字循环，跟第一个数字打擂台的形式选出最小值
				if (arr[j] < min) {
					min = arr[j];//保存当前最小值
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
