package com.my.dao;

import java.util.ArrayList;

import com.my.dto.BoardDto;

public interface BoardDao {
	ArrayList<BoardDto> getAllList(int pageNum);
	int getCountAll();// 마지막 페이지 번호를 리턴
	void increaseHitcount(int bno); // 조회수 늘리기
	BoardDto selectOneBoard(int bno);
	void write(BoardDto dto); // 글쓰기
	void update(int bno, String title, String content);  // 수정하기
	void delete(int bno); //삭제하기
}
