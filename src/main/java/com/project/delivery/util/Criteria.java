package com.project.delivery.util;

import lombok.Data;

@Data
public class Criteria {
	
	private int page; //조회하는 페이지
	private int amount; //데이터 개수
	
	//검색에 필요한 키워드를 선언
	private String searchName;
	private String searchContent;
	private String searchPrice;
	private String startDate;
	private String endDate;
	
	//기본생성자로 만들어지면 1, 10 기본 값
	public Criteria() {
		this.page = 1;
		this.amount = 10;
	}

	//기본생성자가 아니면 값을 전달 받음
	public Criteria(int page, int amount) {
		this.page = page;
		this.amount = amount;
	}
	
	//페이지 시작을 지정하는 getter
	public int getPageStart() {
		return (page - 1) * amount;
	}


	
	

}
