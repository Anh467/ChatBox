USE [master]
GO
/****** Object:  Database [chat]    Script Date: 5/6/2023 7:56:02 PM ******/
CREATE DATABASE [chat]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'chat', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.TCNJK\MSSQL\DATA\chat.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'chat_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.TCNJK\MSSQL\DATA\chat_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [chat] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [chat].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [chat] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [chat] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [chat] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [chat] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [chat] SET ARITHABORT OFF 
GO
ALTER DATABASE [chat] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [chat] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [chat] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [chat] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [chat] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [chat] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [chat] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [chat] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [chat] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [chat] SET  ENABLE_BROKER 
GO
ALTER DATABASE [chat] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [chat] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [chat] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [chat] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [chat] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [chat] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [chat] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [chat] SET RECOVERY FULL 
GO
ALTER DATABASE [chat] SET  MULTI_USER 
GO
ALTER DATABASE [chat] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [chat] SET DB_CHAINING OFF 
GO
ALTER DATABASE [chat] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [chat] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [chat] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [chat] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'chat', N'ON'
GO
ALTER DATABASE [chat] SET QUERY_STORE = OFF
GO
USE [chat]
GO
/****** Object:  UserDefinedFunction [dbo].[getTextBox]    Script Date: 5/6/2023 7:56:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE function [dbo].[getTextBox] ( @user_idd varchar(11) )
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
GO
/****** Object:  Table [dbo].[comment]    Script Date: 5/6/2023 7:56:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[comment](
	[user_id] [varchar](11) NULL,
	[post_id] [varchar](11) NULL,
	[ID_COMMENT] [int] IDENTITY(1,1) NOT NULL,
	[comment_id]  AS ('COM'+right('00000000'+CONVERT([varchar](8),[ID_COMMENT]),(8))) PERSISTED NOT NULL,
	[comment_time] [datetime] NULL,
	[voted_count] [int] NULL,
	[comment_content] [varchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[comment_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[post]    Script Date: 5/6/2023 7:56:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[post](
	[user_id] [varchar](11) NULL,
	[ID_POST] [int] IDENTITY(1,1) NOT NULL,
	[post_id]  AS ('POS'+right('00000000'+CONVERT([varchar](8),[ID_POST]),(8))) PERSISTED NOT NULL,
	[post_content] [varchar](max) NULL,
	[post_status] [int] NULL,
	[post_date] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[post_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[userBoxchat]    Script Date: 5/6/2023 7:56:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[userBoxchat](
	[user_id] [varchar](11) NULL,
	[chat_text] [nvarchar](max) NULL,
	[status] [bit] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[userRelation]    Script Date: 5/6/2023 7:56:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[userRelation](
	[user_id1] [varchar](11) NOT NULL,
	[user_id2] [varchar](11) NOT NULL,
	[status] [tinyint] NULL,
PRIMARY KEY CLUSTERED 
(
	[user_id1] ASC,
	[user_id2] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[users]    Script Date: 5/6/2023 7:56:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[user_id]  AS ('UID'+right('00000000'+CONVERT([varchar](8),[ID]),(8))) PERSISTED NOT NULL,
	[user_name] [nvarchar](127) NULL,
	[user_mail] [varchar](255) NULL,
	[avatar_url] [varchar](1027) NULL,
	[introduce] [varchar](255) NULL,
	[user_account] [varchar](127) NULL,
	[user_password] [char](97) NULL,
	[created_at] [datetime] NULL,
	[user_dob] [date] NULL,
	[follower] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[vote]    Script Date: 5/6/2023 7:56:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[vote](
	[user_id] [varchar](11) NOT NULL,
	[comment_id] [varchar](11) NOT NULL,
	[vote_status] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[user_id] ASC,
	[comment_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[comment] ON 

INSERT [dbo].[comment] ([user_id], [post_id], [ID_COMMENT], [comment_time], [voted_count], [comment_content]) VALUES (N'UID00000001', N'POS00000005', 9, CAST(N'2023-05-06T09:13:34.793' AS DateTime), 5, N'chang con gi nua')
INSERT [dbo].[comment] ([user_id], [post_id], [ID_COMMENT], [comment_time], [voted_count], [comment_content]) VALUES (NULL, N'POS00000005', 11, CAST(N'2023-05-06T09:47:57.533' AS DateTime), 100, N'hello 5 again')
INSERT [dbo].[comment] ([user_id], [post_id], [ID_COMMENT], [comment_time], [voted_count], [comment_content]) VALUES (N'UID00000001', N'POS00000005', 15, CAST(N'2023-05-06T09:50:35.440' AS DateTime), 7, N'hello 5')
INSERT [dbo].[comment] ([user_id], [post_id], [ID_COMMENT], [comment_time], [voted_count], [comment_content]) VALUES (N'UID00000002', N'POS00000005', 16, CAST(N'2023-05-06T13:59:28.890' AS DateTime), 1, N'check')
SET IDENTITY_INSERT [dbo].[comment] OFF
GO
SET IDENTITY_INSERT [dbo].[post] ON 

INSERT [dbo].[post] ([user_id], [ID_POST], [post_content], [post_status], [post_date]) VALUES (N'UID00000001', 5, N'hello@#&Hi there! How can I help you@#&ad@#&test1@#&test2@#&@#&', 1, CAST(N'2023-05-06' AS Date))
INSERT [dbo].[post] ([user_id], [ID_POST], [post_content], [post_status], [post_date]) VALUES (N'UID00000001', 7, N'how are you@#&I''m doing well, thank you. How about you@#&@#&a@#&@#&@#&', 1, CAST(N'2023-05-06' AS Date))
SET IDENTITY_INSERT [dbo].[post] OFF
GO
INSERT [dbo].[userBoxchat] ([user_id], [chat_text], [status]) VALUES (N'UID00000001', N'/&how are you&//*

I''m doing well, thank you. How about you?*//&write a song 200 words&//*

Verse 1

I''m feeling so alone,
I''m searching for a home,
I''m looking for a place to belong.
I''m feeling so confused,
I''m searching for the truth,
I''m looking for a way to move on.

Chorus

I''m gonna keep on trying,
I''m gonna keep on fighting,
I''m gonna keep on searching for a way.
I''m gonna keep on hoping,
I''m gonna keep on dreaming,
I''m gonna keep on searching for a way.

Verse 2

I''m feeling so lost,
I''m searching for a cause,
I''m looking for a way to be free.
I''m feeling so scared,
I''m searching for a way,
I''m looking for a way to believe.

Chorus

I''m gonna keep on trying,
I''m gonna keep on fighting,
I''m gonna keep on searching for a way.
I''m gonna keep on hoping,
I''m gonna keep on dreaming,
I''m gonna keep on searching for a way.

Bridge

I''m gonna keep on searching,
I''m gonna keep on believing,
I''m gonna keep on searching for a way.
I''m gonna keep on searching,
I''m gonna keep on believing,
I''m gonna keep on searching for a way.

Verse 3

I''m feeling so weak,
I''m searching for a strength,
I''m looking for a way to be strong.
I''m feeling so tired,
I''m searching for a light,
I''m looking for a way to move on.

Chorus

I''m gonna keep on trying,
I''m gonna keep on fighting,
I''m gonna keep on searching for a way.
I''m gonna keep on hoping,
I''m gonna keep on dreaming,
I''m gonna keep on searching for a way.*//&hello&//*

Hi there! How can I help you?*/', 0)
INSERT [dbo].[userBoxchat] ([user_id], [chat_text], [status]) VALUES (N'UID00000002', N'/&what your name&//*

My name is John.*/', 0)
GO
SET IDENTITY_INSERT [dbo].[users] ON 

INSERT [dbo].[users] ([ID], [user_name], [user_mail], [avatar_url], [introduce], [user_account], [user_password], [created_at], [user_dob], [follower]) VALUES (1, N'Nguyễn Anh Việt', N'van123872000@gmail.com', N'https://hips.hearstapps.com/hmg-prod/images/womanyellingcat-1573233850.jpg', N'abc hehe', N'viet080702', N'$argon2i$v=19$m=65536,t=28,p=1$DpEvNSPwaUDDJUDfBwXENg$W1TENxDzzXutPFxY8pZi487lBT7YErXuG+eYqD67F20', CAST(N'2023-05-03T08:29:03.127' AS DateTime), CAST(N'2002-07-08' AS Date), 0)
INSERT [dbo].[users] ([ID], [user_name], [user_mail], [avatar_url], [introduce], [user_account], [user_password], [created_at], [user_dob], [follower]) VALUES (2, N'admin', N'linh04082002@gmail.com', N'', N'abc hehe', N'admin', N'$argon2i$v=19$m=65536,t=28,p=1$9hRU6i/5tNbDORe2FeikYg$ycrw7BRMiw9Ng8bXqOuSUhSLw3ddOYMzmIDJJcglF3c', CAST(N'2023-05-06T13:58:06.827' AS DateTime), CAST(N'2012-02-16' AS Date), 0)
SET IDENTITY_INSERT [dbo].[users] OFF
GO
INSERT [dbo].[vote] ([user_id], [comment_id], [vote_status]) VALUES (N'UID00000002', N'COM00000009', 1)
INSERT [dbo].[vote] ([user_id], [comment_id], [vote_status]) VALUES (N'UID00000002', N'COM00000015', 1)
INSERT [dbo].[vote] ([user_id], [comment_id], [vote_status]) VALUES (N'UID00000002', N'COM00000016', 1)
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__users__959D86A7A15D1950]    Script Date: 5/6/2023 7:56:02 PM ******/
ALTER TABLE [dbo].[users] ADD UNIQUE NONCLUSTERED 
(
	[user_account] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[comment] ADD  DEFAULT (getdate()) FOR [comment_time]
GO
ALTER TABLE [dbo].[comment] ADD  DEFAULT ((0)) FOR [voted_count]
GO
ALTER TABLE [dbo].[post] ADD  DEFAULT ((1)) FOR [post_status]
GO
ALTER TABLE [dbo].[post] ADD  DEFAULT (getdate()) FOR [post_date]
GO
ALTER TABLE [dbo].[users] ADD  DEFAULT ((0)) FOR [follower]
GO
ALTER TABLE [dbo].[comment]  WITH CHECK ADD  CONSTRAINT [fk_comment_post_id] FOREIGN KEY([post_id])
REFERENCES [dbo].[post] ([post_id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[comment] CHECK CONSTRAINT [fk_comment_post_id]
GO
ALTER TABLE [dbo].[comment]  WITH CHECK ADD  CONSTRAINT [fk_comment_user_id] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[comment] CHECK CONSTRAINT [fk_comment_user_id]
GO
ALTER TABLE [dbo].[post]  WITH CHECK ADD  CONSTRAINT [fk_user_id_post] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[post] CHECK CONSTRAINT [fk_user_id_post]
GO
ALTER TABLE [dbo].[userBoxchat]  WITH CHECK ADD  CONSTRAINT [fk_user_id_userBoxchat] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[userBoxchat] CHECK CONSTRAINT [fk_user_id_userBoxchat]
GO
ALTER TABLE [dbo].[userRelation]  WITH CHECK ADD  CONSTRAINT [fk_user_id1_userRelation] FOREIGN KEY([user_id1])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[userRelation] CHECK CONSTRAINT [fk_user_id1_userRelation]
GO
ALTER TABLE [dbo].[userRelation]  WITH CHECK ADD  CONSTRAINT [fk_user_id2_userRelation] FOREIGN KEY([user_id2])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[userRelation] CHECK CONSTRAINT [fk_user_id2_userRelation]
GO
ALTER TABLE [dbo].[vote]  WITH CHECK ADD  CONSTRAINT [fk_vote_user_id] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[vote] CHECK CONSTRAINT [fk_vote_user_id]
GO
ALTER TABLE [dbo].[vote]  WITH CHECK ADD  CONSTRAINT [fk_vote_vote_id] FOREIGN KEY([comment_id])
REFERENCES [dbo].[comment] ([comment_id])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[vote] CHECK CONSTRAINT [fk_vote_vote_id]
GO
ALTER TABLE [dbo].[userRelation]  WITH CHECK ADD CHECK  (([status]=(2) OR [status]=(1) OR [status]=(0)))
GO
ALTER TABLE [dbo].[userRelation]  WITH CHECK ADD CHECK  (([user_id1]<[user_id2]))
GO
USE [master]
GO
ALTER DATABASE [chat] SET  READ_WRITE 
GO
