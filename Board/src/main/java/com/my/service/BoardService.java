package com.my.service;

import java.util.ArrayList;

import com.my.dto.BoardDto;

public interface BoardService {
	ArrayList<BoardDto> getBoardListByPageNumber(int pageNumber);
	int getLastPageNumber();
	BoardDto getBoardDetail(int bno);
	void increaseHitcount(int bno);
	void writeBoard(BoardDto dto);
	void updateBoard(int bno, String title, String content);
	void deleteBoard(int bno);
}
