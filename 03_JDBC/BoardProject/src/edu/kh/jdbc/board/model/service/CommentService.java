package edu.kh.jdbc.board.model.service;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.board.model.dto.Board;
import edu.kh.jdbc.board.model.dto.Comment;

public class CommentService {

	/** 댓글 생성
	 * @param string
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public static int insertComment(String boardTitle, int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		
		int result = dao.insertComment(conn, boardTitle, memberNo);
	
	
		if(result > 0) {
			commit(conn);
			result = memberNo;		
	    } else {
	    	rollback(conn);
	    }
		
		close(conn);
		
		return result;
	}

	public static int updateComment(String commentNo, String commentContent) throws Exception {
		
		Connection conn = getconnection();
		
		int result = dao.updateComment(conn, commentNo, commentContent);
		
		if(result > 0) commit(conn);
		else           rollback(conn);
		
		return result;
	}

	public static int deleteComment(int commentNo) {
		
		Connection conn = getconnection();
		
		int result = dao.deleteComment(conn, boardNo)
		
		return result;
	}


	
	
	
	


}
