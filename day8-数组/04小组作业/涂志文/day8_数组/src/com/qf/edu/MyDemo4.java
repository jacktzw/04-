package com.qf.edu;

import java.util.Arrays;

public class MyDemo4 {

	public static void main(String[] args) {
		int[] a=new int[5];
		Arrays.fill(a, 11); //�������䷽��
		System.out.println(Arrays.equals(a, a));
		System.out.println(Arrays.toString(a));
//		Arrays.binarySearch(a, key);
		//��ά����
		int arr[][]= {{5,8},{1,2,3},{5,6,8,9,4}};
		//ȡֵ
//		System.out.println(arr[2][3]);
		//����
		for (int i = 0; i < arr.length; i++) { //���Ϊ��
			System.out.println(Arrays.toString(arr[i]));
			/*
			 * for (int j = 0; j < arr[i].length; j++) { //�ڲ�Ϊ��
			 * System.out.print(arr[i][j]+","); }
			 */
			
//			System.out.println();
	   /*
	    * ��ά����Ĵ�����ʽ
	    */
			/*
			 * int [][]arr1; arr1=new int[10][5]; int [][]arr2=new int[5][5]; int
			 * [][]arr3=new int[5][]; arr3[0]=new int[3]; arr3[0][0]=5;
			 */
		}
	}

}
