package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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