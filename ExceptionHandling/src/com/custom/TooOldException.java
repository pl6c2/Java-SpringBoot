package com.custom;

// recommended to use unchecked excpetion like runtimeexception
public class TooOldException extends RuntimeException {

	public TooOldException(String s) {
		super(s);
	}
}
