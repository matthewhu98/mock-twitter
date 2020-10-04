package com.personalproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.personalproject.model.Account;

@Service
public class AccountSqlDAO implements AccountDAO{
	
	private JdbcTemplate jdbcTemplate;
	
    public AccountSqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


	@Override
	public List<Account> getAllAccounts() {
		List<Account> accounts = new ArrayList<>();
		String sql = "SELECT * FROM accounts";
		SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);
		while (rs.next()) {
			Account account = mapRowToAccount(rs);
			accounts.add(account);			
		}		// TODO Auto-generated method stub
		return accounts;
	}

	@Override
	public Account getSingleAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Account mapRowToAccount(SqlRowSet rs) {
		Account account = new Account();
		account.setAccount_id(rs.getLong("account_id"));
		account.setUser_id(rs.getInt("user_id"));
		account.setUsername(rs.getString("username"));
		account.setAccountname(rs.getString("accountname"));
		
		return account;
	}

}
