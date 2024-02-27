package com.sist.web.vo;

import lombok.Data;
/*
 * 		ORACLE              MYSQL
 *      NUMBER              int , double
 *      VARCHAR2            VARCHAR
 *      CLOB                TEXT
 *      
 *      => 인라인뷰 (페이지) ==> LIMIT 시작,갯수
 *         => rownum (1)      (0)
 *      => ANSI조인을 이용한다.
 *      => 시퀀스 ===========> create table a
 *                           (
 *                           	no int auto_increment
 *                           );
 * */
@Data
public class FoodVO {
	private int fno,hit;
	private String poster,name,type,address,phone,theme,price,time,seat;
	private double score;
}
