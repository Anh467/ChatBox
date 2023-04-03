insert into dbo.users
values
('Nguyen Anh Viet', 'van123872000@gmail.com', 'https://static01.nyt.com/images/2022/08/24/science/00SCI-SPIDERLIES-01/00SCI-SPIDERLIES-01-jumbo.jpg?quality=75&auto=webp', 'EYE of the STORM');
insert into dbo.userInfor
values
(   '4084eb8f-5db4-4685-a907-541cee494688'      -- user_id - uniqueidentifier
  , '2002-07-08' -- user_dob - date
  , 'fpt'        -- study_at - varchar(127)
  , 'fpt'        -- work_at - varchar(127)
  , 'game game game'        -- favorites - varchar(255)
  , getdate() -- created_at - datetime
    )
insert into dbo.userAccount
(
    user_id
  , user_account
  , user_password
)
values
(   '4084eb8f-5db4-4685-a907-541cee494688' -- user_id - uniqueidentifier
  , 'nguyenanhviet'   -- user_account - varchar(127)
  , '533f91b7394a3bd14dac528ef217febebe69f80334cc8735694c2fa17e9a6a3d'   -- user_password - varchar(64)
    )
select * from dbo.userAccount
where user_account= 'nguyenanhviet' and user_password= '533f91b7394a3bd14dac528ef217febebe69f80334cc8735694c2fa17e9a6a3d'

insert into dbo.userBoxchat
(
    user_id
  , boxchat_id
)
values
(   '4084eb8f-5db4-4685-a907-541cee494688' -- user_id - uniqueidentifier
  , '4084eb8f-5db4-4685-a907-541cee494688' -- boxchat_id - uniqueidentifier
    )

insert into dbo.post
(
    user_id
  , boxchat_id
  , post_id
  , post_content
  , post_status
  , post_date
)
values
(   '4084eb8f-5db4-4685-a907-541cee494688'      -- user_id - uniqueidentifier
  , '4084eb8f-5db4-4685-a907-541cee494688'      -- boxchat_id - uniqueidentifier
  , null      -- post_id - uniqueidentifier
  , ''        -- post_content - varchar(255)
  , 0         -- post_status - int
  , getdate() -- post_date - date
    )