package com.qf.edu;

import java.util.Arrays;

public class MyDemo2 {

	public static void main(String[] args) {
		//选择排序
		int [] arr= {44,23,88,56,64,98};
		//保存最小值
		int min=arr[0];
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
				index=i;
			}
		}
		if(index!=-1) {
			arr[0]=arr[0]^arr[index];
			arr[index]=arr[0]^arr[index];
			arr[0]=arr[0]^arr[index];
		}
		System.out.println(Arrays.toString(arr));
	}

}
