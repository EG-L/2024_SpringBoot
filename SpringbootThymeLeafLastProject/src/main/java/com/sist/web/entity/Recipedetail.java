package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * NO int 
POSTER text 
TITLE text 
CHEF text 
CHEF_POSTER text 
CHEF_PROFILE text 
INFO1 text 
INFO2 text 
INFO3 text 
CONTENT text 
FOODMAKE text 
STUFF text
 * */
@Entity
@Data //VO => 지정된 테이블과 컬럼이 일치 => insert,update,delete
//추가되는 데이터가 없어야 한다.
public class Recipedetail {
	@Id
	private int no;
	private String poster,title,chef,chef_poster,chef_profile,info1,info2,info3,content,foodmake,stuff;
}
