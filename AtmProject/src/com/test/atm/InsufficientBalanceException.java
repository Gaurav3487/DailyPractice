package com.test.atm;

public class InsufficientBalanceException extends RuntimeException {
	
	public InsufficientBalanceException(String msg) {
		
		super(msg);
	}

}
