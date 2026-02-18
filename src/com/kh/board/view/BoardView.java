package com.kh.board.view;

import java.util.Scanner;

import com.kh.board.controller.BoardController;
<<<<<<< HEAD
import com.kh.board.model.vo.Board;
=======
>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git

public class BoardView {
	// 입력을 위한 Scanner변수 선언 및 초기화
	// 기능 실행을 위한 BoardController 변수 선언 및 초기화.
	Scanner sc = new Scanner(System.in);
	BoardController bc = new BoardController();
	String memberId = null;
	private Scanner sc = new Scanner(System.in);
	private BoardController mc = new BoardController();

	/**
	 * 로그인 기능. 사용자에게 로그인을 할 계정의 ID와, PWD를 입력받고 로그인 요청을 보내는 메소드 로그인 성공시 mainMenu를 호출,
	 * 로그인 실패시 ID,PWD를 다시 입력받음. 로그인 성공시 memberId에 사용자의 id를 저장.
	 */
	public void login() {
		while (true) {
<<<<<<< HEAD
			System.out.println("### 게시판 서비스 ###");
			System.out.println("서비스 이용을 위해 로그인을 진행해주세요.");
			System.out.print("ID : ");
			String id = sc.nextLine();
			System.out.print("PWD : ");
			String pwd = sc.nextLine();

			int result = bc.login(id, pwd);

			if (result > 0) {
				System.out.println("로그인 성공!");
				this.memberId = id;
				mainMenu();
				break;
			} else {
				System.out.println("로그인 실패. 다시 입력해주세요.");
			}
		}		
=======
			System.out.println("### 게시판 서비스###");
			System.out.println("서비스 이용을 위해 로그인을 진행해주세요.");
			System.out.print("ID :");
			int id = sc.nextInt();
			
			System.out.print("PWD :");
			int pwd = sc.nextInt();
			
			int userId = 1234;
			int userPwd = 0000;
			
			if(id==userId && pwd==userPwd) {
				mainMenu();
				break;
			} 
		}
>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git
	}

	/**
	 * 메인메뉴 사용자에게 서비스중인 기능목록을 보여준후 , 정수형태로 서비스 번호를 입력받아 원하는 서비스를 제공해주는 메소드.
	 */
	public void mainMenu() {
<<<<<<< HEAD
		
		while (true) {
			System.out.println("\n### 게시판 서비스 ###");
=======

		while (true) {
			System.out.println("### 게시판 서비스 ###");
>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git
			System.out.println("1. 게시판 목록 보기 ");
			System.out.println("2. 게시판 상세보기");
			System.out.println("3. 게시판 등록하기");
			System.out.println("4. 게시판 수정하기");
			System.out.println("5. 게시판 삭제하기");
			System.out.println("9. 끝");
<<<<<<< HEAD
			System.out.print("메뉴 선택 : ");
			
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: selectBoardList(); break;
			case 2: selectBoard(); break;
			case 3: insertBoard(); break;
			case 4: updateBoard(); break;
			case 5: deleteBoard(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못된 번호입니다.");
			}
=======
			int menu = Integer.parseInt(sc.nextLine());

            switch(menu){
            case 1: selectBoardList(); break;
            case 2: selectBoard(); break;
            case 3: insertBoard(); break;
            case 4: updateBoard(); break;
            case 5: deleteBoard(); break;
            case 9: System.out.println("프로그램을 종료합니다.."); return;
            default : System.out.println("잘못된 메뉴를 선택했습니다. 다시입력해주세요.");
            }
>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git
		}
	}

	/**
	 * 게시글 목록 조회 메서드 게시판에 존재하는 게시글 정보를 모두 출력하는 메서드. 게시글의 번호, 제목, 작성자, 작성시간 출력
	 */
	public void selectBoardList() {
		System.out.println("게시글 번호\t게시글 제목\t작성자\t작성시간");
		bc.selectBoardList();
	}

	/**
	 * 게시글 상세 조회 메서드 사용자로 하여금 게시글 번호를 입력받아 게시글 정보를 요청 한 후, 전달 받은 게시글정보를 출력하는 메소드.
	 * 
<<<<<<< HEAD
	 * */
	public int selectBoard() {
		
		System.out.print("조회할 게시글 번호 입력 : ");
	    int bNo = sc.nextInt();
	    sc.nextLine();

	    Board b = bc.selectBoard(bNo);

	    if (b != null) {
	        System.out.println("게시글 번호\t게시글 제목\t게시글 작성 날짜");
	        System.out.println(b.getBoardNo() + "\t" + b.getBoardTitle() + "\t" + b.getCreateDate());
	        System.out.println("게시글 내용");
	        System.out.println(b.getBoardContent());
	    } else {
	        System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
	    }
=======
	 */
	public void selectBoard() {

		System.out.println("게시글 번호\t게시글 제목\t게시글 작성 날짜");

		System.out.println("게시글 내용");
>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git
	}

	/**
	 * 게시글 등록 메서드 사용자로 하여금 게시글 제목과, 내용을 입력받아 게시글을 등록요청을 보내는 메소드
	 */
	public void insertBoard() {
<<<<<<< HEAD
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		bc.insertBoard(title, content, memberId);
=======

>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git
	}

	/**
	 * 게시글 수정 메소드 사용자로 하여금 수정할 게시글 제목 번호과 내용을 입력받아 게시글 수정요청을 보내는 메소드
	 */
	public void updateBoard() {
<<<<<<< HEAD
		System.out.print("수정할 게시글 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		System.out.print("수정할 제목 : ");
		String title = sc.nextLine();
		System.out.print("수정할 내용 : ");
		String content = sc.nextLine();
		bc.updateBoard(bNo, title, content);
=======

>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git
	}

	/**
	 * 게시글 삭제 메소드 사용자로 하여금 삭제할 게시글 번호를 입력받아 게시글 삭제 요청을 보내는 메소드
	 */
	public void deleteBoard() {
<<<<<<< HEAD
		System.out.print("삭제할 게시글 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		bc.deleteBoard(bNo);
=======

>>>>>>> branch 'main' of https://github.com/suwoosung/JDBC_Board.git
	}

}
