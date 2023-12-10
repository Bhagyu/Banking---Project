package com.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int CustomerAccountNo;
	private String CustomerName;
	private String CustomerAddress;
	private int Id;
	private String Password;
	private double Money;
	private String AccountType;

	public List getTransactionHistory() {
		return TransactionHistory;
	}

	public void setTransactionHistory(List transactionHistory) {
		TransactionHistory = transactionHistory;
	}

	private List TransactionHistory = new ArrayList();

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public int getCustomerAccountNo() {
		return CustomerAccountNo;
	}

	public void setCustomerAccountNo(int customerAccountNo) {
		CustomerAccountNo = customerAccountNo;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public double getMoney() {
		return Money;
	}

	public void setMoney(double money) {
		Money = money;
	}

	public List getTransactionHistory1() {
		// TODO Auto-generated method stub
		return null;
	}
}
