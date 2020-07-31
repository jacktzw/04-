package com.qf.exercise;

import java.util.Arrays;

public class HomeWork5 {
	public static void main(String[] args) {
//		5、自定义一个5x5大小的二维数组，随机生成100以内25个数，计算所有大于平均数的数字之和，并统计其数量。
		int[][] arr=new int[5][5];
		int sum=0;
		double avg;
		int count=0;
		int sum1=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j]=HomeWork1.getRandom();
				sum+=arr[i][j];
			}
		}
		avg=sum/25;
		System.out.println("生成的随机数组为:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[j][i]>avg) {
					sum1+=arr[j][i];
					count++;
				}
			}
		}
		System.out.println("数组数字之和为:"+sum+" 平均数为: "+avg);
		System.out.println("大于平均数之和为: "+sum1+" 个数为:"+count);
	}
}
