package com.qf.edu;

public class MyDemo5 {

	public static void main(String[] args) {
		// 打印10行10列的杨辉三角
		int [][]arr=new int[10][];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new int[i+1];
			for (int j = 0; j <= i; j++) {
				if(j==0||j==i) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
