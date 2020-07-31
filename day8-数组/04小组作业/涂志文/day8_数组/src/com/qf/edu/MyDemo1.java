package com.qf.edu;
/**
 * 
 * @author tzw  
 * @date 2020年7月29日
 * <p>Description: </p>
 */
public class MyDemo1 {
	public static void main(String[] args) {
		/*
		 * String[] arr= {"3434","34343"}; String[] arr1=null;
		 */
		String name="张三";
		print(name);
	}
	public static void print(String name,String... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(name);
	}
}
