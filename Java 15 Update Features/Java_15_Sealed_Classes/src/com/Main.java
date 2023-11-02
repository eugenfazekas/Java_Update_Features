package com;

sealed class Account
	permits CurrentAccount, SavingAccount, LoanAccount {
	}

final class CurrentAccount extends Account {}
non-sealed class SavingAccount extends Account {}
sealed class LoanAccount extends Account permits HomeloanAccount, AutoloanAccount {}

final class HomeloanAccount extends LoanAccount{}
final class AutoloanAccount extends LoanAccount{}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
