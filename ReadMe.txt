----------------------java--------------------------
----------------------------------------------------
		Vấn đề follow và unflow
TH: follow
thì sẽ tự update +1 lại thuộc tính follower của dbo.users và thuộc tính status của dbo.userRelation
TH: unfollow
thì sẽ tự update -1 lại thuộc tính follower của dbo.users và thuộc tính status của dbo.userRelation





----------------------database----------------------
----------------------------------------------------

/&...&/ là lưu câu hỏi của user
/*...*/ là lưu câu trả lời bot

EXAMPLE: thuộc tínhlưu trong db sẽ là 
		/&adbfasasdfbj&/
		/*qwejrqrjekwq*/
Lúc người dùng đăng nhập sẽ lấy lên db đưa lên màng hình người dùng sẽ hiện thi là: 
			adbfasasdfbj	
qwejrqrjekwq

LƯU TRONG JAVA: tạo model tên là 'converse' sẽ bao gồm 2 thuộc tính 'ask' và 'ans' là câu hỏi và câu trả lời
 


