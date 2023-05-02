insert into dbo.users
(
    user_name
  , user_mail
  , avatar_url
  , introduce
  , user_account
  , user_password
  , user_dob
  , created_at
  , follower
)
values
(   N'Nguyễn Anh Việt' -- user_name - nvarchar(127)
  , 'van123872000@gmail.com'  -- user_mail - varchar(255)
  , 'https://hips.hearstapps.com/hmg-prod/images/womanyellingcat-1573233850.jpg'  -- avatar_url - varchar(1027)
  , 'abc hehe'  -- introduce - varchar(255)
  , 'viet080702' -- user_account - varchar(127)
  , '$argon2i$v=19$m=65536,t=28,p=1$DpEvNSPwaUDDJUDfBwXENg$W1TENxDzzXutPFxY8pZi487lBT7YErXuG+eYqD67F20' -- user_password - varchar(100)
    , '2002-07-08' -- user_dob - date
	  , getdate() -- created_at - datetime
  , 0   -- follower - int
    )
