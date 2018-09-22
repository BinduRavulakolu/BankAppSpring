package com.capgemini.bankapp.service;

import com.capgemini.bankapp.exception.LowBalancException;

public interface BankAccountService {

	public double getBalance(long accountId);

	public double withdraw(long accountId, double amount) throws LowBalancException;

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalancException;

	public double deposit(long accountId, double amount);
}