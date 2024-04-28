package edu.kh.project.board.model.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// DTO(Data Transfer Object) : 데이터 전달용 객체
// - 테이블 컬럼과 똑같이 만들 필요 없음!
// --> CRUD 시 필요한 데이터를 담을 수 있는 형태

@Getter
@Setter
@ToString
public class Board {
    private int boardNo;
    private String boardTitle;
    private String boardContent;
    private String boardCreateDate;
    private String boardUpdateDate;
    private int readCount;
    private int boardCode;
    
    
    // 서브쿼리
    private int commentCount; // 댓글 수
    private int likeCount;    // 좋아요 수
    
    // 회원 join
    private String memberNickname; // 
    private int memberNo;
    private String profileImage;
    
    // BOARD_IMG 테이블 join
    private String thumbnail;
    
   
    // 이미지 목록
    private List<BoardImage> imageList;
    
    // 댓글 목록
    private List<Comment> commentList;

	public Board(int boardNo, String boardTitle, String boardContent, String boardCreateDate, String boardUpdateDate,
			int readCount, int boardCode, int commentCount, int likeCount, String memberNickname, int memberNo,
			String profileImage, String thumbnail, List<BoardImage> imageList, List<Comment> commentList) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardCreateDate = boardCreateDate;
		this.boardUpdateDate = boardUpdateDate;
		this.readCount = readCount;
		this.boardCode = boardCode;
		this.commentCount = commentCount;
		this.likeCount = likeCount;
		this.memberNickname = memberNickname;
		this.memberNo = memberNo;
		this.profileImage = profileImage;
		this.thumbnail = thumbnail;
		this.imageList = imageList;
		this.commentList = commentList;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardCreateDate() {
		return boardCreateDate;
	}

	public void setBoardCreateDate(String boardCreateDate) {
		this.boardCreateDate = boardCreateDate;
	}

	public String getBoardUpdateDate() {
		return boardUpdateDate;
	}

	public void setBoardUpdateDate(String boardUpdateDate) {
		this.boardUpdateDate = boardUpdateDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public int getBoardCode() {
		return boardCode;
	}

	public void setBoardCode(int boardCode) {
		this.boardCode = boardCode;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<BoardImage> getImageList() {
		return imageList;
	}

	public void setImageList(List<BoardImage> imageList) {
		this.imageList = imageList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardCreateDate=" + boardCreateDate + ", boardUpdateDate=" + boardUpdateDate + ", readCount="
				+ readCount + ", boardCode=" + boardCode + ", commentCount=" + commentCount + ", likeCount=" + likeCount
				+ ", memberNickname=" + memberNickname + ", memberNo=" + memberNo + ", profileImage=" + profileImage
				+ ", thumbnail=" + thumbnail + ", imageList=" + imageList + ", commentList=" + commentList + "]";
	}
}
