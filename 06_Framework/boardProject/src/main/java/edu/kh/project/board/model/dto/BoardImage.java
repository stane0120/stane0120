package edu.kh.project.board.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardImage {
	private int imageNo;
	private String imagePath;
	private String imageReName;
	private String imageOriginal;
	private int imageOrder;
	private int boardNo;
	
	public BoardImage() {
		super();
		this.imageNo = imageNo;
		this.imagePath = imagePath;
		this.imageReName = imageReName;
		this.imageOriginal = imageOriginal;
		this.imageOrder = imageOrder;
		this.boardNo = boardNo;
	}

	public int getImageNo() {
		return imageNo;
	}
	public void setImageNo(int imageNo) {
		this.imageNo = imageNo;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getImageReName() {
		return imageReName;
	}
	public void setImageReName(String imageReName) {
		this.imageReName = imageReName;
	}
	public String getImageOriginal() {
		return imageOriginal;
	}
	public void setImageOriginal(String imageOriginal) {
		this.imageOriginal = imageOriginal;
	}
	public int getImageOrder() {
		return imageOrder;
	}
	public void setImageOrder(int imageOrder) {
		this.imageOrder = imageOrder;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	@Override
	public String toString() {
		return "BoardImage [imageNo=" + imageNo + ", imagePath=" + imagePath + ", imageReName=" + imageReName
				+ ", imageOriginal=" + imageOriginal + ", imageOrder=" + imageOrder + ", boardNo=" + boardNo + "]";
	}
}
