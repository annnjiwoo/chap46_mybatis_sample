package com.javalab.logging.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.javalab.logging.vo.BoardVo;

/*
 * [매퍼 인터페이스]
 *  - 서비스 Layer(ServiceImpl)와 매퍼. XML(쿼리문) 연결자 열할
 * */
@Mapper
public interface BoardMapperInterface {
	//게시물 목록 조회 메소드
	public ArrayList<BoardVo> selectBoardList();
	//한 명의 회원 조회 메소드
	public BoardVo getBoardById(int no);
	//게시물 저장 메로드
	public int insertBoard(BoardVo vo);
	//회원 수정 메소드
	public int modifyBoard(BoardVo boardVo);
	//게시물 삭제 메소드
	public int deleteBoard(int no);
	//조회수 증가 메소드
	public void updateHitCount(int no);
}
