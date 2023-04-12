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
  , getdate() -- user_dob - date
  , ''        -- study_at - varchar(127)
  , ''        -- work_at - varchar(127)
  , ''        -- favorites - varchar(255)
  , getdate() -- created_at - datetime
    )