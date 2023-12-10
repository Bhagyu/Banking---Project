package com.operation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.model.Account;

public class Operation {

	Account ac = new Account();
	private List AccountTypes = new ArrayList();

	public void setAccountTypes(String accountTypes) {
		AccountTypes.add(accountTypes);
	}

	Scanner sc = new Scanner(System.in);

	public void createAcc() {
		// while (true) {
		while (true) {
			while (true) {

				System.out.println("Enter account number");
				try {
					Scanner sc1 = new Scanner(System.in);

					ac.setCustomerAccountNo(sc1.nextInt());
					break;
				} catch (InputMismatchException e) {
					System.out.println("Enter Integer type Account number");
				}
			}

			Iterator i = AccountTypes.iterator();

			System.out.println("\nAvailable account types : ");
			while (i.hasNext()) {
				System.out.println(i.next());
			}

			System.out.println("\nEnter Account Type");
			try {

				Scanner sc = new Scanner(System.in);
				ac.setAccountType(sc.next());
				if (AccountTypes.contains(ac.getAccountType())) {
					break;
				}

			} catch (Exception e) {
				System.out.println("Account Type should be String type");
			}
		}
		System.out.println("Enter customer name");
		ac.setCustomerName(sc.next());

		System.out.println("Enter customer address");
		ac.setCustomerAddress(sc.next());

		System.out.println("Enter customer id");
		ac.setId(sc.nextInt());

		System.out.println("Enter password");
		ac.setPassword(sc.next());

		System.out.println("Enter Deposited money");
		double Money = sc.nextDouble();

		if (Money <= 1000) {
			ac.setMoney(Money);
			System.out.println("Account created as a saving");
			// break;
		} else if (Money <= 2000) {

			System.out.println("Account Created as regular");

		} else {
			System.out.println("Account created as Temporary");

		}
		ac.getTransactionHistory().add("Account has been created now you can do transaction");
		// }

	}

	public void showAccDetail() {
		while (true) {
			System.out.println("Enter Account number");
			try {

				// Scanner sc3 = new Scanner(System.in);
				int x = sc.nextInt();

				if (ac.getCustomerAccountNo() == x) {
					System.out.println("Customer name :" + ac.getCustomerName());

					System.out.println("Customer address :" + ac.getCustomerAddress());

					System.out.println("Custmoer id :" + ac.getId());

					System.out.println("Password :" + ac.getPassword());

					System.out.println("Money :" + ac.getMoney());
					break;
				} else {
					System.out.println("Account number does not match");
				}
			} catch (InputMismatchException a) {
				System.out.println("Account number should be digits only");
			}
		}
	}

	public void depositeMoney() {
		System.out.println("Enter Account number");
		int y = sc.nextInt();

		if (ac.getCustomerAccountNo() == y) {
			System.out.println("Enter the Amount you want to Deposite");
			double depositedmoney = sc.nextDouble();

			if (depositedmoney > 0) {
				double totalmoney = ac.getMoney() + depositedmoney;
				System.out.println("total amount is :" + totalmoney);
				ac.getTransactionHistory()
						.add("deposited money is:" + totalmoney + "\n Before depositing Balance" + ac.getMoney());
			} else {
				System.out.println("Amount should be in double type");
			}
		}
	}

	public void withdrawMoney() {

		System.out.println("Enter Account number");
		int z = sc.nextInt();

		if (ac.getCustomerAccountNo() == z) {
			System.out.println("Enter the Amount you want to withdraw");
		}
		double cashwithdrawal = sc.nextDouble();
		if (ac.getMoney() >= cashwithdrawal) {
			double BalanceAfterWithdrawal = ac.getMoney() - cashwithdrawal;
			System.out.println("Balance After Withdrawal" + BalanceAfterWithdrawal);
			ac.getTransactionHistory().add(
					"withdrwal Amount is:" + BalanceAfterWithdrawal + "\nAfter withdraw Amount is" + ac.getMoney());
		} else {
			System.out.println("Your Balance should be less than deposited Amount ");
		}

	}

	public void updateAccount() {
		try {
			System.out.println("Enter Account number");
			int acc = sc.nextInt();
			if (ac.getCustomerAccountNo() == acc) {
				System.out.println("Enter Account Holder Name ");
				String s = sc.next();
				ac.setCustomerName(s);
				System.out.println("Account Holder Name Updated Succesfully");

			} else {
				System.out.println("Enter Correct Account Number");
			}
		} catch (Exception e) {
			System.out.println("Enter Integer type Account Number");
		}
	}

	public void TransactionHistory() {
		System.out.println("Enter Account Number");
		int z = sc.nextInt();
		if (ac.getCustomerAccountNo() == z) {
			System.out.println("Transaction history ");
		} else {
			System.out.println("Account number does not match");
		}
		Iterator it = ac.getTransactionHistory().iterator();
		while (it.hasNext()) {
			Object next = it.next();
			System.out.println(next);
		}
	}

}
