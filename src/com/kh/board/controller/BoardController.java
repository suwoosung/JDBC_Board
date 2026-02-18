package com.kh.board.controller;

import java.util.List;

import com.kh.board.model.service.BoardService;
import com.kh.board.model.service.BoardServiceImpl;
import com.kh.board.model.vo.Board;

/* 
 * View요청에 맞는 Service를 선택하여 메서드를 실행 한 후 결과값을 돌려주는 클래스.
 * */
public class BoardController {

	// service 변수 선언 및 초기화
	private BoardService bs = new BoardServiceImpl();
	
	// view의 login요청을 담당할 메서드
	public int login(String id, String pwd) {
		return bs.login(id, pwd);
	}

	// view의 selectBoardList요청을 담당할 메서드
	public void selectBoardList() {
		List<Board> list = bs.selectBoardList();
        
        if (list.isEmpty()) {
            System.out.println("조회된 게시글이 없습니다.");
        } else {
            System.out.println("게시글 번호\t게시글 제목\t작성자\t작성시간");
            for (Board b : list) {
                System.out.println(b.getBoardNo() + "\t" + b.getBoardTitle() + "\t" + b.getBoardWriter() + "\t" + b.getCreateDate());
            }
        }
		
	}

	// view의 selectBoard요청을 담당할 메서드
	public Board selectBoard(int bNo) {
		Board b = bs.selectBoard(bNo);
		return b;
	}

	// view의 insertBoard요청을 담당할 메서드
	public int insertBoard(String title, String content, String memberId) {
		Board b = new Board();
		b.setBoardTitle(title);
		b.setBoardContent(content);
		b.setBoardWriter(memberId);
		
		return bs.insertBoard(b);
	}

	// view의 updateBoard요청을 담당할 메서드
	public int updateBoard(int bNo, String title, String content) {
		Board b = new Board();
		b.setBoardNo(bNo);
		b.setBoardTitle(title);
		b.setBoardContent(content);
		
		return bs.updateBoard(bNo, b);
	}

	// view의 deleteBoard요청을 담당할 메서드
	public int deleteBoard(int bNo) {
		return bs.deleteBoard(bNo);
	}
}
