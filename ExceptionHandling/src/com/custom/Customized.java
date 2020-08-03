package com.custom;

public class Customized {

	public static void main(String[] args) {
		
		int age=70;
		if(age<18)
		{
			throw new TooYoungException("wait for some years you are too young so use internet");
		}

		if(age>60)
		{
			throw new TooOldException("you are too old man go to strip");
		}
	}

}
