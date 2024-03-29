package com.project.delivery.user.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.project.delivery.command.CategoryVO;
import com.project.delivery.command.UserVO;
import com.project.delivery.util.Criteria;

@Mapper
public interface UserMapper {
	
	//유저 등록
	//관리자 등록 전 user_no 불러오기 
	public ArrayList<UserVO> getAdminUser_no();
	//관리자 등록 전 
	//관리자 등록 user_no 1~100
	public int adminRegist(UserVO vo);
	//배송기사 등록 user_no 101~
	public int deliverRegist(UserVO vo);
	
	
	//유저 조회
	//관리자 조회
	public ArrayList<UserVO> getAdminList(@Param("user_type") String user_type, 
										  @Param("cri") Criteria cri);
	//배송기사 조회
	public ArrayList<UserVO> getDeliverList(@Param("user_type") String user_type, 
											@Param("cri") Criteria cri);
	//전체 페이지 조회
	public int getTotal(@Param("user_type") String user_type, 
						@Param("cri") Criteria cri);
	
	
	//user_area (대분류)
	public ArrayList<CategoryVO> getUser_area();
	//user_area_detail (중분류)
	public ArrayList<CategoryVO> getUser_area_detail(CategoryVO vo);
	
	
	//정보 불러오기 
	public UserVO getInfo(int user_no);
	//유저 수정
	public int userModify(UserVO vo);
	
	//유저 삭제 전 fk 지우기
	public void deleteFK(int user_no);
	//유저 삭제
	public void deleteUser(int user_no);
	
}
