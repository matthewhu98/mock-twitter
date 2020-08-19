package com.personalproject.model;

import java.sql.Date;

public class Tweet {
	
	private Long tweet_id;
	private int account_id;
	private String tweet_content;
	private Date date_of_tweet;


	
	//getters and setters
	public Long getTweet_id() {
		return tweet_id;
	}
	public void setTweet_id(Long tweet_id) {
		this.tweet_id = tweet_id;
	}
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public String getTweet_content() {
		return tweet_content;
	}
	public void setTweet_content(String tweet_content) {
		this.tweet_content = tweet_content;
	}
	public Date getDate_of_tweet() {
		return date_of_tweet;
	}
	public void setDate_of_tweet(Date date_of_tweet) {
		this.date_of_tweet = date_of_tweet;
	}
	
	

}
