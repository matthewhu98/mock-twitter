package com.personalproject.dao;

import java.util.List;

import com.personalproject.model.Account;

public interface AccountDAO {
	
	public List<Account> getAllAccounts();
	
	public Account getSingleAccount();

}
