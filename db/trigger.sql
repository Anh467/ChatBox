CREATE TRIGGER update_vote_count
ON dbo.vote
AFTER INSERT
AS
BEGIN
  UPDATE dbo.comment
  SET comment.voted_count = comment.voted_count + 1
  FROM dbo.comment
  JOIN Inserted ON Inserted.comment_id = comment.comment_id
END

CREATE TRIGGER tr_vote_deleted
ON vote
AFTER DELETE
AS
BEGIN
    UPDATE dbo.comment
    SET comment.voted_count = comment.voted_count - 1
    FROM dbo.comment
    INNER JOIN deleted ON comment.comment_id = deleted.comment_id;
END

;

UPDATE dbo.post 
SET post.post_content=?
WHERE post.post_id='POS00000005'