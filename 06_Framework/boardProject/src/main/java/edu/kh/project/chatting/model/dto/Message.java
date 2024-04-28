package edu.kh.project.chatting.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message {
    private int messageNo;
    private String messageContent;
    private String readFlag;
    private int senderNo;
    private int targetNo;
    private int chattingNo;
    private String sendTime;
    
	public Message(int messageNo, String messageContent, String readFlag, int senderNo, int targetNo, int chattingNo,
			String sendTime) {
		super();
		this.messageNo = messageNo;
		this.messageContent = messageContent;
		this.readFlag = readFlag;
		this.senderNo = senderNo;
		this.targetNo = targetNo;
		this.chattingNo = chattingNo;
		this.sendTime = sendTime;
	}
	
	public int getMessageNo() {
		return messageNo;
	}
	public void setMessageNo(int messageNo) {
		this.messageNo = messageNo;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getReadFlag() {
		return readFlag;
	}
	public void setReadFlag(String readFlag) {
		this.readFlag = readFlag;
	}
	public int getSenderNo() {
		return senderNo;
	}
	public void setSenderNo(int senderNo) {
		this.senderNo = senderNo;
	}
	public int getTargetNo() {
		return targetNo;
	}
	public void setTargetNo(int targetNo) {
		this.targetNo = targetNo;
	}
	public int getChattingNo() {
		return chattingNo;
	}
	public void setChattingNo(int chattingNo) {
		this.chattingNo = chattingNo;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	
	@Override
	public String toString() {
		return "Message [messageNo=" + messageNo + ", messageContent=" + messageContent + ", readFlag=" + readFlag
				+ ", senderNo=" + senderNo + ", targetNo=" + targetNo + ", chattingNo=" + chattingNo + ", sendTime="
				+ sendTime + "]";
	}
}
