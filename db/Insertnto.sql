insert into dbo.users
(
    user_name
  , user_mail
  , avatar_url
  , introduce
  , follower
)
values
(   N'Nguyễn Anh Việt' -- user_name - nvarchar(127)
  , 'van123872000@gmail.com'  -- user_mail - varchar(255)
  , 'https://hips.hearstapps.com/hmg-prod/images/womanyellingcat-1573233850.jpg'  -- avatar_url - varchar(1027)
  , 'abc hehe'  -- introduce - varchar(255)
  , 0   -- follower - int
    )
insert into dbo.userInfor
(
    user_id
  , user_dob
  , study_at
  , work_at
  , favorites
  , created_at
)
values
(   'UID00000002'        -- user_id - varchar(11)
<<<<<<< HEAD
  , '2002-07-08' -- user_dob - date
  , 'fpt'        -- study_at - varchar(127)
  , 'fpt'        -- work_at - varchar(127)
  , 'badminton'        -- favorites - varchar(255)
  , getdate() -- created_at - datetime
    )
insert into dbo.userAccount
(
    user_id
  , user_account
  , user_password
)
values
(   'UID00000002' -- user_id - varchar(11)
  , 'viet080702' -- user_account - varchar(127)
  , '$argon2i$v=19$m=65536,t=28,p=1$DpEvNSPwaUDDJUDfBwXENg$W1TENxDzzXutPFxY8pZi487lBT7YErXuG+eYqD67F20' -- user_password - varchar(100)
    )
	
=======
  , getdate() -- user_dob - date
  , ''        -- study_at - varchar(127)
  , ''        -- work_at - varchar(127)
  , ''        -- favorites - varchar(255)
  , getdate() -- created_at - datetime
    )
>>>>>>> 28d2eb9c61d3d8f51d3e930809c0976fa8e51c62
