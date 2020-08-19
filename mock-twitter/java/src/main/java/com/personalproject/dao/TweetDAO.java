package com.personalproject.dao;

import java.util.List;

import com.personalproject.model.Tweet;

public interface TweetDAO {
	
	public List<Tweet> getAllTweets();
	
	public Tweet getSingleTweet();

}
