package com.test;

public class TestException {
	public static void main(String[] args) throws Exception{
		try {
			int i=5/0;
			if(i==0){
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("Hello");
			e.printStackTrace();
		}
	}
}
