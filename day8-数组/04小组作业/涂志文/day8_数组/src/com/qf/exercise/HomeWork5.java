package com.qf.exercise;

import java.util.Arrays;

public class HomeWork5 {
	public static void main(String[] args) {
//		5���Զ���һ��5x5��С�Ķ�ά���飬�������100����25�������������д���ƽ����������֮�ͣ���ͳ����������
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
		System.out.println("���ɵ��������Ϊ:");
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
		System.out.println("��������֮��Ϊ:"+sum+" ƽ����Ϊ: "+avg);
		System.out.println("����ƽ����֮��Ϊ: "+sum1+" ����Ϊ:"+count);
	}
}
