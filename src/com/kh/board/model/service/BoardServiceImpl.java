package com.kh.board.model.service;

import java.util.List;

import com.kh.board.model.dao.BoardDao;
import com.kh.board.model.vo.Board;

// BoardService 인터페이스를 구현하는 클래스.
// 각 메서드의 설명에 맞게 기능을 작성.
public class BoardServiceImpl implements BoardService{
	
	private BoardDao bd = new BoardDao();

    @Override
    public int login(String memberId, String MemberPwd) {
        return bd.login(memberId, MemberPwd);
    }

    @Override
    public int insertBoard(Board b) {
        return bd.insertBoard(b);
    }

    @Override
    public List<Board> selectBoardList() {
        return bd.selectBoardList();
    }

    @Override
    public Board selectBoard(int boardNo) {
        return bd.selectBoard(boardNo);
    }

    @Override
    public int updateBoard(int boardNo, Board b) {
        return bd.updateBoard(boardNo, b);
    }

    @Override
    public int deleteBoard(int boardNo) {
        return bd.deleteBoard(boardNo);
    }
}
