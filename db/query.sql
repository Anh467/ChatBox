
CREATE function getTextBox ( @user_idd varchar(11) )
RETURNS VARCHAR(max)
AS
BEGIN
declare @text VARCHAR(max)
select @text= chat_text from(
	select chat_text
from dbo.userBoxchat
where user_id= @user_idd
) as temp
RETURN @text;
END;

select * from dbo.userAccount
where user_account='viet080702'

select * from dbo.userAccount
where user_id='UID00000002'

update dbo.userBoxchat
set chat_text='abc'
where user_id='abc'



--insert khi table tồn tại còn k update
DECLARE @user_id varchar(11);
SET @user_id = 'UID00000002';
DECLARE @chat_text nvarchar(max);
DECLARE @text nvarchar(max);
set @chat_text= 'I love you too!';
set @text= (
	select chat_text
from dbo.userBoxchat
where user_id= @user_id
) 
set @text= @text +@chat_text
  IF EXISTS(SELECT chat_text FROM dbo.userBoxchat WHERE user_id= @user_id)
	update dbo.userBoxchat
	set chat_text=@text
	where user_id=@user_id;
else insert into dbo.userBoxchat
values
(   @user_id   -- user_id - varchar(11)
  , @chat_text-- chat_text - varbinary(max)
  , 0 -- status - bit
    )
--get chattext

select *
from userBoxchat
where user_id= 'UID00000002';


--clearchat text
update dbo.userBoxchat
SET  chat_text= ''
where user_id= 'UID00000002';

--create post
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
  , '2002-07-08' -- user_dob - date
  , 'fpt'        -- study_at - varchar(127)
  , 'fpt'        -- work_at - varchar(127)
  , 'badminton'        -- favorites - varchar(255)
  , getdate() -- created_at - datetime
    )
	select *
	from dbo.userInfor