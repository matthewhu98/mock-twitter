package com.personalproject.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.personalproject.model.Tweet;



@Service
public class TweetSqlDAO implements TweetDAO {
	
	private JdbcTemplate jdbcTemplate;
	
    public TweetSqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

	@Override
	public List<Tweet> getAllTweets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tweet getSingleTweet() {
		Tweet tweet;
//		String sqlGetSingleTweet =
		return null;
	}
	
	private Tweet mapRowToTweet(SqlRowSet rs) {
		Tweet tweet = new Tweet();
		tweet.setAccount_id(rs.getInt("account_id"));
		tweet.setTweet_content(rs.getString("tweet_content"));
		tweet.setTweet_id(rs.getLong("tweet_id"));
		tweet.setDate_of_tweet(rs.getDate("date_of_tweet"));
		return tweet;
	}

}
