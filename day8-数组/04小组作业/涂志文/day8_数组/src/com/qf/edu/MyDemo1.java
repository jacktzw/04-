package com.qf.edu;
/**
 * 
 * @author tzw  
 * @date 2020��7��29��
 * <p>Description: </p>
 */
public class MyDemo1 {
	public static void main(String[] args) {
		/*
		 * String[] arr= {"3434","34343"}; String[] arr1=null;
		 */
		String name="����";
		print(name);
	}
	public static void print(String name,String... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(name);
	}
}
