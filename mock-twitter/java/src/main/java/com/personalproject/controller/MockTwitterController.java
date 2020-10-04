package com.personalproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.personalproject.dao.AccountDAO;
import com.personalproject.dao.TweetDAO;
import com.personalproject.model.Account;
import com.personalproject.model.Tweet;

@RestController
@CrossOrigin
public class MockTwitterController {
	
	private AccountDAO accountDao;
	private TweetDAO tweetDao;
	
	public MockTwitterController(AccountDAO accountDao, TweetDAO tweetDao) {
		this.accountDao = accountDao;
		this.tweetDao = tweetDao;
	}
	
	
	@RequestMapping(path = "/accounts", method = RequestMethod.GET)
	public List<Account> getAllAccounts() {		
		return accountDao.getAllAccounts();
	}
	
	@RequestMapping(path = "/homefeed", method = RequestMethod.GET)
	public List<Tweet> getAllTweets() {
		return tweetDao.getAllTweets();
	}

}
