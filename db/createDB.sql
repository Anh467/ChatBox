CREATE DATABASE chat;
--done
--drop database chat
CREATE TABLE users (
ID INT IDENTITY(1,1) NOT NULL,
  user_id AS 'UID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) persisted PRIMARY KEY,
  user_name NVARCHAR(127),
  user_mail VARCHAR(255),
  avatar_url VARCHAR(1027),
  introduce VARCHAR(255),
  user_account VARCHAR(127) unique,
  user_password char(97),
  created_at datetime,
   user_dob DATE,
  follower int default 0
);



--0 user_id1 ->  user_id2
--1 user_id1 <-  user_id2
--2 user_id1 <-> user_id2
CREATE TABLE userRelation (
  user_id1 varchar(11),
  user_id2 varchar(11),
  status TINYINT CHECK (status IN (0,1,2)),
  PRIMARY KEY (user_id1, user_id2),
  CHECK (user_id1 < user_id2),
  constraint fk_user_id1_userRelation foreign key (user_id1) references dbo.users(user_id),
  constraint fk_user_id2_userRelation foreign key (user_id2) references dbo.users(user_id),
);

CREATE TABLE userBoxchat (
  user_id varchar(11),
  chat_text nvarchar(max),
  status BIT,
  -- status 0: chat_text là của user
  -- status 1: chat_text là của chatbox
  constraint fk_user_id_userBoxchat foreign key (user_id) references dbo.users(user_id),
);


CREATE TABLE post (
	user_id varchar(11),
		ID_POST INT IDENTITY(1,1) NOT null,
	post_id AS 'POS' + RIGHT('00000000' + CAST(ID_POST AS VARCHAR(8)), 8) persisted PRIMARY KEY,
	post_content VARCHAR(max),
	post_status INT DEFAULT 1,
	post_date DATE DEFAULT GETDATE(),
	constraint fk_user_id_post  foreign key (user_id) references dbo.users(user_id),
);
CREATE TABLE comment (
  user_id varchar(11),
  post_id varchar(11),
  ID_COMMENT INT IDENTITY(1,1) NOT NULL,
  comment_id AS 'COM' + RIGHT('00000000' + CAST(ID_COMMENT AS VARCHAR(8)), 8) persisted primary key,
  comment_time DATETIME DEFAULT GETDATE(),
  voted_count INT DEFAULT 0,
  constraint fk_comment_user_id foreign key (user_id) references dbo.users(user_id),
  constraint fk_comment_post_id foreign key (post_id) references dbo.post(post_id),
);

CREATE TABLE vote (
  user_id varchar(11),
  comment_id varchar(11),
  vote_status BIT NOT NULL,
-- 0 vote down, 1 vote up
  PRIMARY KEY (user_id, comment_id),
  constraint fk_vote_user_id foreign key (user_id) references dbo.users(user_id),
  constraint fk_vote_vote_id foreign key (comment_id) references dbo.comment(comment_id),
);

INSERT INTO dbo.post
(
    user_id,
    post_content,
    post_status
)
VALUES
(   'UID00000001',       -- user_id - varchar(11)
    'badkjbas',       -- post_content - varchar(max)
    0			      -- post_status - int
    )
----------------------------------------TRIGGER---------------------------------------
-- TRIGGER INSERT AFTER dbo.post: khi thuộc tính date của post hết hạn 3 ngày thì sẽ update thuộc tính status của dbo.post thành 0
-- TRIGGER INSERT/ UPDATE: nếu insert dbo.vote vào db thì sẽ +/- thuộc tính vote_count của table dbo.comment dựa theo status là gì
