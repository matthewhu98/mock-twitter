
DROP TABLE IF EXISTS tweets;
DROP TABLE IF EXISTS accounts;


--CREATE TABLES

CREATE TABLE accounts
(
        account_id serial,
        user_id int NOT NULL,
        username varchar(28) NOT NULL,
        accountname varchar(28) NOT NULL,
        
        constraint pk_account primary key (account_id),
        constraint fk_user_account foreign key (user_id) references users(user_id)
);

CREATE TABLE tweets
(
        tweet_id serial,
        account_id int NOT NULL,
        tweet_content varchar(280) NOT NULL,
        date_of_tweet date NOT NULL,
        
        constraint pk_tweet primary key (tweet_id),
        constraint fk_accounts_tweets foreign key (account_id) references accounts(account_id)
);


--INSERT STATEMENTS

START TRANSACTION;
INSERT INTO accounts (account_id, user_id, username, accountname)
VALUES (1, 1, 'testuser', 'testuser'), (2, 2, 'testadmin', 'testadmin'), (3, 3, 'matthew','matthew');

START TRANSACTION;
INSERT INTO tweets (tweet_id, account_id, tweet_content, date_of_tweet)
VALUES (1, 1, 'test tweet from user', CURRENT_DATE), (2, 3, 'hey, its ya boi', CURRENT_DATE);

SELECT *
from tweets;
COMMIT;
