--CREATE DATABASE chat1;
--drop database chat
CREATE TABLE users (
  user_id uniqueidentifier DEFAULT NEWID() PRIMARY KEY,
  user_name NVARCHAR(127),
  user_mail VARCHAR(255),
  avatar_url VARCHAR(1027),
  introduce VARCHAR(255),
  follower int default 0
);

CREATE TABLE userInfor (
  user_id uniqueidentifier PRIMARY KEY REFERENCES dbo.users(user_id),
  user_dob DATE,
  study_at VARCHAR(127),
  work_at VARCHAR(127),
  favorites VARCHAR(255),
  created_at DATETIME
);

CREATE TABLE userAccount (
  user_id uniqueidentifier PRIMARY KEY REFERENCES users(user_id),
  user_account VARCHAR(127),
  user_password VARCHAR(64)
);

--0 user_id1 ->  user_id2
--1 user_id1 <-  user_id2
--2 user_id1 <-> user_id2
CREATE TABLE userRelation (
  user_id1 uniqueidentifier NOT NULL,
  user_id2 uniqueidentifier NOT NULL,
  status TINYINT CHECK (status IN (0,1,2)),
  PRIMARY KEY (user_id1, user_id2),
  FOREIGN KEY (user_id1) REFERENCES users(user_id),
  FOREIGN KEY (user_id2) REFERENCES users(user_id),
  CHECK (user_id1 < user_id2)
);

CREATE TABLE userBoxchat (
  user_id uniqueidentifier REFERENCES users(user_id) primary key,
  chat_text varbinary(max),
  status BIT,
  -- status 0: chat_text là của user
  -- status 1: chat_text là của chatbox
);


CREATE TABLE post (
	user_id uniqueidentifier NOT NULL,
	post_id uniqueidentifier DEFAULT NEWID() PRIMARY KEY,
	post_content VARCHAR(max),
	post_status INT DEFAULT 1,
	post_date DATE DEFAULT GETDATE(),
	constraint fk_post_user_id foreign key (user_id) references dbo.users(user_id),
);
CREATE TABLE comment (
  user_id uniqueidentifier NOT NULL,
  post_id uniqueidentifier NOT NULL,
  comment_id uniqueidentifier DEFAULT NEWID() primary key,
  comment_time DATETIME DEFAULT GETDATE(),
  voted_count INT DEFAULT 0,
  constraint fk_comment_user_id foreign key (user_id) references dbo.users(user_id),
  constraint fk_comment_post_id foreign key (post_id) references dbo.post(post_id),
);
CREATE TABLE vote (
  user_id uniqueidentifier NOT NULL,
  comment_id uniqueidentifier NOT NULL,
  vote_status BIT NOT NULL,
-- 0 vote down, 1 vote up
  PRIMARY KEY (user_id, comment_id),
  constraint fk_vote_user_id foreign key (user_id) references dbo.users(user_id),
   constraint fk_vote_comment_id foreign key (comment_id) references dbo.comment(comment_id),
);



----------------------------------------TRIGGER---------------------------------------
-- TRIGGER INSERT AFTER dbo.post: khi thuộc tính date của post hết hạn 3 ngày thì sẽ update thuộc tính status của dbo.post thành 0
-- TRIGGER INSERT/ UPDATE: nếu insert dbo.vote vào db thì sẽ +/- thuộc tính vote_count của table dbo.comment dựa theo status là gì
