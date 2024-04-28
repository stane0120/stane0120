package edu.kh.project.chatting.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChattingRoom {
    private int chattingNo;
    private String lastMessage;
    private String sendTime;
    private int targetNo;
    private String targetNickName;
    private String targetProfile;
    private int notReadCount;
    
	public ChattingRoom(int chattingNo, String lastMessage, String sendTime, int targetNo, String targetNickName,
			String targetProfile, int notReadCount) {
		super();
		this.chattingNo = chattingNo;
		this.lastMessage = lastMessage;
		this.sendTime = sendTime;
		this.targetNo = targetNo;
		this.targetNickName = targetNickName;
		this.targetProfile = targetProfile;
		this.notReadCount = notReadCount;
	}

	public int getChattingNo() {
		return chattingNo;
	}

	public void setChattingNo(int chattingNo) {
		this.chattingNo = chattingNo;
	}

	public String getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(String lastMessage) {
		this.lastMessage = lastMessage;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public int getTargetNo() {
		return targetNo;
	}

	public void setTargetNo(int targetNo) {
		this.targetNo = targetNo;
	}

	public String getTargetNickName() {
		return targetNickName;
	}

	public void setTargetNickName(String targetNickName) {
		this.targetNickName = targetNickName;
	}

	public String getTargetProfile() {
		return targetProfile;
	}

	public void setTargetProfile(String targetProfile) {
		this.targetProfile = targetProfile;
	}

	public int getNotReadCount() {
		return notReadCount;
	}

	public void setNotReadCount(int notReadCount) {
		this.notReadCount = notReadCount;
	}

	@Override
	public String toString() {
		return "ChattingRoom [chattingNo=" + chattingNo + ", lastMessage=" + lastMessage + ", sendTime=" + sendTime
				+ ", targetNo=" + targetNo + ", targetNickName=" + targetNickName + ", targetProfile=" + targetProfile
				+ ", notReadCount=" + notReadCount + "]";
	}
}
