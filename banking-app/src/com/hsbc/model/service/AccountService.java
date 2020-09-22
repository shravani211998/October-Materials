package com.hsbc.model.service;

import com.hsbc.exception.AccountNotFoundException;
import com.hsbc.model.beans.Account;

public interface AccountService {
	public Account createAccount(Account account); 
	public Account getAccountById(int accountNumber) throws AccountNotFoundException;
	// use throws InsufficientBalanceException, AccountNotFoundException
	public void transfer(int from, int to, double amount);
}
