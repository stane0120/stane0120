package edu.kh.project.board.model.service;

import java.util.List;
import java.util.Map;

public interface BoardService {

	List<Map<String, Object>> selectBoardTypeList();

	// 1. 특정 게시판의 삭제되지 않은 게식 ㄹ 수 조회
	Map<String, Object> selectBoardList(int boardCode, int cp);
	
	
}
