package com.sist.web.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
 * FNO int 
POSTER text 
NAME text 
TYPE text 
ADDRESS text 
PHONE text 
SCORE double 
THEME text 
PRICE text 
TIME text 
SEAT text 
CONTENT text 
LINK text 
HIT int 
LIKE_COUNT int 
RDAY text 
JJIMCOUNT int 
LIKECOUNT int

       => JPA
          클래스 객체 <==> 테이블 Mapping ==> 클래스 객체 => Entity
          ======== JOIN / SubQuery
          MyBatis
 * */
@Entity
@Table(name = "food_house")
@Data
public class FoodEntity {
	@Id
	private int fno;
	private int jjimcount,likecount,hit;
	private String poster,name,type,address,phone,theme,price,time,seat,content;
	private double score;
}
