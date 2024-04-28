package edu.kh.project.board.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Comment {
    private int commentNo;
    private String commentContent;
    private String commentCreateDate;
    private int boardNo;
    private int memberNo;
    private String commentDeleteFlag;
    private int parentNo;
    private String memberNickname;
    private String profileImage;
    
	public Comment(int commentNo, String commentContent, String commentCreateDate, int boardNo, int memberNo,
			String commentDeleteFlag, int parentNo, String memberNickname, String profileImage) {
		super();
		this.commentNo = commentNo;
		this.commentContent = commentContent;
		this.commentCreateDate = commentCreateDate;
		this.boardNo = boardNo;
		this.memberNo = memberNo;
		this.commentDeleteFlag = commentDeleteFlag;
		this.parentNo = parentNo;
		this.memberNickname = memberNickname;
		this.profileImage = profileImage;
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentCreateDate() {
		return commentCreateDate;
	}

	public void setCommentCreateDate(String commentCreateDate) {
		this.commentCreateDate = commentCreateDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getCommentDeleteFlag() {
		return commentDeleteFlag;
	}

	public void setCommentDeleteFlag(String commentDeleteFlag) {
		this.commentDeleteFlag = commentDeleteFlag;
	}

	public int getParentNo() {
		return parentNo;
	}

	public void setParentNo(int parentNo) {
		this.parentNo = parentNo;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	@Override
	public String toString() {
		return "Comment [commentNo=" + commentNo + ", commentContent=" + commentContent + ", commentCreateDate="
				+ commentCreateDate + ", boardNo=" + boardNo + ", memberNo=" + memberNo + ", commentDeleteFlag="
				+ commentDeleteFlag + ", parentNo=" + parentNo + ", memberNickname=" + memberNickname
				+ ", profileImage=" + profileImage + "]";
	}
}
