package com.qf.edu;

import java.util.Arrays;

public class MyDemo4 {

	public static void main(String[] args) {
		int[] a=new int[5];
		Arrays.fill(a, 11); //数组的填充方法
		System.out.println(Arrays.equals(a, a));
		System.out.println(Arrays.toString(a));
//		Arrays.binarySearch(a, key);
		//二维数组
		int arr[][]= {{5,8},{1,2,3},{5,6,8,9,4}};
		//取值
//		System.out.println(arr[2][3]);
		//遍历
		for (int i = 0; i < arr.length; i++) { //外层为行
			System.out.println(Arrays.toString(arr[i]));
			/*
			 * for (int j = 0; j < arr[i].length; j++) { //内层为列
			 * System.out.print(arr[i][j]+","); }
			 */
			
//			System.out.println();
	   /*
	    * 二维数组的创建方式
	    */
			/*
			 * int [][]arr1; arr1=new int[10][5]; int [][]arr2=new int[5][5]; int
			 * [][]arr3=new int[5][]; arr3[0]=new int[3]; arr3[0][0]=5;
			 */
		}
	}

}
